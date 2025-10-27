package com.CRM.TestCase;

import org.testng.annotations.Test;

import com.CRM.Utility.CommonUtility;

import org.testng.annotations.BeforeClass;

import org.testng.Assert;;

public class LoginPageTestCase extends BaseClass{
	
	
	
	
	@BeforeClass
	public void pageSetUp()
	{
		  CommonUtility.getScreenShot(driver, "Login");
		hp.getStatusOfLink();
	}
	
  @Test
  public void validateLogin() 
  {
	  CommonUtility.getScreenShot(driver, "DoingLogin");
	  String url = lp.doLogin("test@gmail.com", "test123");
	  Assert.assertTrue(url.contains("customers"),"Test Fail: Login Fail");
	  System.out.println("Test Pass: Login Compelted ");
  }
}
