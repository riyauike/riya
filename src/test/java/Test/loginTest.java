package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.ZerodaLogin;
import Utility.Excel;
import poja.Browser;

public class loginTest {
	public class ZerodhaLogin {
		WebDriver drivers;
		@BeforeMethod
		public void callbrowser() {
		 drivers = Browser.OpenBrowser("https://kite.zerodha.com/");
		}
		
		@Test
		public void testing1() throws IOException {
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

	}
}
