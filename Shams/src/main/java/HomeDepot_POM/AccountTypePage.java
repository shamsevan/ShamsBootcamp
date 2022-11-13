package HomeDepot_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountTypePage {
	  WebDriver driver; 
	  
	  @FindBy(xpath = "(//span[text()='Select & Continue'])[1]") WebElement personal_Account_Button;
	  
	  public void personalAccount_click() {
		  personal_Account_Button.click();
	  }
	  
	  
	 	  
	  public AccountTypePage(WebDriver driver) {
		  this.driver= driver;
		  PageFactory.initElements(driver, this);
	  }
	  
	  
	  
}
