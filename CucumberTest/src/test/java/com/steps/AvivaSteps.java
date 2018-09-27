package com.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.pages.AvivaHomePage;
import com.pages.GoogleSearch;


public class AvivaSteps {

    @Steps
    AvivaHomePage AvivaHome;
    GoogleSearch Google;

    @Given("^I want to open the Browser and Start the Application$")
    public void i_want_to_open_the_Browser_and_Start_the_Application() throws Exception {
       Google.open();
    }


    @When("^I enter some value '(.*)' in the Google Search box$")
    public void i_enter_some_value_Aviva_in_the_Google_Search_box(String input) throws Exception {
        Google.searchBox(input);
    }

    @When("^I should click on Google Submit Button$")
    public void i_should_click_on_Google_Submit_Button() throws Exception {
    	Google.searchButton();
    }

    @Then("^Count and Print Number of Links in the Google$")
    public void count_and_Print_Number_of_Links_in_the_Google() throws Exception {
    	Google.printURL();
    }

    @Then("^Print the text of '(\\d+)' link in the Google Page$")
    public void print_the_text_of_link_in_the_Google_Page(int index) throws Exception {
       Google.printLinkText(index);
    }

    @Then("^click on Aviva Login Link in the Google Search$")
    public void click_on_Aviva_Login_Link_in_the_Google_Search() throws Exception {
     Google.clickLinkURL();
    }

    @Then("^validate the'(.*)' of the Home Page$")
    public void validate_the_Aviva_Life_Insurance_Login_of_the_Home_Page(String ExpectedTitle) throws Exception {
    	  AvivaHome.validatePageTitle(ExpectedTitle);
    }

    @Then("^click on SignUp Button and Submit Button$")
    public void click_on_SignUp_Button_and_Submit_Button() throws Exception {
    	   AvivaHome.signUp();
    	   AvivaHome.submitButton();
    }

    @Then("^validate the text of the ErrorMessage in Aviva Home Page$")
    public void validate_the_text_of_the_ErrorMessage_in_Aviva_Home_Page() throws Exception {
    	    AvivaHome.validateErrorMessage();
    }


}
