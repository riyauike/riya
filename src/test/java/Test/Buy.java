package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.Buyshare;
import POM.ZerodaLogin;
import Utility.Excel;
import poja.Browser;

public class Buy {
	WebDriver drivers;
	
	@BeforeMethod
	public void lunchbrowser() throws IOException {
		drivers = Browser.OpenBrowser("https://kite.zerodha.com");
		String username = Excel.getTestData(0, 1, "Crediential");
		String password =Excel.getTestData(1, 1, "Crediential");
		String pinnumber =Excel.getTestData(2, 1, "Crediential");
		
		ZerodaLogin zerodhalogin =new ZerodaLogin(drivers);
	zerodhalogin.Enteruserrname(username);
	zerodhalogin.Enterpass(password);
	zerodhalogin.EnterLogin();
	zerodhalogin.Enterpin(pinnumber);
	zerodhalogin.Clickonsubmit();
	}
	
	@Test
	public void buyshare() throws InterruptedException  {
		Buyshare buysh = new Buyshare(drivers);
		buysh.selectstockfromlist(drivers, "share");
		buysh.clickonBuy();
	
	}
	
	@Test 
	public void Search()
	{
		Buyshare Riya = new Buyshare(drivers);
		Riya.Searchpath(drivers, "TARC");
	}
	
	

}
