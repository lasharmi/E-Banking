package com.banking.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.banking.base.TestBase;
import com.banking.pages.HomePage;
import com.banking.pages.LoginPage;


public class LoginPageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage=new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = loginpage.validateLoginTitle();
		Assert.assertEquals(title, "Guru99 Bank Home Page");
	}
	
	@Test(priority=2)
	public void crmLogoImageTest() {
		boolean b = loginpage.validateLogo();
		Assert.assertEquals(b, true);
		
	}
	@Test(priority=3)
	public void loginPageTest() {
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDwon() {
		driver.quit();
	}
}
