package stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import pageobjects.Homepage;
import singletondriver.SingletonDriver;
import utils.ExtentMgr;
import utils.ExtentTstClass;

public class TearDown {
	Homepage homepage = new Homepage();
	@After
	public void tearDown(Scenario scenario) {
	System.out.println("In teardown");
	if (scenario.isFailed()) {
		System.out.println("In teardown failure");
		byte[] screenPrint = ((TakesScreenshot)SingletonDriver.getInstance().getDrvr()).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenPrint, "image/png");
		ExtentTstClass.logFail("Scenario has failed");
		ExtentTstClass.addScreenShotsOnFailure();
	
} else {
	ExtentTstClass.logPass("Scenario has passed");
	
}

try {
	if (!(SingletonDriver.getInstance().getSessId()==null)) {
		homepage.logOut();
		Thread.sleep(30000);
		SingletonDriver.getInstance().getDrvr().close();
		SingletonDriver.getInstance().getDrvr().quit();
	}
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Assertions.assertAll();
ExtentMgr.getRprtr().flush();
}
	
}