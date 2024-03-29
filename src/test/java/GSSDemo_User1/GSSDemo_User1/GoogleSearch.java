package GSSDemo_User1.GSSDemo_User1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleSearch 
{
	WebDriver driver;
	@BeforeTest
	public void initBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumWorkSpace\\Executables\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void searchUFT() throws InterruptedException
	{		
		driver.findElement(By.name("q")).sendKeys("UFT");
		driver.findElement(By.name("q")).clear();
		Thread.sleep(2000);	
	}
	
	@Test
	public void searchSelenium() throws InterruptedException
	{		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).clear();
		Thread.sleep(2000);	
	}
	
	@Test
	public void searchJava() throws InterruptedException
	{		
		driver.findElement(By.name("q")).sendKeys("Java");
		driver.findElement(By.name("q")).clear();
		Thread.sleep(2000);	
	}
	
	@Test
	public void searchAppium() throws InterruptedException
	{		
		driver.findElement(By.name("q")).sendKeys("Appium");
		driver.findElement(By.name("q")).clear();
		Thread.sleep(2000);	
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
