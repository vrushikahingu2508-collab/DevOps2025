package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.CRM.Utility.CommonUtility;

public class LoginPage {
	
	WebDriver driver;
	
	//initialize driver
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//data member(locator)
	private By emailId = By.id("email-id");
	private By passwordId = By.id("password");
	private By loginBtnId = By.id("submit-id");
	
	//methods 
	
	public String doLogin(String em, String pw){
		
		driver.findElement(emailId).sendKeys(em);
		driver.findElement(passwordId).sendKeys(pw);
		driver.findElement(loginBtnId).click();
		CommonUtility.waitForWhile(2000);
		return driver.getCurrentUrl();
		
		
		}

}
