package utils;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class ExtentTstClass {
	public static ThreadLocal<ExtentTest> tstReprt = new ThreadLocal<ExtentTest>();
	static ExtentReports extent = ExtentMgr.getRprtr();

	public static synchronized ExtentTest getTest() {

		return tstReprt.get();
	}

	public static void logInfo(String message) {

		tstReprt.get().info(message);
	}

	public static void logPass(String message) {

		tstReprt.get().pass(message);
	}

	public static void scenarioPass() {

		String passLog = "Scenario has passed";
		Markup m = MarkupHelper.createLabel(passLog, ExtentColor.GREEN);
		tstReprt.get().log(Status.PASS, m);
	
	
	}

	public static void logFail(String message) {

		tstReprt.get().fail(message);
	}

	public static synchronized boolean addScreenShotsOnFailure() {

		ExtentMgr.captureScreenshot();
		try {

			tstReprt.get().fail("<b>" + "<font color=" + "red>" + "Screenshot of failure" + "</font>" + "</b>",
					MediaEntityBuilder.createScreenCaptureFromPath(ExtentMgr.screenshotName).build());
		} catch (IOException e) {

		}

		String failureLog = "Scenario has failed";
		Markup m = MarkupHelper.createLabel(failureLog, ExtentColor.RED);
		tstReprt.get().log(Status.FAIL, m);
		return true;
	}

	public static synchronized boolean addScreenShots() {

		ExtentMgr.captureScreenshot();
		try {
			tstReprt.get().info(("<b>" + "<font color=" + "green>" + "Screenshot" + "</font>" + "</b>"),
					MediaEntityBuilder.createScreenCaptureFromPath(ExtentMgr.screenshotName).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;
	}

	public static synchronized ExtentTest startTest(String testName) {
		return startTest(testName, "");
	}

	public static synchronized ExtentTest startTest(String testName, String desc) {
		ExtentTest tst = extent.createTest(testName, desc);
		tstReprt.set(tst);
		return tst;
	}

}

