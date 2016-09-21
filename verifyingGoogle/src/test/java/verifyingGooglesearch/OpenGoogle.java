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
	
	@Test
	public void SayHi() {
		System.out.println("Lets get the shit out of the life"); 
		System.out.println("I hate this women"); 
		
		
	
	
		}

}
