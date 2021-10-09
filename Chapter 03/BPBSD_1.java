public class BPBSD_1{
	
	@Given("^User navigates to the login page$")
	public void user_navigates_to_the_login_page() throws Throwable {
		System.out.println("Navigated to Login Page");
	}

	@When("^User enters \"(.*?)\" as username$")
	public void user_enters_admin_as_username(String userName) throws Throwable {
		System.out.println("UserName is: "+userName);
	}

	@And("^User enters \"(.*?)\" as password$")
	public void user_enters_admin_as_password(String password) throws Throwable {
		System.out.println("Password is: "+password);
	}

	@And("^User enters (\\d+) as pin$")
	public void user_enters_as_password(int pin) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Pin is: "+pin);
	}
	@And("^User clicks the Login button$")
	public void user_clicks_the_Login_button() throws Throwable {
		System.out.println("Login button clicked");
	}

	@Then("^User should be shown User Name on top left corner$")
	public void user_should_be_shown_User_Name_on_top_left_corner() throws Throwable {
		System.out.println("UserName verified");
	}



}