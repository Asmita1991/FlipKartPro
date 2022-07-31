package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClasses.Util1;

public class HomePage extends Util1 {
	
  WebDriver driver;
	
	@FindBy(xpath = "//div[text()='Asmita']")
	private WebElement profileName;	
	
	@FindBy(xpath = "//li[@class='_2NOVgj']")
	private WebElement myProfiletxt;	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public boolean getProfileName() throws InterruptedException
	{
		Thread.sleep(3000);
		explicitWait(driver,profileName);
		String pName = profileName.getText();
		
		if(pName.equals(pName))
		{
			return true;
		}
		else
			return false;
	}
	
	public void moveToMousecProfileName()
	{
		moveToElement(driver,profileName);
	}
	
	public void clkMyProfile() throws InterruptedException
	{
		//Thread.sleep(1000);
		WebElement element = explicitWait(driver,myProfiletxt);
		element.click();
		
	}

}
