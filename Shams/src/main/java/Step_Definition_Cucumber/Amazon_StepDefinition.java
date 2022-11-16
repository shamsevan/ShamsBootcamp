package Step_Definition_Cucumber;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon_StepDefinition {
	public WebDriver driver;
	
	@Before
	public void Lunchbrowser() throws InterruptedException {
	
		Ibrowsers("chrome", "https://www.amazon.com");
	}
					
	@After
	public void TakeScreenshot() throws IOException {
		Screenshots();
	}
		
	@Given("i Already navigated to Amazon Homepage")
	public void i_already_navigated_to_amazon_homepage() {	  
	}

	@When("I entered Following String in the Search Field {string}")
	public void i_entered_following_string_in_the_search_field(String string) {
	   driver.findElement(By.id("twotabsearchtextbox")).sendKeys(string);
	   	}

	@And("I Clicked on The Search Icon")
	public void i_clicked_on_the_search_icon() {	   
	   driver.findElement(By.id("nav-search-submit-button")).click();
	}

	@Then("The Total number of my Results are displaying as {string}")
	public void the_total_number_of_my_results_are_displaying_as(String string) {	   	  
	}
	
	@When("I clicked on first_item")
	public void i_clicked_on_first_item() {
	   driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();	  
	}
	
	

	@Then("Add to Cart button is displaying in right Panel")
	public void add_to_cart_button_is_displaying_in_right_panel() {	  	   
	}

	@When("i clicked on Add_To_Cart button")
	public void i_clicked_on_add_to_cart_button() {
	   driver.findElement(By.id("add-to-cart-button")).click();   
	}

	@Then("add protection page is Displaying")
	public void add_protection_page_is_displaying() {	   
	  
	}
	public void Ibrowsers(String browser_name,String URL) throws InterruptedException {

		if(browser_name.equalsIgnoreCase("Chrome")) {    
			System.setProperty("webdriver.chrome.driver", "D:\\Batch 30 Eclipse\\project.selenium\\Drivers\\chromedriver.exe");		
				driver = new ChromeDriver();
				driver.get(URL);							
				driver.manage().window().maximize();                        	
				Thread.sleep(5000);	
		}
		
		else if(browser_name.equalsIgnoreCase("Edge")) {	 
      			System.setProperty("webdriver.edge.driver", "D:\\Batch 30 Eclipse\\project.selenium\\Drivers\\msedgedriver.exe");	
								driver = new EdgeDriver();		
								driver.get(URL);							
								driver.manage().window().maximize();                          
								Thread.sleep(5000);					
	}
	}
		public void Screenshots() throws IOException {
			Date systime_Datetype= new Date();			
			//convert Date formate To String 
			String systemDate=systime_Datetype.toString().replace(" ", "_").replace(":", "_");
		File ScreenshotsFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ScreenshotsFile, new File("C:\\Users\\ASUS\\git\\repository3\\Shams\\Pictures\\CucumberTest"+systemDate+"ss.jpg"));		
		}
}
