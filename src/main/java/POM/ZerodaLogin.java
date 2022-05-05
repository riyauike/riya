package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import Utility.Excel;
import poja.Browser;

public class ZerodaLogin {
	
		
		@FindBy(xpath="//input[@id=\"userid\"]")private WebElement name;
		
		@FindBy(xpath="//input[@id=\"password\"]")private WebElement pass;
		
		@FindBy(xpath="//button[@type=\"submit\"]")private WebElement submit;
		
		@FindBy(xpath="//input[@id=\"pin\"]")private WebElement pin;
		
		@FindBy(xpath="//button[@type='submit']")private WebElement login;
		
		public ZerodaLogin(WebDriver drivers)
		{
			PageFactory.initElements(drivers, this);
		}
		 
		public void Enteruserrname(String user)
		{
			name.sendKeys(user);
		}
		
		public void Enterpass(String password)
		{
			pass.sendKeys(password);
		}
		
		public void EnterLogin()
		{
			submit.click();
		}
		
		public void Enterpin(String Pin)
		{
			pin.sendKeys(Pin);
		}
		public void  Clickonsubmit()
		{
			login.click();
		}
	
}
