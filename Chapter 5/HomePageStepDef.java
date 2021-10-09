package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.CreateConnection;
import pageobjects.Homepage;

public class HomePageStepDef {
	Homepage homePage = new Homepage();
	@Then("^User should be shown \"(.*?)\" on top left corner$")
	public void user_should_be_shown_User_Name_on_top_left_corner(String userDisplayText) throws Throwable {
		System.out.println("UserName verified");
		homePage.verifyUser(userDisplayText);
		homePage.logOut();
	}
	
	@When("^User clicks on Create button$")
	public void user_clicks_on_Create_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(6000);
	    homePage.clickCreateButton();
	}

	@When("^User clicks on Create New Group button$")
	public void createNewGroup() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(6000);
	    homePage.clickCreateNewGroup();
	}

	@When("^user clicks on menu toggler$")
	public void clickNavButton() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//	Thread.sleep(6000);
	    homePage.clickNavButton();
	}

	@When("^clicks on information reports$")
	public void clickInfoReports() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//	Thread.sleep(6000);
	    homePage.clickInfoReports();
	    Thread.sleep(3000);
	    homePage.clickInfoReports();
	    Thread.sleep(10000);
	}

	@When("^User clicks on Connection button$")
	public void user_clicks_on_Connection_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    homePage.clickConnectionButton();
	}

	@When("^User clicks on Report button$")
	public void user_clicks_on_Report_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    homePage.clickReportButton();
	}

	@When("^User clicks on filter button$")
	public void user_clicks_on_filter_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    homePage.clickFilter();
	}

	@When("^User selects exact Connection Name$")
	public void user_selects_exact_Connection_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    homePage.clickEquals();
	}

	@When("^User enters exact Connection Name as \"(.*?)\"$")
	public void user_enters_exact_Datasource_Name(String connName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    homePage.enterConnName(connName);
	}

	@When("^User selects DataSource$")
	public void user_selects_exact_Datasource_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    homePage.ClickDataSource();
	}

	@When("^enters \"([^\"]*)\" in left pane$")
	public void enters_in_left_pane(String txtReportGroup) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    homePage.enterReportGroup(txtReportGroup);
	}

	@When("^selects the \"([^\"]*)\"$")
	public void selects_the(String txtReportGroup) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    homePage.clickMenuItem(txtReportGroup);
	}

	@When("^User clicks on Schedule button$")
	public void user_clicks_on_Schedule_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    homePage.clickSchedule();
	}

}
