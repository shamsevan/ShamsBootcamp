package RestAssured_Tasks;

import static io.restassured.RestAssured.given;    //Manually Imported 

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.File;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PostMethod {
  @Test
  public void f() {
	  
	  File JsonFileObject = new File("C:\\Users\\ASUS\\git\\repository3\\Shams\\bootcamp.json");  
	  Response posting =  given().contentType(ContentType.JSON).body(JsonFileObject).post("https://reqres.in/api/users");
	  
	  posting.prettyPrint();
	  
	  System.out.println(posting.getStatusCode());
	  
	  int Statuscode = posting.getStatusCode();
	  
	  SoftAssert asrt = new SoftAssert();
	  asrt.assertEquals(Statuscode,201);
	  
	  asrt.assertAll();
	  
  }
}
