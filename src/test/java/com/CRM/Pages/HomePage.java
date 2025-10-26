package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	//encapsulation = private data + public method
	private WebDriver driver; 
	
	
	//initialization driver with the help of constructor
	public HomePage(WebDriver driver){
		this.driver = driver;
		
	}
	
	//data member(locator)
	
	private By link = By.linkText("Sign In");
	
	//method(functionality)
	public String getAppUrl() 
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public String getStatusOfLink() 
	{
		driver.findElement(link).click();
		return driver.getCurrentUrl();
	}
	

}
