package com.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.qa.objectrepository.LoginPageFeature;



public class validatePlaceholders {
	
	public static WebDriver driver;
	
	

	public static void loginFields() {
		
		
		try {
			Assert.assertEquals(driver.findElement(LoginPageFeature.Username).getText(), "Username");				    
		    System.out.println("driver.findElement(LoginPageFeature.Username).getText()");

		} catch (Exception e) {				  
		    System.out.println(driver.findElement(LoginPageFeature.Username).getText());

		}
		try {
			Assert.assertEquals(driver.findElement(LoginPageFeature.Password).getText(), "Password");				    
		    System.out.println("Validated Password");

		} catch (Exception e) {				  
		    System.out.println("FAIL");

		}
		try {
			Assert.assertEquals(driver.findElement(LoginPageFeature.Login).getText(), "LOGIN");				    
		    System.out.println("Validated LOGIN");

		} catch (Exception e) {				  
		    System.out.println("FAIL");

		}
}
}