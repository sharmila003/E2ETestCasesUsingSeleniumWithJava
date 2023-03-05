package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Register {

 	WebDriver driver;
	@Test
	public void openapp() throws InterruptedException {
	System.setProperty("webDriver.driver",".//chromedriver//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(" https://itera-qa.azurewebsites.net/");
	driver.manage().window().maximize();
	WebElement signup = driver.findElement(By.xpath("//*[@id=\'navbarColor01\']/form/ul/li[1]/a"));
	 signup. click();
	driver.navigate().to(" https://itera-qa.azurewebsites.net/UserRegister/NewUser");
	/*}
	@Test
	public void formfill() throws InterruptedException {*/
	
		driver.findElement(By.xpath(" //*[@id=\'FirstName\']")).sendKeys("rama");	
		driver.findElement(By.name("Surname")).sendKeys("kuru");
		driver.findElement(By.xpath("//*[@id=\'E_post\']")).sendKeys("abefgh");
		driver.findElement(By.xpath("//*[@id=\'Mobile\']")).sendKeys("9944773355");
		driver.findElement(By.xpath(" //*[@id=\'Username\']")).sendKeys("raji001");
		driver.findElement(By.xpath("//*[@id=\'Password\']")).sendKeys("Gang#789");
		driver.findElement(By.xpath("//*[@id=\'ConfirmPassword\']")).sendKeys("Gang#789");
        WebElement submit = driver.findElement(By.xpath("//*[@id=\'submit\']"));
	    submit.click();
	    Thread.sleep(4000);
	    
	 	WebElement registersuccessfully = driver.findElement(By.xpath("/html/body/div/form/div/div[9]/div/label\r\n"));
	 			
		boolean status = registersuccessfully.isDisplayed();
		Assert.assertEquals(status, true);	
	     driver.quit();	 
	    	 
	     }  	     
	}
	

