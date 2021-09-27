package com.qa.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.qa.base.TestBase;

public class TestUtil {
	 	public static void takeScreenshotAtEndOfTest() throws IOException {
			
	 	
			  TakesScreenshot ts = (TakesScreenshot)TestBase.driver; 
			  File file =ts.getScreenshotAs(OutputType.FILE);
			  
			  String currentDir = System.getProperty("user.dir"); 
			  String timeStamp = new SimpleDateFormat("dd.MM.yyyy_HH.mm.ss").format(Calendar.getInstance().getTime());
			  
			  try 
			  { 
				  Files.copy(file, new File(currentDir + "/screenshots/" + timeStamp + ".png")); 
				  } 
			  catch (IOException e) 
			  { 
				  e.printStackTrace(); 
				  }
			  System.out.println("screenshot is taken");		 
	 		
	 	}

	public String getProperty(String propertyFileName, String property) throws Exception {
		String propertyValue = "";
		try {
			Properties props = new Properties();
			ClassLoader classLoader = TestUtil.class.getClassLoader();
			InputStream input = classLoader.getResourceAsStream(propertyFileName + ".properties");
			props.load(input);
			propertyValue = props.getProperty(property);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return propertyValue;
	}
}
