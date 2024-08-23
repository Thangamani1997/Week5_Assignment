package week5.Ass.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class StaticParaBaseclass  
{

	public ChromeDriver driver;
	@Parameters ({"url","uname","pwd"})
	@BeforeMethod
	public  void preConditions(String url, String uname, String pwd) throws InterruptedException
	{
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
				
		driver=new ChromeDriver(option);
		
		// TO MAXIMIZE THE WINDOW
		driver.manage().window().maximize();
		
		//IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		//TO LOAD THE URL
		driver.get(url);
		
		//TO ENTER USER ID
		driver.findElement(By.id("username")).sendKeys(uname);
		
		//TO ENTER PASSWORD
		driver.findElement(By.id("password")).sendKeys(pwd);
		
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
