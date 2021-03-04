package assignment.utility.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class QuickBrowserOpening {
	static WebDriver driver;
	public static WebDriver StartBrowser(String BrowserName,String URL) {
		
		ChromeOptions options=new ChromeOptions();
		// this method maximized the chrome browser
		options.addArguments("start-maximized");
		
		if(BrowserName.equalsIgnoreCase("chrome")) {
			
			//set the ChromeDriver path
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver32\\chromedriver.exe");
			driver=new ChromeDriver(options);
		}
		
		else if(BrowserName.equalsIgnoreCase("IE")) {
			
			//set the IEDriver path
			System.setProperty("webdriver.ie.driver", "D:\\Selenium\\IEBrower\\IEDriverServer.exe");
			 driver=new InternetExplorerDriver();
				
		}
		//Navigate to the URL
		driver.get(URL);
		return driver;
	}
}
