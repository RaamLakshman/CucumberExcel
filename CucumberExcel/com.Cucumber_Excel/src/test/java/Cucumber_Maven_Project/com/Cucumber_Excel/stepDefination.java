package Cucumber_Maven_Project.com.Cucumber_Excel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefination extends POM{
	
	WebDriver driver;
	POM facebook;
	ExtentReports extent;
	
	
	
	
	@Given("^I am on the FB homepage$")
	public void i_am_on_the_FB_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.fb.com");
	}

	@When("^enter UserName and Password$")
	public void enter_UserName_and_Password() throws Throwable {
		
		driver.findElement(By.name("email")).sendKeys("raam");
		driver.findElement(By.name("pass")).sendKeys("1234");
		
		
	   
	}

	@Then("^Click on Submit$")
	public void click_on_Submit() throws Throwable {
		//facebook.click_Login();
		driver.findElement(By.id("loginbutton")).click();
	   
	}

	



}
