package assignment.ddt.tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import assignment.utility.pages.WindowHandle;
import assignments.ddt.pages.PropertyPage;
import assignments.ddt.pages.RequirementsPage;



public class VerifyLoginTests extends RequirementsPage{
	
	PropertyPage pro=new PropertyPage();
	
	 int i=1;
	@Test(priority=1)
	public void verifyTitle() {

		logger.log(LogStatus.INFO, "Verifying Title");
		
		String actualTitle=driver.getTitle();
		String expectedTitle="OrangeHRM";
		
		Assert.assertEquals(actualTitle, expectedTitle);

		logger.log(LogStatus.PASS, "Title is verified");
		
		String text=pro.getValidText();
		String ValidText=driver.findElement(By.xpath(text)).getText();
		
		logger.log(LogStatus.INFO, "Verifying Text data");
		
		Assert.assertEquals(ValidText, "( Username : Admin | Password : admin123 )");
		
		logger.log(LogStatus.PASS, "Text is verified");
	
	}

	ValidLoginTests login=new ValidLoginTests();
	@Test(priority=2)
	public void VerifyForgetPass() {
		logger.log(LogStatus.INFO, "Verifying Forgot password link");
		String forgotLink=pro.ForgotPass();
		driver.findElement(By.xpath(forgotLink)).click();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
		logger.log(LogStatus.PASS, "Forgot password link is verified");	
	}
	
	@Test(priority=3)
	public void VerifyLinks() throws InterruptedException {
		logger.log(LogStatus.INFO, "Verifying Links");
		
		String parent_window=driver.getWindowHandle();
		
		String footerLink=pro.getFooterLink();
		
		driver.findElement(By.xpath(footerLink)).click();
		 // and getWindowHandles gives the set of strings
	    WindowHandle win=new WindowHandle();
	   driver= win.Test(driver, parent_window);
	   Assert.assertEquals(driver.getTitle(), "HR Management System | HR Management Software | OrangeHRM");
	   logger.log(LogStatus.PASS, "Footer link is verified");	
		
	   driver.close();
	   driver.switchTo().window(parent_window);
	   
	   String SocialL=pro.getSocialLinklnLink();
	   driver.findElement(By.xpath(SocialL)).click();
	   win.Test(driver, parent_window);
	   logger.log(LogStatus.INFO, "Verifying Social media links");
		
	   Assert.assertEquals(driver.getTitle(), "Sign Up | LinkedIn");
	   logger.log(LogStatus.PASS, " LinkedIn link is verified");	
		
	   driver.close();
	   driver.switchTo().window(parent_window);
	   
	   String SocialF=pro.getSocialFacbookLink();
	   driver.findElement(By.xpath(SocialF)).click();
	   win.Test(driver, parent_window);
		
	   Assert.assertEquals(driver.getTitle(), "OrangeHRM - World's Most Popular Opensource HRIS - Home | Facebook");
	   
	   logger.log(LogStatus.PASS, "facebook link is verified");	
		
	   driver.close();
	   driver.switchTo().window(parent_window);
	   
	   String SocialT=pro.getSocialTweeterLink();
	   driver.findElement(By.xpath(SocialT)).click();
	   win.Test(driver, parent_window);
	   
	   Assert.assertEquals(driver.getTitle(), "OrangeHRM Inc. (@orangehrm) / Twitter");
	   logger.log(LogStatus.PASS, "Twitter link is verified");	
		
	   driver.close();
	   driver.switchTo().window(parent_window);
	   
	   String SocialY=pro.getSocialYoutubeLink();
	   driver.findElement(By.xpath(SocialY)).click();
	   win.Test(driver, parent_window);
	   
	   Assert.assertEquals(driver.getTitle(), "OrangeHRM Inc - YouTube");
	   logger.log(LogStatus.PASS, "Youtube link is verified");	
		
	   driver.close();
	   driver.switchTo().window(parent_window);
	   
	}
	}

