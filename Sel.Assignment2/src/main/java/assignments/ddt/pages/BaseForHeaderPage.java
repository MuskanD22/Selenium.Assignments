package assignments.ddt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import assignment.utility.pages.QuickBrowserOpening;

public class BaseForHeaderPage {
	public PropertyPage pro=new PropertyPage();
	public WebDriver driver;
	public ExtentReports report;
	public ExtentTest logger;
	int i=0;
	@BeforeMethod
	public void startBrowser() {
		report=new ExtentReports("D:\\ReportData\\AfterSucessfulLogin"+i+".html",true);
		driver=QuickBrowserOpening.StartBrowser("Chrome","https://opensource-demo.orangehrmlive.com/");

		logger=report.startTest("report1");
		logger.log(LogStatus.INFO, "Application is uploaded");

		logger.log(LogStatus.INFO, "Enter the username");
		String username=pro.getUsername();
		driver.findElement(By.xpath(username)).sendKeys("Admin");
		

		logger.log(LogStatus.INFO, "Enter the password");
		String pass=pro.getPassword();
		driver.findElement(By.xpath(pass)).sendKeys("admin123");
	
		logger.log(LogStatus.INFO, "Click on login button");
		String loginBut=pro.getLoginButton();
		driver.findElement(By.xpath(loginBut)).click();

	}
	@AfterMethod
	public void exit() {
		i++;
		report.endTest(logger);
	//Quit the driver
		report.flush();
		
		driver.quit();
	}
}
