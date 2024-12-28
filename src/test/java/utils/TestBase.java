package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir","\\src\\test\\resources\\global.properties"));
		prop.load(fis);
		String url=prop.getProperty("QAUrl");
		if(driver == null)
		{
			if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
			{
		System.setProperty("webdriver.chrome.driver","\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
			}
			else if(prop.getProperty("browser").equalsIgnoreCase("edge"))
			{
				//Edge
			}
			else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
			{
				//Firefox
			}
		}
		driver.get(url);
		return driver;
	}
	
}
