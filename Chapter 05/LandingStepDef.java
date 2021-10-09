package stepdefinitions;

import constants.GLOBAL_DATA;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageobjects.LandingPage;

public class LandingStepDef {
	
	LandingPage landingPage = new LandingPage();
	
	@Given("^I open the \"([^\"]*)\" browser on \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_open_the_browser_on_and(String browser, String platform, String gridSetting) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//SingletonDriver.getInstance().setDrvr(browser, platform, gridSetting);
		landingPage.openBrowser(browser, platform, gridSetting);
	}

	@When("^User navigates to the landing page$")
	public void user_navigates_to_the_landing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//		SingletonDriver.getInstance().getDrvr().get(GLOBAL_DATA.URL);
		landingPage.navigateURL();
	}

	
	@When("^clicks the Login button on the landing page$")
	public void The_user_clicks_the_Login_button_on_the_landing_page() throws Throwable {
	    landingPage.clickLogin();
	}
	
	@Given("^Navigate to Configure Reports page$")
	public void navigate_to_Configure_Reports_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		landingPage.navigateSIGMAURL();
	}

	@Given("^Navigate to Reports Creation page$")
	public void navigate_to_Reports_Creation_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		landingPage.navigateSIGMAREPORTURL();
	}


}
