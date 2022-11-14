package HomeDepot_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAnAccount_Page {
	 WebDriver driver;
	
	 //Storing Elements
	 @FindBy(id = "email") WebElement email_Field;
	 @FindBy(id = "password-input-field") WebElement Password_Field;
	 @FindBy(id = "zipCode") WebElement ZipCode_Field;
	 @FindBy(xpath = "//input[@id='phone']") WebElement Phone_Field; 
	 //@FindBy(xpath = "//div[@class='checkbox-btn'] / child:: input[@id='kmsi-checkbox']") WebElement kmsi_Checkbox;
	@FindBy(xpath = "//input[@id='kmsi-checkbox']") WebElement kmsi_Checkbox;
	 @FindBy(id = "verify-phone-checkbox") WebElement Verifyphone_Checkbox;
	 @FindBy(xpath = "//div[@class='recaptcha-checkbox-border'  and @role='presentation' ]") WebElement Captcha_box;
	 @FindBy(xpath = "//span[text()='Create an Account']") WebElement CreateAnAccount_Button;
	
	//creating Actions method here:
	 public void emailField_Actions(String Test_Email) {
		 email_Field.click();
		 email_Field.sendKeys(Test_Email);
	 }
	 
	 
	 public void PasswordField_Actions(String Testpassword) {
		 Password_Field.click();
		 Password_Field.sendKeys(Testpassword);
	 }
	 
	 public void Zipcode_Actions(String testZipcode) {
		 ZipCode_Field.click();
		 ZipCode_Field.sendKeys(testZipcode);
	 }
	 
	 public void PhoneField_Actions(String Testphonenumber) {
		 Phone_Field.click();
		 Phone_Field.sendKeys(Testphonenumber);
	 }
	 
	 
	 public void keepmeSignedin_Checkbox_Click() {
		 kmsi_Checkbox.click();
	 }
	 
	 public void VerifyPhone_Checkbox_Click() {
		Verifyphone_Checkbox.click(); 
	 }
	 
	 public void captchabox_click() {
		 Captcha_box.click();
	 }
	 
	 public void CreateAnAccount_Click() {
		 CreateAnAccount_Button.click();
	 }
	
	
	 
	 
	 //Page factory Constructor
	  public CreateAnAccount_Page(WebDriver driver) {
		  this.driver= driver;
		  PageFactory.initElements(driver, this);
	  }
	
}
