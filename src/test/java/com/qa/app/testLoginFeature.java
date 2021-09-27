package com.qa.app;

import org.testng.annotations.Test;
import java.io.IOException;
import com.qa.base.*;
import com.qa.pages.*;
import jxl.read.biff.BiffException;

public class testLoginFeature extends TestBase {
	
	
	public testLoginFeature()
	{
		super();
	}
	
	
	 @Test(priority = 1)
	  public void validateLoginButton() { 
		 validateLoginButton.verifyLoginButton(driver);
	  }
	 
	@Test(priority = 2)
		public void validateErrorMessage() throws BiffException, InterruptedException, IOException {
		validateErrorMessage.validateError(driver);
		 }
	@Test(priority = 3)
	  public void login() throws BiffException, InterruptedException, IOException {
			login.validUser(driver);
	 }
	
	@Test(priority = 4)
	  public void validatenavigationToHomePage() throws BiffException, InterruptedException, IOException {
		validatenavigationToHomePage.navigateHomePage(driver);
	 }
	
	 @Test(priority = 5)
	  public void logout() throws InterruptedException { 
		 	LogOut.logout(driver);
	  }
	
	 @Test(priority = 6)
	  public void validateReturningTologinPage() throws InterruptedException { 
		 validateReturningTologinPage.returnHomePage(driver);
	  }
	 
}

