package admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class logout {
	
	WebDriver driver;
	
	@Test
	
	public void logout() throws InterruptedException
	{
		
		
		
			driver = new FirefoxDriver();
		

		driver.get("https://qa-nursing.kaptest.com/A_Login.aspx");
		
		driver.findElement(By.xpath(".//*[@id='TxtUserName']")).sendKeys("admin-cinzia");
		
		driver.findElement(By.xpath(".//*[@id='TxtPassword']")).sendKeys("admin-cinzia");
		driver.findElement(By.xpath(".//*[@id='BtnLogIn']")).click();
		
	
		
		driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_ucAdminAccountMenu_hyplnkViewInstitutionList']")).click();
		
		Thread.sleep(3000);
		
		new WebDriverWait(driver, 150).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ctl00_ContentPlaceHolder1_ddlProgramofStudy")));
		WebElement programOfStudy = driver
				.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_ddlProgramofStudy"));
		Select dropdown = new Select(programOfStudy);
  		dropdown.selectByVisibleText("PN");
  	//	programOfStudy.sendKeys("RN");
 		
  		
	}	//dropdown.selectByIndex(0);
		//Library.highLightElement(driver, programOfStudy).sendKeys(pname);
		
		
	//	WebElement selectElement = (new WebDriverWait(driver, 70)).until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_ContentPlaceHolder1_ddlProgramOfStudy")));
		//driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlProgramOfStudy']"));

		//Select select42 = new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlProgramOfStudy']")));

		}
		
		

		
		
		
		
		
				
		
		
	


