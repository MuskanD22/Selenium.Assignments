package assignment.ddt.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import assignments.ddt.pages.BaseForHeaderPage;
import assignments.ddt.pages.PropertyPage;


public class DashboardPageTests extends BaseForHeaderPage{
	PropertyPage pro=new PropertyPage();
	@Test(priority=1)
	public void DashboardPage() {
		String url=driver.getCurrentUrl();
	
		Assert.assertEquals(url,"https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		String dashboardHeading=pro.DashboardHeading();
	
		String str=driver.findElement(By.xpath(dashboardHeading)).getText();
		Assert.assertEquals(str, "Dashboard");
		
		String QuickLaunchHeading=pro.QuickLaunchHeading();
		String str1=driver.findElement(By.xpath(QuickLaunchHeading)).getText();
		Assert.assertEquals(str1, "Quick Launch");
		
		String AssignLeaveHeading=pro.AssignLeaveHeading();
		String str2=driver.findElement(By.xpath(AssignLeaveHeading)).getText();	
		Assert.assertEquals(str2, "Assign Leave");
		
		String LeaveListHeading=pro.LeaveListHeading();
		String str3=driver.findElement(By.xpath(LeaveListHeading)).getText();	
		Assert.assertEquals(str3, "Leave List");
		
		String TimesheetsHeading=pro.TimesheetsHeading();
		String str4=driver.findElement(By.xpath(TimesheetsHeading)).getText();	
		Assert.assertEquals(str4, "Timesheets");
		
		String ApplyLeaveHeading=pro.ApplyLeaveHeading();
		String str5=driver.findElement(By.xpath(ApplyLeaveHeading)).getText();	
		Assert.assertEquals(str5, "Apply Leave");
	
		String MyLeaveHeading=pro.MyLeaveHeading();
		String str6=driver.findElement(By.xpath(MyLeaveHeading)).getText();	
		Assert.assertEquals(str6, "My Leave");
		
		String MyTimesheetHeading=pro.MyTimesheetHeading();
		String str7=driver.findElement(By.xpath(MyTimesheetHeading)).getText();	
		Assert.assertEquals(str7, "My Timesheet");
		
		String EmployeeDistributionHeading=pro.EmployeeDistributionHeading();
		String str8=driver.findElement(By.xpath(EmployeeDistributionHeading)).getText();	
		Assert.assertEquals(str8, "Employee Distribution by Subunit");
		
		String Legend=pro.Legend();
		String str9=driver.findElement(By.xpath(Legend)).getText();	
		Assert.assertEquals(str9, "Legend");
		
		String PendingLeave=pro.PendingLeave();
		String str10=driver.findElement(By.xpath(PendingLeave)).getText();	
		Assert.assertEquals(str10, "Pending Leave Requests");
	}
	@Test(priority=2)
	public void TestLinkAssignLeave() throws InterruptedException {
		String LinkAssignLeave=pro.LinkAssignLeave();
		driver.findElement(By.xpath(LinkAssignLeave)).click();
		
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/index.php/leave/assignLeave");
		Thread.sleep(5000);
	}
	@Test(priority=3)
	public void TestLinkViewLeaveList() throws InterruptedException {
		String LinkViewLeaveList=pro.LinkViewLeaveList();
		
		driver.findElement(By.xpath(LinkViewLeaveList)).click();
		String url1=driver.getCurrentUrl();
		Assert.assertEquals(url1, "https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveList");
		}
	@Test(priority=4)
	public void TestLinkViewEmployeeTimesheet() throws InterruptedException {
		String LinkViewEmployeeTimesheet=pro.LinkViewEmployeeTimesheet();
		driver.findElement(By.xpath(LinkViewEmployeeTimesheet)).click();
		String url2=driver.getCurrentUrl();
		Assert.assertEquals(url2, "https://opensource-demo.orangehrmlive.com/index.php/time/viewEmployeeTimesheet");
	}
	@Test(priority=5)
	public void TestLinkApplyLeave() throws InterruptedException {
		String LinkApplyLeave=pro.LinkApplyLeave();
		driver.findElement(By.xpath(LinkApplyLeave)).click();
		String url3=driver.getCurrentUrl();
		Assert.assertEquals(url3, "https://opensource-demo.orangehrmlive.com/index.php/leave/applyLeave");
	}
	@Test(priority=6)
	public void TestLinkViewMyLeaveList() throws InterruptedException {
		String LinkViewMyLeaveList=pro.LinkViewMyLeaveList();
		driver.findElement(By.xpath(LinkViewMyLeaveList)).click();
		String url4=driver.getCurrentUrl();
		Assert.assertEquals(url4, "https://opensource-demo.orangehrmlive.com/index.php/leave/viewMyLeaveList");
	}
	@Test(priority=7)
	public void TestLinkViewMyTimesheet() throws InterruptedException {
		String LinkViewMyTimesheet=pro.LinkViewMyTimesheet();	
		driver.findElement(By.xpath(LinkViewMyTimesheet)).click();
		String url5=driver.getCurrentUrl();
		Assert.assertEquals(url5, "https://opensource-demo.orangehrmlive.com/index.php/time/viewMyTimesheet");
	}
}