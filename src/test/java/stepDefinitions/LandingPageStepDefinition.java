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
import utils.TestContexSetup;

public class LandingPageStepDefinition {

	public WebDriver driver;
	public String landingPageproductName;
	public String offerPageProductName;
	TestContexSetup testContextSetup;

	public LandingPageStepDefinition(TestContexSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}
	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\SAISWAIN\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
//		testContextSetup.driver = new ChromeDriver();
//		testContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}

	@When("user searched with a Shortname {string} and extracted actual name of the product")
	public void user_searched_with_a_shortname_and_extracted_actual_name_of_the_product(String shortName) throws InterruptedException {
		LandingPage landingPage=testContextSetup.pageObjectManager.getLandingPage();
		landingPage.searchItem(shortName);
		Thread.sleep(2000);
		//testContextSetup.driver.findElement(By.cssSelector("input[placeholder='Search for Vegetables and Fruits']")).sendKeys(shortName);
		testContextSetup.landingPageproductName = landingPage.getProductName().split("-")[0].trim();
		System.out.println(landingPageproductName + "is extracted from Home page");

	}

}
