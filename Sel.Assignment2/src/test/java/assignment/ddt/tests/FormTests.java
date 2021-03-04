package assignment.ddt.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import assignments.ddt.pages.BaseForHeaderPage;
import assignments.ddt.pages.PIM_LeavePropertiesPage;



public class FormTests extends BaseForHeaderPage{
	@BeforeSuite
	public void before_suite()  
	 {  
	     System.out.println("Running tests");  
	 }  
	
	PIM_LeavePropertiesPage pro=new PIM_LeavePropertiesPage();
	@Test(priority=1)
	public void DataFillForPIMPage() throws InterruptedException {
		String str=pro.DashboardURL();
		Assert.assertEquals(driver.getCurrentUrl(),str);
		
		String PIM=pro.menubar();
		List<WebElement>list=driver.findElements(By.xpath(PIM));
		for(WebElement ele:list) {
			String s=ele.getAttribute("innerHTML");
			if(s.contentEquals("PIM")) {
				ele.click();
				break;
			}
		}
		String PIMHeading=pro.PIMHeading();
		String str1=driver.findElement(By.xpath(PIMHeading)).getText();
		Assert.assertEquals(str1, "Employee Information");
		
		//employee name
		String empnameX=pro.EmpName();
		String EmpName=driver.findElement(By.xpath(empnameX)).getText();
		Assert.assertEquals(EmpName, "Employee Name");
		String EmpnameTextField=pro.EmpnameTextField();
		driver.findElement(By.xpath(EmpnameTextField)).sendKeys("Odis Adalwin");
		
		// employee ID
		String IdXpath=pro.Id();
		String ID=driver.findElement(By.xpath(IdXpath)).getText();
		Assert.assertEquals(ID, "Id");
		
		String IDTextField=pro.IDTextField();
		driver.findElement(By.xpath(IDTextField)).sendKeys("0002");
		
		String EmpStatusXpath=pro.EmpStatusText();
		String EmpStatus=driver.findElement(By.xpath(EmpStatusXpath)).getText();
		Assert.assertEquals(EmpStatus, "Employment Status");
		
		String EmpStatusTextField=pro.EmpStatusTextField();
		driver.findElement(By.xpath(EmpStatusTextField)).click();
		String EmpStatusSelect=pro.EmpStatusSelect();
		List<WebElement> empStatusDD=driver.findElements(By.xpath(EmpStatusSelect));
		for(WebElement ele:empStatusDD) {
			String s=ele.getAttribute("innerHTML");
			if(s.contentEquals("Full-Time Permanent")) {
				ele.click();
				break;
			}
		}
		String IncludeText=pro.IncludeText();
		String include=driver.findElement(By.xpath(IncludeText)).getText();
		Assert.assertEquals(include, "Include");
	
		String IncludeTextField=pro.IncludeTextField();
		driver.findElement(By.xpath(IncludeTextField)).click();

		String IncludeSelect=pro.IncludeSelect();
		List<WebElement> includeDD=driver.findElements(By.xpath(IncludeSelect));

		for(WebElement ele:includeDD) {
			String s=ele.getAttribute("innerHTML");
			if(s.contentEquals("Current and Past Employees")) {
				ele.click();
				break;
			}
		}
		
		String supervisorNameText=pro.supervisorNameText();
		String supervisorName=driver.findElement(By.xpath(supervisorNameText)).getText();
		Assert.assertEquals(supervisorName, "Supervisor Name");
		String supervisorNameTextField=pro.supervisorNameTextField();
		driver.findElement(By.xpath(supervisorNameTextField)).sendKeys("John Smith");
		
		String jobTitleText=pro.jobTitleText();
		String jobTitle=driver.findElement(By.xpath(jobTitleText)).getText();
		Assert.assertEquals(jobTitle, "Job Title");
		
		String jobTitleTextField=pro.jobTitleTextField();
		driver.findElement(By.xpath(jobTitleTextField)).click();
		String jobTitleSelect=pro.jobTitleSelect(); 
		List<WebElement> jobT=driver.findElements(By.xpath(jobTitleSelect));
		for(WebElement ele:jobT) {
			String s=ele.getAttribute("innerHTML");
			if(s.contentEquals("Chief Technical Officer")) {
				ele.click();
				break;
			}
		}
		String subUnitText=pro.subUnitText();
		String subUnit=driver.findElement(By.xpath(subUnitText)).getText();
		Assert.assertEquals(subUnit, "Sub Unit");
		
		String subUnitTextField=pro.subUnitTextField();
		driver.findElement(By.xpath(subUnitTextField)).click();
		String subUnitSelect=pro.subUnitSelect();
		List<WebElement> subU=driver.findElements(By.xpath(subUnitSelect));
		for(WebElement ele:subU) {
			String s=ele.getAttribute("innerHTML");
			if(s.contentEquals("Administration")) {
				ele.click();
				break;
			}
		}
		String searchButton=pro.searchButton();
		driver.findElement(By.xpath(searchButton)).click();
	}
	
	@Test(priority=2)
	public void DataFillForLeavePage() throws InterruptedException {
	
		String str=pro.DashboardURL();
		Assert.assertEquals(driver.getCurrentUrl(),str);
		
		String leave=pro.menubar();
		List<WebElement>list=driver.findElements(By.xpath(leave));
		for(WebElement ele:list) {
			String s=ele.getAttribute("innerHTML");
			if(s.contentEquals("Leave")) {
				ele.click();
				break;
			}
		}
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveList");
		
	String LeaveHeading=pro.LeaveHeading();
	String actual=driver.findElement(By.xpath(LeaveHeading)).getText();
	Assert.assertEquals(actual, "Leave List");
	
	String FromDate=pro.FromDate();
	String textVerification=driver.findElement(By.xpath(FromDate)).getText();
	Assert.assertEquals(textVerification, "From");

	String FromDateSelect=pro.FromDateSelect();
	driver.findElement(By.xpath(FromDateSelect)).click();
	
	String FromDatePicker=pro.FromDatePicker();
	List<WebElement> date=driver.findElements(By.xpath(FromDatePicker));
	for(WebElement ele:date) {
		String s=ele.getAttribute("innerHTML");
		if(s.contains("5")) {
			Actions act=new Actions(driver);
			act.moveToElement(ele).click().build().perform();
			break;
		}
	}
	
	String ToDate=pro.ToDate();
	String actualText=driver.findElement(By.xpath(ToDate)).getText();
	Assert.assertEquals(actualText, "To");
	String ToDateSelect=pro.ToDateSelect();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath(ToDateSelect)).click();
	String ToDatePicker=pro.ToDatePicker();
	List<WebElement>dateList=driver.findElements(By.xpath(ToDatePicker));
	for(WebElement ele:dateList) {
		String s=ele.getAttribute("innerHTML");
		if(s.contains("17")) {
			Actions act=new Actions(driver);
			act.moveToElement(ele).click().build().perform();
			break;
		}
	}
	
	Thread.sleep(3000);

	String Text=pro.ShowLeaveText();
	String ActualText=driver.findElement(By.xpath(Text)).getText();
	Assert.assertEquals(ActualText, "Show Leave with Status");
	
	String Select=pro.SelectLeaveStatus();
	List<WebElement>leaveStatusList=driver.findElements(By.xpath(Select));
	for(int i=0;i<leaveStatusList.size();i++) {
		String s=leaveStatusList.get(i).getText();
		if(s.contentEquals("All")) {
			leaveStatusList.get(i).click();
			break;
		}
	}
	
	String empText=pro.EmployeeText();
	String ActualEmpText=driver.findElement(By.xpath(empText)).getText();
	Assert.assertEquals(ActualEmpText,"Employee");
	
	String EmppTextField=pro.EmployeeTextField();
	driver.findElement(By.xpath(EmppTextField)).sendKeys("Ram");
	
	String SubUnitText=pro.SubUnit();
	String ActualSubUnit=driver.findElement(By.xpath(SubUnitText)).getText();
	Assert.assertEquals(ActualSubUnit,"Sub Unit");
	
	String SubUnitDD=pro.SubUnitDropDown();
	driver.findElement(By.xpath(SubUnitDD)).click();
	String subUnitDDContent=pro.subUnitDDContent();
	List<WebElement> DD=driver.findElements(By.xpath(subUnitDDContent));
	for(WebElement ele:DD) {
		String s=ele.getAttribute("innerHTML");
		if(s.contentEquals("Human Resources")) {
			ele.click();
			break;
		}
	}

	String PastEmpText=pro.PastEmpText();
	String ActualPastEmp=driver.findElement(By.xpath(PastEmpText)).getText();
	Assert.assertEquals(ActualPastEmp,"Include Past Employees");
	
	String pastEmpCheckbox=pro.pastEmpCheckBox();
	driver.findElement(By.xpath(pastEmpCheckbox)).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@id=\"btnSearch\"]")).click();
}

}
