package com.ultimateqa.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ultimateqa.baseclass.BaseClass;
import com.ultimateqa.pages.HomePage;
import com.ultimateqa.pages.LoginPage;

public class LoginPageTest extends BaseClass{

	LoginPage loginPage;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		inititalize();
		loginPage = new LoginPage();
	}
	
	@Test(priority = 1)
	public void loginPageTitleTest()
	{
		String ActualTitle = loginPage.validateLoginPageTitle();
		assertEquals(ActualTitle, "Ultimate QA");
	}
	
	@Test(priority = 2)
	public void footerDisplayTest()
	{
		boolean isFooterDisplayed = loginPage.validatePageFooter();
		assertTrue(isFooterDisplayed);
	}
	
	@Test(priority = 3)
	public void loginTest()
	{
		HomePage homepage = loginPage.validateLoginPage(prop.getProperty("username"), prop.getProperty("password"));
		assertTrue(homepage.validateSuccessfulLogin());
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
}
