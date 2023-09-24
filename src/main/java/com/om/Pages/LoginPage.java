package com.om.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{

	@FindBy(xpath="//input[@id='user-name']")
	WebElement loginusername;

	@FindBy(xpath="//input[@id='password']")
	WebElement loginpassword;
	@FindBy(xpath="//input[@id='login-button']")
	WebElement signin;
	
	public LoginPage() {
	
		PageFactory.initElements(driver, this);
	}
	public void loginpage() {
		
		loginusername.sendKeys("standard_user");
		loginpassword.sendKeys("secret_sauce");
		signin.click();
}
}
