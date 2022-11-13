package CommonItems;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Commons {
	public WebDriver driver;	
	
  @Parameters({"Browser","UrlAddress"})
  @BeforeClass
  public void Ibrowsers(String browser_name,String URL) throws InterruptedException {
	  String projectpath= System.getProperty("user.dir");

		if(browser_name.equalsIgnoreCase("Chrome")) {  			
			System.out.println(projectpath);
			
			System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\chromedriver.exe");
			                                              
				driver = new ChromeDriver();
				driver.get(URL);							
				driver.manage().window().maximize();     
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				Thread.sleep(5000);	
		}
		
		else if(browser_name.equalsIgnoreCase("Edge")) {	 
    			System.setProperty("webdriver.edge.driver", projectpath+"\\Drivers\\msedgedriver.exe");	
								driver = new EdgeDriver();		
								driver.get(URL);							
								driver.manage().window().maximize();  
								driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
  }

  @AfterClass
  public void afterClass() throws IOException {
	  
	  Screenshots();

  }
  
  
	public void Screenshots() throws IOException {
		Date systime_Datetype= new Date();			
		//convert Date formate To String 
    String systemDate=systime_Datetype.toString().replace(" ", "_").replace(":", "_");
	File ScreenshotsFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(ScreenshotsFile, new File("D:\\Batch 30 Eclipse\\Shams\\Pictures\\Homedepot"+systemDate+"ss.jpg"));		
	}

}
