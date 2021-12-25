package com.banking.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.banking.base.TestBase;
import com.banking.pages.HomePage;
import com.banking.pages.LoginPage;
import com.banking.pages.NewCustomer;
import com.banking.util.TestUtil;

public class CustomerUpdateTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	NewCustomer newCustomer;
	
	String sheetName = "customer_details";
	
	public CustomerUpdateTest() {
		super();
	}
	
	//@BeforeMethod
	public void setUp() {
		initialization();
		loginpage=new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	//@DataProvider
	public Object[][] getBankData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}	
	
	//@Test
	public void setCellData() throws IOException, EncryptedDocumentException, InvalidFormatException {
		TestUtil.setCellData("10");
	}

}
