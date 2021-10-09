package testrunner;

import java.io.File;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.TestNGCucumberRunner;

//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;





@SuppressWarnings("deprecation")
@CucumberOptions(features = { "src/test/resources/featurefiles" }, glue = { "stepdefinitions" }, plugin = {
			"pretty", "json:target/cucumber-reports/cucumber-test.json" },tags= {"@SanitySerial"})

	
public class BPBTR_2 extends AbstractTestNGCucumberTests {
	
/*	@Test
	public void runCucumber() {
		new TestNGCucumberRunner(getClass()).runCukes();
	}
*/	
	
	
	
}

