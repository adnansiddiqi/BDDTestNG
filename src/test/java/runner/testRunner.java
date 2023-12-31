package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "C:\\Users\\adnan\\IdeaProjects\\BDDTestNG\\src\\test\\resources\\features",
                 glue = "stepdef",
                 plugin ="pretty",
                monochrome = true,
                publish = true
                    )
public class testRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios(){
    return super.scenarios();
    }

}
