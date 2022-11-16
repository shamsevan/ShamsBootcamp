package TestNGPackages;

import org.testng.annotations.Test;

import CommonItems.Commons;
import Expedia_POM.Expedia_HomePage;

public class Expedia_TestNG extends Commons {
  @Test
  public void Purchase_Ticket() throws InterruptedException {
	  Expedia_HomePage eob = new Expedia_HomePage(driver);
	  eob.Flights_Tab_Click();
	  Thread.sleep(2000);
	  eob.LeavingFromField_Actions("ewr");
	  eob.Goingto_Actions("orlando");
	  eob.DateSelector_Click();
	  eob.departureDate_Select();
	  eob.returndate_Select();
	  eob.Done_Button();
	  eob.Search_Button_Click();
  }
}
