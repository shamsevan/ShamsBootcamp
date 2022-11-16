package RestAssured_Tasks;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Get_Method {
  @Test
  public void f() {
	  Response TheResponseofGetMethod= get("https://reqres.in/api/users?page=2");
	  TheResponseofGetMethod.prettyPrint();
	  
  }
}
