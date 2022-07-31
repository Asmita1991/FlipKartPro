package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClasses.Util1;

public class ProfilePage extends Util1{
	
  WebDriver driver;
	
	 @FindBy(xpath = "//div[@class='_1ruvv2']")
	 private WebElement fullProfileName;
	 
	 public ProfilePage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
		 this.driver = driver;
	 }
	 
	 public boolean getFullProfileName()
	 {
		 WebElement element = explicitWait(driver,fullProfileName);
		 String fullName = element.getText();
		  if(fullName.contains("Asmita Mane")) {
			  return true;
			  }
		  else {
			  return false;
			  }
	 }
	
	

}
