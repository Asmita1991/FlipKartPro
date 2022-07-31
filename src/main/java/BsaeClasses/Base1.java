package BsaeClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base1 {
	
	static WebDriver driver = null;
	
	public static WebDriver getDriver(String browser)
	{
		if(driver == null)
		{
			if(browser.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Browsers\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(browser.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\Browsers\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			return driver;
		}
		else
		{
			return driver;
		}
		
	}

}
