package week5.Ass.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNgBaseClass 
{

	public ChromeDriver driver;

	@BeforeMethod
	public  void preConditions() throws InterruptedException
	{
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
				
		driver=new ChromeDriver(option);
		
		// TO MAXIMIZE THE WINDOW
		driver.manage().window().maximize();
		
		//IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		//TO LOAD THE URL
		driver.get("https://login.salesforce.com");
		
		//TO ENTER USER ID
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		
		//TO ENTER PASSWORD
		driver.findElement(By.id("password")).sendKeys("testleaf@2024");
		
		//TO PRESS LOGIN BUTTON
		driver.findElement(By.id("Login")).click();
		Thread.sleep(3000);
		
		
	}

	@AfterMethod
	public  void postConditions()
	{
		driver.close();
	}
}
