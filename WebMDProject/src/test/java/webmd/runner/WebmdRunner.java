package webmd.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class WebmdRunner {
	
	
	@CucumberOptions(plugin = { "pretty", "html:target/cucumber-reports",
			"json:target/cucumber-jsonreports/cucumber.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, 
			features = {"src/test/resources/Features" }, 
			glue = { "webmd.stepDef" , "webmd.utilities" },  monochrome = true)

	public class WebmdRunnerTest extends AbstractTestNGCucumberTests {
		 
		
		
	}

}
