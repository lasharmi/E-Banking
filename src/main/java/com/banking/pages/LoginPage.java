package com.banking.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.banking.base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(name="uid")
	@CacheLookup
	WebElement username;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement password;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement loginButton;
	
	
	@FindBy(xpath="//img[@alt='Guru99 Demo Sites']")
	@CacheLookup
	WebElement logo;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String validateLoginTitle() {
		return driver.getTitle();
	}
	
	public boolean validateLogo() {
		return logo.isDisplayed();
	}
	
	public HomePage login(String us, String pwd) {
		username.sendKeys(us); 
		password.sendKeys(pwd);
		loginButton.click();
		
		return new HomePage();
	
	}
}
