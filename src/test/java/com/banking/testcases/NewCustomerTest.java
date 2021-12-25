package com.banking.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.banking.base.TestBase;
import com.banking.pages.HomePage;
import com.banking.pages.LoginPage;
import com.banking.pages.NewCustomer;
import com.banking.util.TestUtil;


public class NewCustomerTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	NewCustomer newCustomer;
	TestUtil testUtil;
	
	String sheetName = "customer_details";
	
	
	public NewCustomerTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage=new LoginPage();
		testUtil=new TestUtil();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@DataProvider
	public Object[][] getBankData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	@Test(priority=1, dataProvider="getBankData")
	public void enterCustomerDetails(String custName, String gender,String custDOB, String custAddr, String custCity,String custState,String custPIN,
			String custMobileNo, String custEmailID, String custPassword) throws InterruptedException, IOException {
		
		newCustomer=homepage.clickEditCustomer();
		newCustomer.customerName(custName);
		if(gender.equals("male")) {
		newCustomer.maleCustomer();
		}else {
			newCustomer.femaleCustomer();
		}
		newCustomer.enterDateOfBirth(custDOB);
		newCustomer.customerAddress(custAddr);
		newCustomer.customerCity(custCity);
		newCustomer.customerState(custState);
		newCustomer.customerPinNo(custPIN);
		newCustomer.customerMobileNo(custMobileNo);
		newCustomer.customerEmail(custEmailID);
		newCustomer.customerPassword(custPassword);
		
		Thread.sleep(2000);
		newCustomer.clickSubmit();
		
		String response=newCustomer.verifyMessage();
		Assert.assertEquals(response, "Customer Registered Successfully!!!");
		Thread.sleep(2000);
		String customerID=newCustomer.getCustomerID();
		System.out.println("customerID" + customerID);
		TestUtil.setCellData(customerID);
		newCustomer.continueClick();
	}
	
	
	
	

	@AfterMethod
	public void tearDwon() {
		driver.quit();
	}
}
