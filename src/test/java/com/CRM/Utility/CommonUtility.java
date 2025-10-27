package com.CRM.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class CommonUtility {
	
	public static void waitForWhile(long millis) {
		try {
			Thread.sleep(millis);
		}catch(Exception e) {
			System.out.println("Exception occur: "+e);
		}
		
	}
	

	public static void getScreenShot(WebDriver driver,String ssName)
	{
		 TakesScreenshot ts = (TakesScreenshot) driver;
		 File file = ts.getScreenshotAs(OutputType.FILE);
		 
		 File dest  = new File(System.getProperty("user.dir")+"//Screenshots//"+ssName+System.currentTimeMillis()+".png");
		 try {
			FileHandler.copy(file, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

}
