package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {

	public WebDriver driver;

	public OffersPage(WebDriver driver) //Driver is activated from the step defination
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	By search=By.cssSelector("input[type='search']");//objects
	By productName=By.cssSelector("tr td:nth-child(1)");
	
	
	public void searchItem(String name)
	{
//		testContextSetup.driver.findElement(By.cssSelector("input[placeholder='Search for Vegetables and Fruits']")).sendKeys(shortName);
		driver.findElement(search).sendKeys(name);
	}
	public void getSearchItem(String name)
	{
//		testContextSetup.driver.findElement(By.cssSelector("input[placeholder='Search for Vegetables and Fruits']")).sendKeys(shortName);
		driver.findElement(search).getText();
	}
	public String getProductName()
	{
		return driver.findElement(productName).getText();
	}
	
}
