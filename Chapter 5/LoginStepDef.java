package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pageobjects.LoginPage;

public class LoginStepDef {
	
	LoginPage loginPage = new LoginPage();
	@When("^User enters \"(.*?)\" as username$")
	public void user_enters_admin_as_username(String userName) throws Throwable {
		System.out.println("UserName is: "+userName);
		loginPage.enterUserName(userName);
	}

	@And("^User enters \"(.*?)\" as password$")
	public void user_enters_admin_as_password(String password) throws Throwable {
		System.out.println("Password is: "+password);
		loginPage.enterPassword(password);
	}

	@And("^User clicks the Login button$")
	public void user_clicks_the_Login_button() throws Throwable {
		System.out.println("Login button clicked");
		loginPage.clickLogin();
	}
	@When("^User enters \"(.*?)\" and \"(.*?)\"$")
	public void user_enters_Username_and_Password(String userName, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    loginPage.enterSigmaUserName(userName,password);
	}

	@When("^User enters reports credentials as \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_reports_credentials_as_and(String userName, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    loginPage.enterReportsUserNamePW(userName, password);
	}
	@And("^User clicks on Login button$")
	public void user_clicks_sigma_Login_button() throws Throwable {
		System.out.println("Login button clicked");
		loginPage.clickSigmaLogin();
	}

}
