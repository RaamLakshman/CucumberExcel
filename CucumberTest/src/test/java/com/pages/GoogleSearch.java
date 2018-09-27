package com.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;


@DefaultUrl("https://google.co.in")
public class GoogleSearch extends PageObject{

	

	@FindBy(name="q")
    private WebElementFacade searchElement;

    @FindBy(xpath="//cite[@class='_Rm']")
    private List<WebElementFacade> PrintLinks;
    
    @FindBy(linkText="Aviva Life Insurance - Login")
    private WebElementFacade ClickURL;
    
    
    
    public void searchBox(String keyword){
    	getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	getDriver().manage().window().maximize();
    	searchElement.type(keyword);
    }
    public void searchButton(){
    	searchElement.submit();
    }
    public void printURL(){
    	System.out.println(PrintLinks.size());
    	System.out.println("URL List:");
    	System.out.println("URL List:");
    	for(WebElement loop : PrintLinks){
    		System.out.println(loop.getText());
    	}
    }
    	
 public void printLinkText(int index)   {
	 String linkText=PrintLinks.get(index-1).getText();
	 System.out.println("--------------------------");
	 System.out.println("Text of "+ index + "Link is : " +linkText);
    	
    }
  public void clickLinkURL() {
	  ClickURL.click();
  }
    
    
}


