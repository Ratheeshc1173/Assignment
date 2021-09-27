package com.qa.pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import com.qa.objectrepository.LoginPageFeature;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class login {
	
		public static WebDriver driver;
		public static Workbook work;
		public static Sheet test;
		static String id = "";
		static String pw = "";
	
	public static void validUser(WebDriver driver) throws InterruptedException, BiffException, IOException{
				
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	 
		  File file = new File("src/main/resources/testdata/loginData.xls");
		  Workbook wb = Workbook.getWorkbook(file);
		  Sheet sheet = wb.getSheet(0);
		  
		  //for patient-1:01,11 and for patient -2:02,12
		  id = sheet.getCell(0, 1).getContents();   
		  pw = sheet.getCell(1, 1).getContents();  
		  		  
		  driver.findElement(LoginPageFeature.Username).sendKeys(id);
		  driver.findElement(LoginPageFeature.Password).sendKeys(pw);
		  driver.findElement(LoginPageFeature.Login).click();	
		  
		  
	}
	
}

