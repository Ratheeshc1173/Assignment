package com.qa.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPageFeature {
		
	//Log in
	public static By Username=By.xpath("//div[@class='login_logo']/ancestor::div//div[@class='login-box']//input[@id='user-name']");
	public static By Password=By.xpath("//div[@class='login_logo']/ancestor::div//div[@class='login-box']//input[@id='password']");
	public static By Login=By.xpath("//div[@class='login_logo']/ancestor::div//div[@class='login-box']//input[@id='login-button']");
	
	//LogOut
	public static By Menu=By.xpath("//div[@class='primary_header']//div[@id='menu_button_container']//button[text()='Open Menu']");
	public static By Signout=By.xpath("//div[@class='primary_header']//div[@id='menu_button_container']//a[text()='Logout']");
	
	//validation error message
	public static By Error=By.xpath("//div[@class='login_logo']/ancestor::div//div[@class='error-message-container error']//h3");
	
	//placeholder
	public static By PlaceholdersText(String text) {
		return By.xpath("//div[@class='login_logo']/ancestor::div//div[@class='login-box']//input[@id='" + text + "']");
	}
	
	
	protected static void verifyEquals(WebElement webElement, String string) {
		// TODO Auto-generated method stub
		
	}

	protected static WebElement isDisplayed(WebElement findElement) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}


