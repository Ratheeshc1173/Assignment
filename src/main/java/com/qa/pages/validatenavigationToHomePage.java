package com.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class validatenavigationToHomePage {

 
	static String HomePage="https://www.saucedemo.com/inventory.html";
	
	public static void navigateHomePage(WebDriver driver) {
								
		try {
			Assert.assertEquals(driver.getCurrentUrl(), HomePage);
					    
		    System.out.println("Validated navigation to home page for valid user login");

		} catch (Exception e) {				  

		    System.out.println("FAIL");

		}		 

	}
	 
	
}

