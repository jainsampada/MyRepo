package com.facebook.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Qa.TestBaseDemo.TestBase;
import com.facebook.pages.LoginPage;

public class LoginPageTest extends TestBase {
	//This is Login Page Test
	LoginPage loginPage;
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeSuite
	public void setUp()
	{
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test
	public void verifyTitleTest()
	{
		
		String title = loginPage.verifyTitle();
		Assert.assertEquals(title, "Facebook – log in or sign up");
	}
	
	@Test
	public void verifyLoginTest()
	{
		
		loginPage.verifyLogin();
		//driver.navigate().back();
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}

}
