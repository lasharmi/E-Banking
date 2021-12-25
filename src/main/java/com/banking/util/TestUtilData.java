package com.banking.util;

import java.util.ArrayList;

import com.banking.base.TestBase;
import com.banking.testdata.Xls_Reader;



public class TestUtilData extends TestBase {
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel(){
		
		ArrayList<Object[]> data= new ArrayList<Object[]>();
		try {
			//reader= new Xls_Reader("C:/Users/Baskar/Desktop/sharmila/eBanking.xlsx");
			
			reader= new Xls_Reader("C://Users//Baskar//eclipse-workspace//E-Banking//src//main//java//com//banking//testdata//eBanking.xlsx");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		for(int rowNum=2;rowNum<=reader.getRowCount("customer_details"); rowNum++) {
			
			String custName=reader.getCellData("customer_details","CustomerName", rowNum);
			String custGender=reader.getCellData("customer_details","Gender", rowNum);
			String custDOB=reader.getCellData("customer_details","DOB", rowNum);
			String custAddress=reader.getCellData("customer_details","Address", rowNum);
			String custCity=reader.getCellData("customer_details","City", rowNum);
			String custState=reader.getCellData("customer_details","State", rowNum);
			String custPIN=reader.getCellData("customer_details","PIN", rowNum);
			String custMobile=reader.getCellData("customer_details","MobileNo", rowNum);
			String custEmail=reader.getCellData("customer_details","Email", rowNum);
			String custPassword=reader.getCellData("customer_details","Password", rowNum);
			
			
			Object ob[]= {custName,custGender,custDOB,custAddress,custCity,custState,custPIN,custMobile,custEmail,custPassword};
			data.add(ob);
		}
		
		

		return data;
		
	}
	
	

}
