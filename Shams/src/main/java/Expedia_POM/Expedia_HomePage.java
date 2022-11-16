package Expedia_POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.Enter;

public class Expedia_HomePage {
  WebDriver driver;
  
  @FindBy(xpath = "//span[text()='Flights']") WebElement flights_Tab; 
  @FindBy(xpath = "//button[@aria-label='Leaving from']") WebElement Leaving_From_button;
  @FindBy(id = "location-field-leg1-origin") WebElement Leaving_From_Field;
  @FindBy(xpath = "//button[@aria-label='Going to']") WebElement going_To_Button;
  @FindBy(id = "location-field-leg1-destination") WebElement going_to_Field;
  @FindBy(xpath = "(//button[@data-stid='open-date-picker'])[1]") WebElement Date_Selector_Button;
  @FindBy(xpath = "(//button[@aria-label='Nov 13, 2022'])") WebElement Departure_Date;
  @FindBy(xpath = "(//button[@aria-label='Dec 21, 2022'])") WebElement Return_Date;
  @FindBy(xpath = "(//button[@data-stid='apply-date-picker'])") WebElement Done_Button; 
  @FindBy(xpath = "(//button[@data-testid='submit-button'])") WebElement Search_button;
  
  public void Flights_Tab_Click() {
	  flights_Tab.click();
  }
  
  public void LeavingFromField_Actions(String departure_Airport) {
	  Leaving_From_button.click();	  
	  Leaving_From_Field.sendKeys(departure_Airport);
	  EnterButtonPress();
  }
  
  public void Goingto_Actions(String Arrival_Airport) {
	  going_To_Button.click();
	  going_to_Field.sendKeys(Arrival_Airport);
	  EnterButtonPress();
	  
  }
  
  public void DateSelector_Click() {
	  Date_Selector_Button.click();
  }
  
  public void departureDate_Select() {
	  Departure_Date.click();
  }
  
  public void returndate_Select() {
	  Return_Date.click();
  }
  
  public void Done_Button() {
	  Done_Button.click();
  }
  
  public void Search_Button_Click() {
	  Search_button.click();
  }
  
  public Expedia_HomePage(WebDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
	  
  }
  
  public void EnterButtonPress() {
	  Actions act = new Actions(driver);
	  act.sendKeys(Keys.ENTER).build().perform();
  }
	
}
