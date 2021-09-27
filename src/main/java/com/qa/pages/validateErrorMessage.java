package com.qa.pages;

import org.openqa.selenium.WebDriver;
import com.qa.objectrepository.*;

public class validateErrorMessage extends LoginPageFeature {
	 	
	public static void validateError(WebDriver driver)  {
		
	  
		  driver.findElement(LoginPageFeature.Login).click();
								
				try {
					verifyEquals(isDisplayed(driver.findElement(LoginPageFeature.Error)),"Epic sadface: Username is required");
				    
				    System.out.println("validated Error message on invalid login");

				} catch (Exception e) {				  

				    System.out.println("FAIL");

				}
		 
	}

 
	
}
