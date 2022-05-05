package poja;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {
	public static WebDriver OpenBrowser(String url)
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver","D:\\KiteZerodha\\src\\main\\resources\\chromedriver.exe");
  WebDriver drivers = new ChromeDriver(options);
  drivers.get(url);
  drivers.manage().window().maximize();
 drivers.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
  return drivers;
	}

}
 