package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdownbox {

	
	WebDriver driver;
	@Test
	public void log() throws InterruptedException {
	System.setProperty("webDriver.driver",".//chromedriver//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://itera-qa.azurewebsites.net/home/automation");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	Select drop = new Select(driver.findElement(By.className("custom-select")));
	drop.selectByVisibleText("Italy");
	/*drop.selectByVisibleText("Denmark");
	drop.selectByValue("2");
	drop.selectByIndex(6);
	drop.deselectByValue("9");*/
	Thread.sleep(4000);
	driver.quit();
	}
	
}
