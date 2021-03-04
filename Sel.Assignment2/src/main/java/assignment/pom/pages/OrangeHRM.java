package assignment.pom.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrangeHRM {
	
	public WebDriver driver;
	
	public  OrangeHRM(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(id="txtUsername") WebElement username;
	
	@FindBy(how=How.ID,using="txtPassword") WebElement password;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnLogin']") WebElement submit_button;
	
	@FindBy(how=How.LINK_TEXT, using="Forgot your password?")public WebElement forgot_pass;
	
	@FindBy(how= How.XPATH, using="//*[@id=\"content\"]/div[1]/div[2]/h1")
	public WebElement Forgot_pass_page; 
	
	@FindBy(xpath="//*[@id=\"spanMessage\"]") WebElement invalid;
	public void loginOrangeHRM(String uid, String pass) {
		username.sendKeys(uid);
		password.sendKeys(pass);
		submit_button.click();
	}
}

