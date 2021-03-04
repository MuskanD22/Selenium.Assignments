package assignments.ddt.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyPage {
	Properties pro;
	public PropertyPage()  {
		try{
		File src=new File("C:\\Users\\muskan.dureja\\eclipse-workspace\\Selenium.assignments\\src\\main\\resources\\OrangeHRM.properties");
		FileInputStream fis=new FileInputStream(src);
		pro=new Properties();
		// Load file so we can use into our script
		pro.load(fis);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	public String getUsername() {
		String user=pro.getProperty("orange.username.xpath");
		return user;
	}
	public String ForgotPass() {
		String click=pro.getProperty("orange.forgotPass.xpath");
		return click;
	}
	
	public String getPassword() {
		String pass=pro.getProperty("orange.password.xpath");
		return pass;
	}
	
	public String getLoginButton() {
		String click=pro.getProperty("orange.login.xpath");
		return click;
	}
	
	public String getValidText() {
		String text=pro.getProperty("orange.text.xpath");
		return text;
	}
	
	public String getFooterText() {
		String text=pro.getProperty("orange.footerText.xpath");
		return text;	
	}
	public String getFooterLink() {
		String text=pro.getProperty("orange.footerLink.xpath");
		return text;	
	}
	
	public String getSocialLinklnLink() {
		String link=pro.getProperty("orange.SocialL.xpath");
		return link;
	}
	
	public String getSocialFacbookLink() {
		String link=pro.getProperty("orange.SocialF.xpath");
		return link;
	}
	
	public String getSocialTweeterLink() {
		String link=pro.getProperty("orange.SocialT.xpath");
		return link;
	}
	public String getSocialYoutubeLink() {
		String link=pro.getProperty("orange.SocialY.xpath");
		return link;
	}
	
	public String getdropDown() {
		String click=pro.getProperty("orange.dashboard.login.xpath");
		return click;
	}
	
	public String getAbout() {
		String click=pro.getProperty("orange.dashboard.about.xpath");
		return click;
	}
	public String AboutAlert() {
		String alert=pro.getProperty("orange.dashboard.about.alert");
		return alert;
	}
	public String AboutAlertCancel() {
		return (pro.getProperty("orange.dashboard.about.cancel"));
	}
	
	public String Logout() {
		return pro.getProperty("orange.dashboard.logout");
	}
	public String QuestionMarkLink() {
		return pro.getProperty("orange.dashboard.QuestionMark");
	}
	
	public String SubscriberLink() {
		return pro.getProperty("orange.dashboard.Subscriber");
	}
	
	public String MarketplaceLink() {
		return pro.getProperty("orange.dashboard.Marketplace");
	}
	
	public String imgLink() {
		return pro.getProperty("orange.dashboard.img");
	}
	
	public String DashboardURL() {
		return pro.getProperty("orange.dashboard.url");
	}
	public String menubar() {
		return pro.getProperty("orange.menubar.xpath");
	}

	public String SearchDropDown() {
		return pro.getProperty("SearchDropDown.xpath");
	}
	
	public String TestAdminLinks() {
		return pro.getProperty("TestAdminLinks.xpath");
	}
	public String AdminDropdown() {
		return pro.getProperty("Admin.Dropdown.xpath");
	}
	public String TestPIMLinks() {
		return pro.getProperty("TestPIMLinks.xpath");
	}
	public String PIMdropdown() {
		return pro.getProperty("PIM.Dropdown.xpath");
	}
	public String TestLeaveLinks() {
		return pro.getProperty("TestLeaveLinks.xpath");
	}
	public String LeaveDropDown() {
		return pro.getProperty("Leave.dropDown.xpath");
	}
	public String TestTimeLinks() {
		return pro.getProperty("TestTimeLinks.xpath");
	}
	
	public String TimeDropdown() {
		return pro.getProperty("Time.dropdown.xpath");
	}
	
	public String TestRecruitmentLinks() {
		return pro.getProperty("TestRecruitmentLinks.xpath");
	}
	
	public String RecruitmentDropdown() {
		return pro.getProperty("recruitment.dropdown.Xpath");
	}
	public String DashboardHeading() {
		return pro.getProperty("DashboardHeading.xpath");
	}
	public String QuickLaunchHeading() {
		return pro.getProperty("QuickLaunchHeading.xpath");
	}
	public String AssignLeaveHeading() {
		return pro.getProperty("AssignLeaveHeading.xpath");
	}
	
	public String LeaveListHeading() {
		return pro.getProperty("LeaveListHeading.xpath");
	}
	
	public String TimesheetsHeading() {
		return pro.getProperty("TimesheetsHeading.xpath");
	}
	public String ApplyLeaveHeading() {
		return pro.getProperty("ApplyLeaveHeading.xpath");
	}
	
	public String MyLeaveHeading() {
		return pro.getProperty("MyLeaveHeading.xpath");
	}
	public String MyTimesheetHeading() {
		return pro.getProperty("MyTimesheetHeading.xpath");
	}
	public String EmployeeDistributionHeading() {
		return pro.getProperty("EmployeeDistributionHeading.xpath");
	}
	public String Legend() {
		return pro.getProperty("Legend.xpath");
	}
	
	public String PendingLeave() {
		return pro.getProperty("PendingLeave.xpath");
	}
	public String LinkAssignLeave() {
		return pro.getProperty("TestLinkAssignLeave.xpath");
	}
	public String LinkViewLeaveList() {
		return pro.getProperty("TestLinkViewLeaveList.xpath");
	}
	public String LinkViewEmployeeTimesheet() {
		return pro.getProperty("TestLinkViewEmployeeTimesheet.xpath");
	}
	public String LinkApplyLeave() {
		return pro.getProperty("TestLinkApplyLeave.xpath");
	}
	
	public String LinkViewMyLeaveList() {
		return pro.getProperty("TestLinkViewMyLeaveList.xpath");
	}
	public String LinkViewMyTimesheet() {
		return pro.getProperty("TestLinkViewMyTimesheet.xpath");
	}
	
}
