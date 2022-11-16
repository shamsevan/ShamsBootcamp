package Runner_Cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/java/Features_Cucumber",
		glue="Step_Definition_Cucumber",
		monochrome=true		
		)

public class Runner_For_Amazon {

}
