package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Testrightclick{  
	    WebDriver driver;
	    @Test
	    public void click() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver",".//chromedriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get(" https://itera-qa.azurewebsites.net/");
		driver.manage().window().maximize();
		WebElement text= driver.findElement(By.xpath("//*[@id=\"navbarColor01\"]/form/input"));
		Actions  builder = new Actions(driver);
		builder.moveToElement(text)
		       .sendKeys(text,"keerthi")
		       .contextClick()
		        . perform();
		Thread.sleep(4000);
		driver.quit();
		
	}

	
}
