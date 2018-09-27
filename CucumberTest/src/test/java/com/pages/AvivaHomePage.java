package com.pages;



import org.junit.Assert;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://google.co.in")


public class AvivaHomePage extends PageObject{
	
	@FindBy(id="divReg")
	private WebElementFacade SignUp;

	@FindBy(id="ancRegister")
	private WebElementFacade SubmitButton;

	@FindBy(id="lblErrMsg")
	private WebElementFacade ErrorMessage;
	
	

	public void validatePageTitle(String ExpectedTitle){
		String ActualTitle=getDriver().getTitle();
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		
		System.out.println("Expected Title is : " +ExpectedTitle);
		System.out.println("Actual Title is : " +ActualTitle);
		
	}
	public void signUp(){
		SignUp.click();
	}
	
	public void submitButton(){
		SubmitButton.click();
	}
	
	public void validateErrorMessage(){
		String ActualText=ErrorMessage.getText();
		//System.out.println("Expected Title is : Please enter valid details for Client ID or Policy Number, Email ID or Mobile Number, Date of Birth" );
		System.out.println("Actual Title is : " +ActualText);
        //Assert.assertEquals("Please enter valid details forClient ID or Policy Number, Email ID or Mobile Number, Date of Birth", ActualText);
	}
}
