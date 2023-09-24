package com.om.PagesTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.om.Pages.BaseClass;
import com.om.Pages.LoginPage;

public class LoginPageTest extends BaseClass {
	LoginPage lgnpage;
	WebDriver driver;

	public LoginPageTest(){
		super();
	}
	@Test
public void loginpagetest() {
		OpenUrl();
		lgnpage=new LoginPage();	
		lgnpage.loginpage();
}
}
