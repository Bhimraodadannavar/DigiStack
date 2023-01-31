package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = {"C:\\Users\\Public\\com.Tyspltd_cucumber\\Featurefile\\Login.feature"},
		glue= {"StepDefination"},
		dryRun =false,
		monochrome = true,
		plugin = {"pretty","html:Reports\\login.html"}



		)
public class TestRunnerClass extends AbstractTestNGCucumberTests
{

}
