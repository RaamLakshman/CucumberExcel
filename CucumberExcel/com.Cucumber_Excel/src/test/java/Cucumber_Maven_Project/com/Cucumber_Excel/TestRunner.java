package Cucumber_Maven_Project.com.Cucumber_Excel;




import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

 
@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"Features/LogIn_Test.feature"},
    glue = {"Cucumber_Maven_Project/com/Cucumber_Excel"},
   plugin = {"com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\Admin\\workspace\\CucumberMavenExcel\\com.Cucumber_Excel\\target\\ExtentReport\\report.html"},
    monochrome=true
)
public class TestRunner {
	
}