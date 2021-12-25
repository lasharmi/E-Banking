package com.banking.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.banking.base.TestBase;
import com.banking.pages.HomePage;
import com.banking.pages.LoginPage;

public class HomePageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	
	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage=new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void homePageTitleTest() {
		String title = homepage.getUsername();
		Assert.assertEquals(title, "Manger Id : mngr348776");
	}
	@Test(priority=2)
	public void homePageTitleVerify() {
		boolean b=homepage.verifyUsername();
		Assert.assertTrue(b);
	}

	@AfterMethod
	public void tearDwon() {
		driver.quit();
	}
}
