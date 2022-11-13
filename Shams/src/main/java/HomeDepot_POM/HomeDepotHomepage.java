package HomeDepot_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeDepotHomepage {

  WebDriver driver;  
  @FindBy(xpath = "(//div[text()='My Account'])[1]") WebElement MyAccount_Button;  
  @FindBy(xpath = "(//span[text()='Create an Account'])[2]") WebElement Create_An_Account_Button;
  
  public void Myaccount_Click() {
	  MyAccount_Button.click();
  }
  
  public void create_account_Click() {
	  Create_An_Account_Button.click();
  }
  
  public HomeDepotHomepage(WebDriver driver) {
	  this.driver= driver;
	  PageFactory.initElements(driver, this);
  }
	
	
	
}
