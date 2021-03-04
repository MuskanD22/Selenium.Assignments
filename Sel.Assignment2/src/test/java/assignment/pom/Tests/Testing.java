package assignment.pom.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import assignment.pom.pages.OrangeHRM;
import assignment.utility.pages.QuickBrowserOpening;


public class Testing {
	
	WebDriver driver;
	OrangeHRM login_page;
	
	@BeforeTest
	public void Setup() {
		driver=QuickBrowserOpening.StartBrowser("Chrome", "https://opensource-demo.orangehrmlive.com/") ;
		login_page= PageFactory.initElements(driver, OrangeHRM.class);
	}
	
	 @Test
	public void VerifyLogin() throws InterruptedException {
	
	// enter login credentials
	//login_page.login_OrangeHRM("Admin", "admin123");
	
	login_page.loginOrangeHRM("Admin", "admin1");
	
	Thread.sleep(5000);
	
	//after successful login 
	
	if(driver.getCurrentUrl().equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/index.php/dashboard")) {
		System.out.println("Login Successful");
	}
	
	// if login credentials was wrong click on forgot pass link
	else {
			System.out.println("Login Credentials was wrong so clicked on forgot pass link..");
			login_page.forgot_pass.click();
			Thread.sleep(4000);
			String text=login_page.Forgot_pass_page.getText();
		
			Assert.assertEquals(text, "Forgot Your Password?");
			System.out.println("landed on Forgot password page....");
		}

	 }
	 
	 @AfterTest
	 public void Exit() {
		 driver.quit();
	 }
}