package com.CRM.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.CRM.Utility.CommonUtility;



public class HomePageTestCase extends BaseClass{
	
	
  @Test(priority = 1 )
  public void verifyUrl() {
	 
	  String actUrl = hp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("crm"),"Test Fail: Url not match");
	  System.out.println("Test Pass: Url match");
	  
  }
  
  @Test(priority = 2)
  public void verifyTitle() {
	  
	  String actTitle = hp.getAppTitle();
	  Assert.assertTrue(actTitle.contains("Customer"),"Test Fail: Title not match");
	  System.out.println("Test Pass: Title match");
	
	  
  }
  
  @Test(priority = 3)
  public void validateSignInLink() {
	  
	  CommonUtility.getScreenShot(driver, "HomePage");
	  String nextPageUrl = hp.getStatusOfLink();
	  Assert.assertTrue(nextPageUrl.contains("login"),"Test Fail: Login Page not open");
	  System.out.println("Test Pass: Application Navigation to Login Page");
	  
  }
}
