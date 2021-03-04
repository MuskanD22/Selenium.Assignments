package selenium.grid.pages;

import java.net.MalformedURLException;
import java.net.URI;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class BrowserStackTests {

	public static final String USERNAME = "muskandureja1";
	public static final String AUTOMATE_KEY = "9ui17bikpAhNvxiQ7H63";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities caps =  DesiredCapabilities.safari();
        
		caps.setPlatform(Platform.MAC);
		caps.setCapability("browserstack.debug", "true");
		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("http:google.com");
		WebElement ele=driver.findElement(By.name("q"));
		
		ele.sendKeys("BrowserStack");
		ele.submit();
		System.out.println(driver.getTitle());
		//Write your test here
		driver.quit();
	}
}
