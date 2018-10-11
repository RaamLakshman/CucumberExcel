package Cucumber_Maven_Project.com.Cucumber_Excel;

import org.hamcrest.Factory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class POM {
	
	public void CheckoutPage(WebDriver driver) {
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.NAME, using = "#email") 
	private WebElement txtbx_FirstName;
	
	@FindBy(how = How.ID, using = "#pass") 
	private WebElement txtbx_LastName;
	
	@FindBy(how = How.ID, using = "loginbutton") 
	private WebElement click_Button;
	
	
	
	public void enter_Email(String name) {
		txtbx_FirstName.sendKeys(name);
		
	}
	
	public void enter_Password(String lastName) {
		txtbx_LastName.sendKeys(lastName);
		
	}
 
	public void click_Login() {
		click_Button.click();
	
	}
	
		
}