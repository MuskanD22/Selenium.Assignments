package assignment.ddt.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import assignments.ddt.pages.BaseClassPage;
import assignments.ddt.pages.PropertyPage;
import assignment.pom.pages.OrangeHRM;
import assignment.utility.pages.ExcelDataConfig;
import assignment.utility.pages.QuickBrowserOpening;
import assignment.utility.pages.CaptureScreenshots;

public class ValidLoginTests extends BaseClassPage  {

	WebElement user, pass;
	 int i=0;
	OrangeHRM org;
	ExcelDataConfig config;
	
	@Test(dataProvider="data")
	public void TestLogin(String uname, String pass) throws InterruptedException, IOException {
		PropertyPage pro=new PropertyPage();
		logger.log(LogStatus.INFO, "Start testing for valid login");
		String user=pro.getUsername();

		driver.findElement(By.xpath(user)).sendKeys(uname);
		
		String password=pro.getPassword();
		driver.findElement(By.xpath(password)).sendKeys(pass);
		
		CaptureScreenshots.captureScreenshots(driver,"LoginAttempt"+i);
		
		String click=pro.getLoginButton();
		driver.findElement(By.xpath(click)).click();
		
		Thread.sleep(5000);
		
		String URL=driver.getCurrentUrl();
		
		if(URL.equals("https://opensource-demo.orangehrmlive.com/index.php/dashboard")) {
			System.out.println("Login Successful when username is "+uname+" and password is this "+pass);
			CaptureScreenshots.captureScreenshots(driver,"ValidLogin"+i);
			i++;
			logger.log(LogStatus.PASS, "Login SuccessFully...");
		}
		
		else{
			CaptureScreenshots.captureScreenshots(driver,"InvalidLogin"+i);
			logger.log(LogStatus.FAIL, "invalid Login ");
			System.out.println("Invalid Login when username is "+uname+" and password is this "+pass);

			Assert.assertTrue(URL.contains("dashboard"));
			i++;
			
		}
		
		}
	
	
	@DataProvider(name="data")
	public Object[][] TestDataFeed(){
		int rows_count=0;
		config=new ExcelDataConfig("D:\\Reports\\muskan.xlsx");
			
		rows_count=config.getRowCount(0);	
		
		Object [][] data=new Object[rows_count][2];
		
		for(int i=0;i<rows_count;i++) {
			data[i][0]=config.getData(0, i, 0);
			data[i][1]=config.getData(0, i, 1);
			
		}
		return data;
	}
	
	
}
