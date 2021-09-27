package com.qa.automationreport;

import java.io.File;
import java.io.IOException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.qa.util.TestUtil;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class AutomationReport implements ITestListener {

	public static ExtentReports extent;
	public static ExtentTest test;
	
	
	public AutomationReport() {
	}

	public void onStart(ITestContext context) {
		try {
			// Section for creating HTML Report

			String projectNamehtml = "Test";
			String extentconfigfile = System.getProperty("user.dir") + "/" + "extent-config.xml";
			String localextentconfigfile = System.getProperty("user.dir") +
			"\\extent-config.xml";
			extent = new ExtentReports(System.getProperty("user.dir") + "/" + "AutomationTestReport.html");
			extent.loadConfig(new File(extentconfigfile));
			extent.addSystemInfo("Project Name", projectNamehtml);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Welcome to Testing......");
	}

	
	public void onTestStart(ITestResult result) {
		// Section for HTML Report
		test = extent.startTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		// Section for HTML Report
		test.log(LogStatus.PASS, "Test Case" + " " + result.getMethod().getMethodName() + " " + "Executed Succefully");
	}

	public void onTestFailure(ITestResult result) {
		// Section for HTML Report
		test.log(LogStatus.FAIL, result.getThrowable().toString().split(":")[1].trim());
			
		try {
			TestUtil.takeScreenshotAtEndOfTest();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		// Section for HTML Report
		test.log(LogStatus.SKIP, "Test Case Skipped is " + " " + result.getMethod().getMethodName());
	}

	public void onFinish(ITestContext context) {
		// Section for HTML Report
		extent.endTest(test);
		extent.flush();
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}
}