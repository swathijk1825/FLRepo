package verifyingGooglesearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpenGoogle {
	
	WebDriver driver;
	
	
	@Test
	public void launchBrowser() {
		System.out.println("launching firefox browser"); 
		System.setProperty("webdriver.firefox.marionette", "F:\\SeleniumDrivers\\Drivers\\Geckodriver.exe");
		//System.setProperty("webdriver.firefox.marionette","G:\\Selenium\\Firefox driver\\geckodriver.exe");
		 
		driver = new FirefoxDriver();
	

		driver.get("http://www.google.com");
	
	
		}

}
