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
import PomClasses.LoginPage;

public class VerifyUserCanLogin {
	
	static WebDriver driver;
	String browser;
	LoginPage lp;
	
	@BeforeClass
	@Parameters ("browser")
	public void beforeClass(String br)
	{
		driver = Base1.getDriver(br);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		lp = new LoginPage(driver);
	}
	
	@Test
	public void verifyUserCanLogin() throws InterruptedException
	{
		lp.enterEmail();
		lp.enterPassword();
		lp.clickLoginBtn();
		
		HomePage hp = new HomePage(driver);
		Assert.assertTrue(hp.getProfileName());
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
