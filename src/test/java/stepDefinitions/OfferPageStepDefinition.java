package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import pageObjects.PageObjectManager;
import utils.TestContexSetup;

public class OfferPageStepDefinition {

	public WebDriver driver;
	public String landingPageproductName;
	public String offerPageProductName;
	public TestContexSetup testContextSetup;
	public PageObjectManager pageObjectManager;
	//Single responsibility Principle
	//Loosly coupled
	public OfferPageStepDefinition(TestContexSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}
	@Then("user searched for {string} shortname in offers page")
	public void user_searched_for_same_shortname_in_offers_page(String shortname1) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		switchToOffersPage();
		OffersPage offersPage=testContextSetup.pageObjectManager.OffersPage();                     // new OffersPage(testContextSetup.driver);
		offersPage.searchItem(shortname1);
//		testContextSetup.driver.findElement(By.cssSelector("input[type='search']")).sendKeys(shortname1);
		Thread.sleep(2000);
		offerPageProductName = offersPage.getProductName();
	}
	
	public void switchToOffersPage()
	{
		//if switched to offer page->skip below part
		//if(testContextSetup.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers"))
		//pageObjectManager=new PageObjectManager(testContextSetup.driver);
		LandingPage landingPage=testContextSetup.pageObjectManager.getLandingPage();
		landingPage.selectTopDealsPage();
		testContextSetup.genericUtils.SwitchWindowToChild();
	}
	@Then("Validate product name in offers page matches with Landing page")
	public void validate_product_name_in_Offers_page() {
		Assert.assertEquals(offerPageProductName, testContextSetup.landingPageproductName);
	}

}
