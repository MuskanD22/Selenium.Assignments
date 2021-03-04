package assignment.ddt.tests;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import assignments.ddt.pages.BaseForHeaderPage;
import assignments.ddt.pages.PropertyPage;

public class HeaderTests extends BaseForHeaderPage {

	PropertyPage pro=new PropertyPage();	
	@Test(priority=1)
	public void TestLink() throws InterruptedException {
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://opensource-demo.orangehrmlive.com/index.php/dashboard");

		logger.log(LogStatus.PASS, "Successful login...");
		String click=pro.getdropDown();

		driver.findElement(By.xpath(click)).click();
		Thread.sleep(5000);
		
		String about=pro.getAbout();
		driver.findElement(By.xpath(about)).click();

		logger.log(LogStatus.INFO, "Clicked on about section...");

		String AboutAlert=pro.AboutAlert();
		String str=driver.findElement(By.xpath(AboutAlert)).getText();
		
		//Assert.assertEquals(str, "Company Name: OrangeHRM\n" + "Version: Orangehrm OS 4.7\n" + "Active Employees: 38\n" + "Employees Terminated: 0");

		logger.log(LogStatus.PASS, "Verified About section...");
		String cancel=pro.AboutAlertCancel();
		driver.findElement(By.xpath(cancel)).click();

		logger.log(LogStatus.INFO, "Close the About section...");
		Thread.sleep(5000);
		String logout=pro.Logout();
		driver.findElement(By.xpath(logout)).click();
		
		Thread.sleep(5000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		logger.log(LogStatus.PASS, "Successful logout...");
		
}
	@Test(priority=2)
	public void TestIcons() throws InterruptedException {
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		String result=pro.QuestionMarkLink();
		driver.findElement(By.xpath(result)).click();
		logger.log(LogStatus.INFO, "Clicked on the Question mark link..");
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/index.php/help");
		logger.log(LogStatus.PASS, "Verified Question mark link..");
		
		logger.log(LogStatus.INFO, "Verifying Marketplace link..");
		String Marketplace=pro.MarketplaceLink();
		driver.findElement(By.xpath(Marketplace)).click();	
		
		Thread.sleep(3000);
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/index.php/marketPlace/ohrmAddons");
		logger.log(LogStatus.PASS, "Verified Marketplace link..");
		
		
		
	}
	
}