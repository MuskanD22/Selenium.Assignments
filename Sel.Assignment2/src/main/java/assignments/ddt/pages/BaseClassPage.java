package assignments.ddt.pages;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import assignment.utility.pages.QuickBrowserOpening;

public class BaseClassPage {

	public WebDriver driver;
	int i=0;
	public ExtentReports report;
	public ExtentTest logger;
	
	@BeforeMethod
	public void startUp() throws IOException {
		report=new ExtentReports("D:\\ReportData\\VerifyLoginCredentials"+i+".html",true);
		driver=QuickBrowserOpening.StartBrowser("Chrome","https://opensource-demo.orangehrmlive.com/");

		logger=report.startTest("report1");
		logger.log(LogStatus.INFO, "Application is uploaded");
	}
	
	@AfterMethod
	public void tearDown() {
		
		report.endTest(logger);
		i++;
	//Quit the driver
		report.flush();
		driver.quit();
	}

}
