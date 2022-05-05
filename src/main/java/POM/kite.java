package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kite {
	@FindBy(xpath="//a[@class='text-light']")private WebElement signin;
	@FindBy(xpath="//img[@class=\"logo-img\"]")private WebElement logo;
	@FindBy(xpath="//input[@id='user_mobile']")private WebElement mobileNumber;
	
	
	public kite(WebDriver drivers){
		PageFactory.initElements(drivers, this);
	    }
	
	public void clickonSignup() {
		signin.click();
	    }
	
	public String getpagetitle(WebDriver driver) {
		   return  driver.getTitle();
	    }
	
	public boolean logoisdisplayed() {
		return logo.isDisplayed();
	    }
    
	public void entremobilenumber(String number) {
		mobileNumber.sendKeys(number);
	}
}