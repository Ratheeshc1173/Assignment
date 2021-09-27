package com.qa.pages;

import org.openqa.selenium.WebDriver;
import com.qa.objectrepository.*;

public class validateLoginButton extends LoginPageFeature {

	 
	public static void verifyLoginButton(WebDriver driver) {
							
				try {
					verifyEquals(isDisplayed(driver.findElement(LoginPageFeature.Login)),"LOGIN");
				    
				    System.out.println("Validated Login Button");

				} catch (Exception e) {				  

				    System.out.println("FAIL");

				}	 

	}

	
	
}
