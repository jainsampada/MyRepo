package com.Qa.TestBaseDemo;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	//Constructor Initilization
	public TestBase()
	{
		try
		{
			FileInputStream ip = new FileInputStream("D:\\E drive data\\Java\\JavaDemo\\com.facebook.Maven\\src\\main\\java\\com\\facebook\\configuration\\config.properties");
			prop = new Properties();
			prop.load(ip);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
	public static void initialization()
	{
		String browserName = prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty(prop.getProperty("systemproperty_1"),prop.getProperty("systemproperty_2"));
			driver = new ChromeDriver();
		}
		//Maximize Browser Window
		driver.manage().window().maximize();
		//Delete Cookies
		driver.manage().deleteAllCookies();
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		/*System.setProperty("webdriver.chrome.driver",path )
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");*/
	}
}
