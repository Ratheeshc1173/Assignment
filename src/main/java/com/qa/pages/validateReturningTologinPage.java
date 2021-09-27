package com.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class validateReturningTologinPage {

	public static WebDriver driver;
	public static void returnHomePage(WebDriver driver) {
							
				try {
					Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");				    
				    System.out.println("Validated returning to login page after log out");

				} catch (Exception e) {				  
				    System.out.println("FAIL");

				}
		 
	}
	
}

