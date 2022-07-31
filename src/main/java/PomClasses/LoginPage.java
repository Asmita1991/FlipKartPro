package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	private WebElement emailfield;	
	
	@FindBy(xpath = "//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement passwordfield;	
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void enterEmail()
	{
		emailfield.sendKeys("asmitamane0@gmail.com");
	}
	
	public void enterPassword()
	{
		passwordfield.sendKeys("asmita19");
	}
	
	public void clickLoginBtn()
	{
		loginBtn.click();
	}

}
