package com.banking.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.banking.base.TestBase;

public class NewCustomer extends TestBase {

	

	@FindBy(xpath="//input[@name='name']")
	WebElement customerName;

	@FindBy(xpath="//table/tbody/tr[5]/td[2]/input[@value='m']")
	WebElement maleGender;

	@FindBy(xpath="//table/tbody/tr[5]/td[2]/input[@value='f']")
	WebElement femaleGender;

	@FindBy(xpath="//input[@id='dob']")
	WebElement datePicker;

	@FindBy(xpath="//textarea[@name='addr']")
	WebElement address;

	@FindBy(xpath="//input[@name='city']")
	WebElement city;

	@FindBy(xpath="//input[@name='state']")
	WebElement state;

	@FindBy(xpath="//input[@name='pinno']")
	WebElement pinNumber;

	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement mobileNumber;


	@FindBy(xpath="//input[@name='emailid']")
	WebElement emailId;

	@FindBy(xpath="//input[@name='password']")
	WebElement emailPassword;

	@FindBy(xpath="//input[@type='submit']")
	WebElement submitButton;
	
//	@FindBy(xpath="//*[contains(text(),'Customer Registered Successfully!!!')]")
	
	@FindBy(xpath="//table/tbody/tr[1]/td/p")
	WebElement sucessMessage;
	
	@FindBy(xpath="//table/tbody/tr[4]/td[2]")
	WebElement customerID;

	
	@FindBy(xpath="//table/tbody/tr[14]/td/a")
	WebElement continueButton;


	// Initializing the Page Objects:
	public NewCustomer() {
		PageFactory.initElements(driver, this);
	}	
	

	public void enterDateOfBirth(String dob) {
		datePicker.isDisplayed();
		datePicker.sendKeys(dob);
		String date= datePicker.getText();
		System.out.println(date);;
	}

	public void customerName(String s) {
		customerName.sendKeys(s);
	}
	public void maleCustomer() {
		maleGender.click();
	}

	public void femaleCustomer() {
		femaleGender.click();
	}
	
	public void customerAddress(String addr) {
		address.sendKeys(addr);
	}
	
	public void customerCity(String CustCity) {
		city.sendKeys(CustCity);
	}
	
	public void customerState(String custState) {
		state.sendKeys(custState);
	}
	
	public void customerPinNo(String PinNo) {
		pinNumber.sendKeys(PinNo);
	}
	
	public void customerMobileNo(String mobileNo) {
		mobileNumber.sendKeys(mobileNo);
	}
	
	public void customerEmail(String custEmailId) {
		emailId.sendKeys(custEmailId);
	}
	
	public void customerPassword(String custPassword) {
		emailPassword.sendKeys(custPassword);
	}
	public void clickSubmit() {
		submitButton.click();
	}
	
	public String verifyMessage() {
		 return sucessMessage.getText();
	}
	
	public String getCustomerID() {
		return customerID.getText();
	}
	public void continueClick() {
		continueButton.click();
	}
}
