package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public LandingPage landingPage;
	public OffersPage offerPage;
	public WebDriver driver;
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public LandingPage getLandingPage()
	{
		landingPage=new LandingPage(driver);
		return landingPage;
	}
	public OffersPage OffersPage()
	{
		offerPage=new OffersPage(driver);//Every page object class except driver as an arg for its constructor.
		return offerPage;
	}
}
