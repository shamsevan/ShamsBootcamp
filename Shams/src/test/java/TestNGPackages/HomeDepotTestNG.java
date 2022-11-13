package TestNGPackages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import CommonItems.Commons;
import HomeDepot_POM.AccountTypePage;
import HomeDepot_POM.CreateAnAccount_Page;
import HomeDepot_POM.HomeDepotHomepage;

public class HomeDepotTestNG extends Commons {
	
  @Test
  public void HomeDepotSignUPTest() {
	  HomeDepotHomepage hpObject= new HomeDepotHomepage(driver);
	  hpObject.Myaccount_Click();
	  hpObject.create_account_Click();
	  
	  AccountTypePage AtpObject = new AccountTypePage(driver);
	  AtpObject.personalAccount_click();
	  
	  
	  CreateAnAccount_Page caObject = new CreateAnAccount_Page(driver);
	  
	  caObject.emailField_Actions("abc@gmail.com");
	  caObject.PasswordField_Actions("abc123");
	  caObject.Zipcode_Actions("80380");
	  caObject.PhoneField_Actions("3479084506");  
	  driver.findElement(By.xpath("//span[text()='Only check if on a private device']"));
	  caObject.keepmeSignedin_Checkbox_Click();
	  caObject.VerifyPhone_Checkbox_Click();
	  caObject.captchabox_click();
	  caObject.CreateAnAccount_Click();
	    
	  
  }
}
