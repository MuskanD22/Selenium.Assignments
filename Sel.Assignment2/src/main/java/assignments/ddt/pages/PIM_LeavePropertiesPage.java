package assignments.ddt.pages;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PIM_LeavePropertiesPage {

	Properties pro;
	public PIM_LeavePropertiesPage()  {
		try{
		File src=new File("C:\\Users\\muskan.dureja\\eclipse-workspace\\Selenium.assignments\\src\\main\\resources\\PIM_LeavePage.properties");
		FileInputStream fis=new FileInputStream(src);
		pro=new Properties();
		// Load file so we can use into our script
		pro.load(fis);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	public String DashboardURL() {
		return pro.getProperty("orange.dashboard.url");
	}
	
	public String menubar() {
		return pro.getProperty("orange.menubar.xpath");
	}
	public String PIMHeading() {
		return pro.getProperty("PIMHeading.xpath");
	}
	public String EmpName() {
		return pro.getProperty("EmpName.xpath");
	}
	
	public String EmpnameTextField() {
		return pro.getProperty("EmpName.TextField.xpath");
	}
	public String Id() {
		return pro.getProperty("Id.xpath");
	}
	public String IDTextField() {
		return pro.getProperty("Id.TextField.xpath");
	}
	public String EmpStatusText() {
		return pro.getProperty("EmpStatusText.xpath");
	}
	public String EmpStatusTextField() {
		return pro.getProperty("EmpStatus.TextField.xpath");
	}
	public String EmpStatusSelect() {
		return pro.getProperty("EmpStatus.Select.xpath");
	}
	public String IncludeText() {
		return pro.getProperty("IncludeText.xpath");
	}
	public String IncludeTextField() {
		return pro.getProperty("Include.TextField.xpath");
	}
	
	public String IncludeSelect() {
		return pro.getProperty("Include.Select.xpath");
	}
	public String supervisorNameText() {
		return pro.getProperty("supervisorNameText.xpath");
	}
	
	public String supervisorNameTextField() {
		return pro.getProperty("supervisorName.TextField.xpath");
	}
	public String jobTitleText() {
		return pro.getProperty("jobTitleText.xpath");
	}
	
	public String jobTitleTextField() {
		return pro.getProperty("jobTitle.TextField.xpath");
	}
	public String jobTitleSelect() {
		return pro.getProperty("jobTitle.Select.xpath");
	}
	public String subUnitText() {
		return pro.getProperty("subUnitText.xpath");
	}
	public String subUnitTextField() {
		return pro.getProperty("subUnit.TextField.xpath");
	}
	public String subUnitSelect() {
		return pro.getProperty("subUnit.Select.xpath");
	}
	
	public String searchButton() {
		return pro.getProperty("searchButton.xpath");
	}	
	//////////////////////////////////Leave Page //////////////////////////////////////////////////////////////////////////////
	
	public String LeaveHeading() {
		return pro.getProperty("LeaveHeading.xpath");
	}
	public String FromDate() {
		return pro.getProperty("FromDate.xpath");
	}
	public String FromDateSelect() {
		return pro.getProperty("FromDateSelect.xpath");
	}
	public String FromDatePicker() {
		return pro.getProperty("FromDatePicker.xpath");
	}
	
	public String ToDate() {
		return pro.getProperty("ToDate.xpath");
	}
	public String ToDateSelect() {
		return pro.getProperty("ToDateSelect.xpath");
	}
	public String ToDatePicker() {
		return pro.getProperty("ToDatePicker.xpath");
	}
	public String MonthDD() {
		return pro.getProperty("MonthDD.xpath");
	}
	public String MonthDDSelect() {
		return pro.getProperty("MonthDDSelect.xpath");
	}
	
	public String ShowLeaveText() {
		return pro.getProperty("ShowLeave.xpath");
	}
	public String SelectLeaveStatus() {
		return pro.getProperty("SelectLeaveStatus.xpath");
	}
	public String EmployeeText() {
		return pro.getProperty("EmployeeText.xpath");
	}
	public String EmployeeTextField() {
		return pro.getProperty("EmployeeTextField.xpath");
	}
	public String SubUnit() {
		return pro.getProperty("SubUnit.xpath");
	}
	public String SubUnitDropDown() {
		return pro.getProperty("SubUnitDropDown.xpath");
	}
	public String PastEmpText() {
		return pro.getProperty("PastEmpText.xpath");
	}
	public String pastEmpCheckBox() {
		return pro.getProperty("pastEmpCheckBox.xpath");
	}
	public String subUnitDDContent() {
		return pro.getProperty("subUnitDDContent.xpath");
	}
	
	
}
