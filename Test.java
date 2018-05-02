package Runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@Cucumber.Options(features="feature",glue={"stepDefinition"})
@CucumberOptions(
        features ="src/main/java",
        glue= "stepDefinitions")
       //tags="@RunFeature")
public class Test {

}
