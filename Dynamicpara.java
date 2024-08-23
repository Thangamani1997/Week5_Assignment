package week5.Ass.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dynamicpara extends DynamicParaBaseclass 
{
	
	@DataProvider(name="Legal Entity Name")
	public String[][] setValue()
	{
		String[][] data= {{"Salesforce Automation by Thangamani"}, {"Salesforce Automation by Prithivi"}};
		return data;
	}
	
	@Test(dataProvider ="Legal Entity Name")

	public void testngAnno (String name) throws InterruptedException 
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
		Thread.sleep(2000);

	 
	 	//to Click on the Dropdown icon in the legal Entities tab
	 	driver.findElement(By.xpath("(//a[@class='slds-button slds-button_reset'])[14]")).click();
	 	Thread.sleep(2000);
	 	
	 	//to click on new legal entity
	 	driver.findElement(By.xpath("//span[text()='New Legal Entity']/ancestor::one-app-nav-bar-menu-item")).click();
	 	Thread.sleep(2000);
		 	
	 	//to enter legal entity name 
	 	driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys(name);
	 	Thread.sleep(2000);
	 	
	 		 	
	 	//to Click on Save
	 	driver.findElement(By.xpath("//button[text()='Save']")).click();
	 	
	 	//to Verify the legal entity name
		WebElement element1 = driver.findElement(By.xpath("//span[text()='Legal Entity']"));
		String entityname = element1.getText();
		System.out.println(entityname);
	}

}
