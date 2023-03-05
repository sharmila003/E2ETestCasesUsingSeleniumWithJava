package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

	WebDriver driver;
	@Test
	public void log() throws InterruptedException {
	System.setProperty("webDriver.driver",".//chromedriver//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(" https://itera-qa.azurewebsites.net/");
	driver.manage().window().maximize();
	WebElement log = driver.findElement(By.xpath("//*[@id=\"navbarColor01\"]/form/ul/li[2]/a"));
	log. click();
	driver.navigate().to("https://itera-qa.azurewebsites.net/Login");

	driver.findElement(By.name("Username")).sendKeys("raji");
	driver.findElement(By.name("Password")).sendKeys("Gang#789");
	driver.findElement(By.name("login")).click();
	Thread.sleep(4000);
	driver.navigate().to(" https://itera-qa.azurewebsites.net/Dashboard");
	driver.quit();
	
	}
}
