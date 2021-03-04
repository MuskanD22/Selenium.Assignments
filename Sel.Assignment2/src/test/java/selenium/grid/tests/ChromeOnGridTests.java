package selenium.grid.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeOnGridTests {
	@Test
	public void Test1() throws MalformedURLException {
	//	node's path
//java -Dwebdriver.chrome.driver="D:\Selenium\chromedriver32\chromedriver.exe" -jarD:\Selenium\selenium-server-standalone-3.141.59.jar
		//-role node -hub http://localhost:4444/grid/register
		DesiredCapabilities caps=DesiredCapabilities.chrome();
		caps.setPlatform(Platform.WINDOWS);
	//	caps.setPlatform(Platform.WINDOWS);
		
		URL url=new URL("http://localhost:4444/wd/hub");
		WebDriver driver=new RemoteWebDriver(url,caps);
		
		driver.get("http://learn-automation.com");
		System.out.println("Title is "+driver.getTitle());
		
		
	}
}
