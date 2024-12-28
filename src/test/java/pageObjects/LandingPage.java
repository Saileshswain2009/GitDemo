package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	private By search=By.cssSelector("input[placeholder='Search for Vegetables and Fruits']");//Encapsulation
	private By productName=By.xpath("//h4[contains(text(),'Tomato - 1 Kg')]");
	By topDeals=By.xpath("//div/a[contains(text(),'Top Deals')]");
	
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
	public void selectTopDealsPage()
	{
		driver.findElement(topDeals).click();
	}
	
}
