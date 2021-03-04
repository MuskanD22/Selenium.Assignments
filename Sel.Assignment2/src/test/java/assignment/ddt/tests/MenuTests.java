package assignment.ddt.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import assignments.ddt.pages.BaseForHeaderPage;
import assignments.ddt.pages.PropertyPage;
import assignment.utility.pages.QuickBrowserOpening;

public class MenuTests extends BaseForHeaderPage{
	PropertyPage pro=new PropertyPage();
	@Test(priority=1)
	public void testMenuBar() throws InterruptedException {
		
		String url=driver.getCurrentUrl();
		String Expected_url=pro.DashboardURL();
		Assert.assertEquals(url,Expected_url);
		//logger.log(LogStatus.INFO, "Login successfully...");
		String menubar=pro.menubar();
		List<WebElement> list=driver.findElements(By.xpath(menubar));
		for(WebElement ele:list) {
			String s=ele.getAttribute("innerHTML");
			if(s.contentEquals("Job")) {
				ele.click();
				break;
			}

			System.out.println("Values in menu ------> "+s);
	}
	}
	
	@Test(priority=2)
	public void SearchDropDown() throws InterruptedException{
		String serachDropDown=pro.SearchDropDown();
		List<WebElement> list=driver.findElements(By.xpath(serachDropDown));
		for(WebElement ele:list) {
			String s=ele.getAttribute("innerHTML");
			
			System.out.println("All dropdown ------> "+s);
	}

	}
	
	@Test(priority=3)
	public void TestAdminLinks() throws InterruptedException {
		String TestAdmin=pro.TestAdminLinks();
		driver.findElement(By.xpath(TestAdmin)).click();
		String AdminDropdown=pro.AdminDropdown();
		List<WebElement>list=driver.findElements(By.xpath(AdminDropdown));
		
		for(WebElement ele:list) {
			String s=ele.getAttribute("innerHTML");
			System.out.println("Admin DropDown "+s);	
		}
	}
	
	@Test(priority=4)
	public void TestPIMLinks() throws InterruptedException {
		String PIMLink=pro.TestPIMLinks();
		driver.findElement(By.xpath(PIMLink)).click();
		String PimDropdown=pro.PIMdropdown();
		List<WebElement>list=driver.findElements(By.xpath(PimDropdown));
		
		for(WebElement ele:list) {
			String s=ele.getAttribute("innerHTML");
			if(s.contains("Reports")) {
				ele.click();
				Thread.sleep(3000);
			}
			System.out.println("PIM DropDown "+s);	
		}
	}
	
	@Test(priority=5)
	public void TestLeaveLinks() throws InterruptedException {
		String leaveLink=pro.TestLeaveLinks();
		driver.findElement(By.xpath(leaveLink)).click();
		String leaveDropdown=pro.LeaveDropDown();
		List<WebElement>list=driver.findElements(By.xpath(leaveDropdown));
		
		for(WebElement ele:list) {
			String s=ele.getAttribute("innerHTML");
			if(s.contains("Assign Leave")) {
				ele.click();
			}
			System.out.println("Leave DropDown "+s);	
		}
	}
	
	@Test(priority=6)
	public void TestTimeLinks() throws InterruptedException {
		String timeLink=pro.TestTimeLinks();
		driver.findElement(By.xpath(timeLink)).click();
		
		String timeDropdwon=pro.TimeDropdown();
		List<WebElement>list=driver.findElements(By.xpath(timeDropdwon));
		
		for(WebElement ele:list) {
			String s=ele.getAttribute("innerHTML");
			if(s.contentEquals("Reports")) {
				ele.click();
			}
			System.out.println("Time DropDown "+s);	
		}
	}
	
	@Test(priority=7)
	public void TestRecruitmentLinks() throws InterruptedException {
		String recruitmentLink=pro.TestRecruitmentLinks();
		driver.findElement(By.xpath(recruitmentLink)).click();
		
		String recruitmentDropDown=pro.RecruitmentDropdown();
		List<WebElement>list=driver.findElements(By.xpath(recruitmentDropDown));
		
		for(WebElement ele:list) {
			String s=ele.getAttribute("innerHTML");
			if(s.contentEquals("Vacancies")) {
				ele.click();
			}
			System.out.println("Recruitment DropDown "+s);	
		}
	}
	
}
