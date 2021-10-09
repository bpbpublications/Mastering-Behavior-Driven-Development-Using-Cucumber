package testrunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import singletondriver.SingletonDriver;

@SuppressWarnings("deprecation")
@CucumberOptions(features = { "src/test/resources/featurefiles" }, glue = { "stepdefinitions" }, plugin = {
			"pretty", "json:target/cucumber-reports/cucumber-test.json" }, tags = {"@Sanity1"})

	
	public class BPBTR_1 extends AbstractTestNGCucumberTests {

	
	
	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass(alwaysRun=true)
	public void setUp() {
		
	}
	
	@Test(dataProvider="features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
//		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}
	
//	@DataProvider
//	public Object[][] features() {
//		 if(testNGCucumberRunner == null){
//		        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
//		    }
		//return testNGCucumberRunner.provideFeatures();
//	}
	@AfterClass
	public void tearDown() {
		testNGCucumberRunner.finish();
	}

}

