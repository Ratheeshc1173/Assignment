
package com.qa.base;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import com.qa.automationreport.AutomationReport;
import com.qa.util.TestUtil;

@Listeners(AutomationReport.class)
public class TestBase {

	public static WebDriver driver;
	TestUtil testutil = new TestUtil();

	@BeforeClass(alwaysRun = true)
	@Parameters({ "deviceName", "platformName", "platformVersion", "udid", "browserName", "browserVersion", "nodeIP",
			"nodePort" })
	public void SetUp(String deviceName, String platformName, String platformVersion, String udid, String browserName,
			String browserVersion, String nodeIP, String nodePort) throws IOException, InterruptedException {
		try {
			if (browserName == null || browserName.equals("")) {
				System.out.println("Browser name missing." + "\n" + "Execution stopped...");
				System.exit(0);
			}
			if (browserName.equalsIgnoreCase(("firefox"))) {
				
				System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
				driver = new FirefoxDriver();
				
			} else if (browserName.equalsIgnoreCase(("chrome"))) {
				
				System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
				driver = new ChromeDriver();

			
			} else {
				System.out.println("Browser name missing");
			}

			driver.get("https://www.google.com/");
			driver.navigate().to("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterSuite(alwaysRun = true)
	public void tearAfter() throws Exception {
		driver.quit();
	}

}
