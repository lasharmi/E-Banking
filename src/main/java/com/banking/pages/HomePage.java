package com.banking.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.banking.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//table/tbody/tr[3]/td")
	WebElement managerID;
	
	@FindBy(xpath="//td[contains(text(),'Manger Id : mngr348776')]")
	WebElement managerIDVisible;
	
	@FindBy(xpath="//a[contains(text(),'New Customer')]")
	WebElement editCustomer;
	 
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	public boolean verifyUsername() {
		 return managerIDVisible.isDisplayed();
	}
	
	public NewCustomer clickEditCustomer() {
		editCustomer.click();
		return new NewCustomer();
	}

	public String getUsername() {
		return managerID.getText();
	}

}
