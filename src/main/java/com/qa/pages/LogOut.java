package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import com.qa.objectrepository.LoginPageFeature;


public class LogOut {

	public static void logout(WebDriver driver) throws InterruptedException{
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.findElement(LoginPageFeature.Menu).click();
		driver.findElement(LoginPageFeature.Signout).click();
	 	 		 
	}

}