package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testautomation {

	WebDriver driver;
	@Test
	public void log() throws InterruptedException {
	System.setProperty("webDriver.driver",".//chromedriver//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://itera-qa.azurewebsites.net/");
	driver.findElement(By.xpath(" //*[@id=\"navbarColor01\"]/ul/li[3]/a")).click();
	driver.navigate().to(" https://itera-qa.azurewebsites.net/home/automation");
	driver.findElement(By.id("name")).sendKeys("abgeft");
	driver.findElement(By.id("phone")).sendKeys("9977552244");
	driver.findElement(By.id("email")).sendKeys("giewsw@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Gang#789");
	driver.findElement(By.id("address")).sendKeys("ngocolony");
	WebElement submit =driver.findElement(By.name("submit"));
	submit.click();
	Thread.sleep(4000);
	
	WebElement radiobutton=driver.findElement(By.id("female"));
	radiobutton.click();
	
	WebElement checkbox=driver.findElement(By.id("friday"));
	checkbox.click();
	
	WebElement firstyear=driver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[1]/div[1]/label"));
	firstyear.click();
	
	WebElement selenium=driver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[2]/div[1]/label"));
	selenium.click();
	
	WebElement testng=driver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[2]/div[3]/label"));
	testng.click();
	Thread.sleep(4000);
	driver.quit();
	
	}
	
}
