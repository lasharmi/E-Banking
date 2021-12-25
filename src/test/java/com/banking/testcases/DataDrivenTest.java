package com.banking.testcases;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.banking.base.TestBase;
import com.banking.util.TestUtilData;



public class DataDrivenTest extends TestBase{


	@BeforeMethod
	public void setUp() {
		System.out.println("Before Method");

	}

	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testData= TestUtilData.getDataFromExcel();
		return testData.iterator();
	}

	@Test(dataProvider="getTestData")
	public void excelDataFetch(String name,String gender,String dob,String address,String city, String state,String pin,String mobile,String email,String password) {
		System.out.println("name");
		System.out.println(name);
		System.out.println("gender");
		System.out.println(gender);
		System.out.println("dob");
		System.out.println(dob);
		System.out.println("address");
		System.out.println(address);
		System.out.println("city");
		System.out.println(city);
		System.out.println("state");
		System.out.println(state);
		System.out.println("pin");
		System.out.println(pin);
		System.out.println("mobile");
		System.out.println(mobile);
		System.out.println("email");
		System.out.println(email);
		System.out.println("password");
		System.out.println(password);


	}


	@AfterMethod

	public void tear() {
		System.out.println("After Method");
	}
}
