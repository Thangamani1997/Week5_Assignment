package week5.Ass.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Staticpara extends StaticParaBaseclass
{
@Test
	public void testngAnno () throws InterruptedException 
	{
		
		//to Click on the toggle menu button from the left corner
	 	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	 
	 	//to Click View All 
	 	driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
	 		 
	 	//to click Legal Entities from App Launcher
	 	WebElement element0 = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
	 	Actions action = new Actions(driver);
		action.scrollToElement(element0).perform();
		element0.click();

	 
	 	//to Click on the Dropdown icon in the legal Entities tab
	 	driver.findElement(By.xpath("(//a[@class='slds-button slds-button_reset'])[14]")).click();
	 	Thread.sleep(2000);
	 	
	 	//to click on new legal entity
	 	driver.findElement(By.xpath("//span[text()='New Legal Entity']/ancestor::one-app-nav-bar-menu-item")).click();
	 	Thread.sleep(2000);
		 	
	 	//to enter company name 
	 	driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("TestLeaf");
	 	Thread.sleep(2000);
	 	
	 	//to Enter Description as 'Salesforces'
	 	driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
	 	Thread.sleep(2000);
	 	
	 	//to Select Status as 'Active'
	 	WebElement status = driver.findElement(By.xpath("//button[contains(@class,'combobox__input-value')]"));
	 	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", status);
		status.click();
	 	Thread.sleep(2000);
	 	
	 	driver.findElement(By.xpath("//span[text()='Active']")).click();
	 	Thread.sleep(2000);
	 	//to Click on Save
	 	driver.findElement(By.xpath("//button[text()='Save']")).click();
	 	
	 	//to Verify the Alert message (Complete this field) displayed for Name
	 	WebElement element = driver.findElement(By.xpath("//div[@class='slds-form-element__help']"));
	 	System.out.println("Alert Message - "+element.getText());
	}

}
