package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContexSetup {

	public WebDriver driver;
	public String landingPageproductName;
	public TestBase testBase;
	public PageObjectManager pageObjectManager;
	public GenericUtils genericUtils;
	
	public TestContexSetup() throws IOException
	{
		testBase=new TestBase();
		pageObjectManager=new PageObjectManager(testBase.WebDriverManager());
		genericUtils=new GenericUtils(testBase.WebDriverManager());
	}
}
