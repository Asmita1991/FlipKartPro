package TestClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BsaeClasses.Base1;
import PomClasses.HomePage;


public class VerifyUserCanAddAddress {
	
	static WebDriver driver;
	String browser;
	HomePage hp;
	
	@BeforeClass
	@Parameters ("browser")
	public void beforeClass(String br)
	{
		driver = Base1.getDriver(br);
	}
	
	@BeforeMethod
	public void beforeMethod() 
	{
		hp = new HomePage(driver);
		
	}
	
	@Test
	public void verifyUserCanAddAddress() throws InterruptedException
	{
		hp.moveToMousecProfileName();
		hp.clkMyProfile();
	}
	
	@AfterMethod
	public void afterMethod()
	{
		
	}


	@AfterClass
	public void afterClass()
	{
		
	}


}
