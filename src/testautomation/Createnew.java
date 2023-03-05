package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Createnew {

	WebDriver driver;
	@Test
	public void log() throws InterruptedException {
	System.setProperty("webDriver.driver",".//chromedriver//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://itera-qa.azurewebsites.net/Login");
	driver.findElement(By.name("Username")).sendKeys("raji");
	driver.findElement(By.name("Password")).sendKeys("Gang#789");
	driver.findElement(By.name("login")).click();
	Thread.sleep(4000);
	
	driver.navigate().to(" https://itera-qa.azurewebsites.net/Dashboard");
	driver.manage().window().maximize();
	WebElement createnew = driver.findElement(By.xpath("/html/body/div/div/p[1]/a"));
	createnew.click();
	driver.navigate().to("https://itera-qa.azurewebsites.net/Customer/Create");
	
	driver.findElement(By.xpath("//*[@id=\'Name\']")).sendKeys("keerthi");
	driver.findElement(By.xpath("//*[@id=\'Company\']")).sendKeys("wipro");
	driver.findElement(By.xpath("//*[@id=\'Address\']")).sendKeys("rk street");
	driver.findElement(By.xpath("//*[@id=\'City\']")).sendKeys("chennai");
	driver.findElement(By.xpath("//*[@id=\'Phone\']")).sendKeys("9977553344");
	driver.findElement(By.xpath("//*[@id=\'Email\']")).sendKeys("sharmilakanthuri051@gmail.com");
    WebElement create =	driver.findElement(By.xpath("/html/body/div/form/div/div[7]/div/input"));
	create.click();
	driver.navigate().to("https://itera-qa.azurewebsites.net/Dashboard");
    driver.findElement(By.xpath(" //*[@id=\"searching\"]")).sendKeys("keerthi");
    driver.findElement(By.xpath("/html/body/div/div/form/input[2]")).click();
	Thread.sleep(4000);
    driver.navigate().to("https://itera-qa.azurewebsites.net/Login"); 
    Thread.sleep(4000);
    driver.quit();
	}
	
}
