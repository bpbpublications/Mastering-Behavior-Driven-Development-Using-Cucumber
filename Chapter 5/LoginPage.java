package pageobjects;

import org.openqa.selenium.By;

import singletondriver.SingletonDriver;

public class LoginPage extends AbstractBasePage{
	By email = By.name("email");
	By password = By.name("password");
	By btnLogin = By.xpath("//div[text()='Login']");
	By sigmaUserName = By.id("loginID");
	By sigmaPassword = By.id("loginPSW");
	By reportsUserName = By.id("ctLoginID");
	By reportsPassword = By.id("loginPSW");

	By loginBtn = By.name("commit");
	public void enterUserName(String userName) {
		SingletonDriver.getInstance().getDrvr().findElement(email).sendKeys(userName);
	}
	public void enterPassword(String passwordtxt) {
		SingletonDriver.getInstance().getDrvr().findElement(password).sendKeys(passwordtxt);
	}
	public void clickLogin() {
		SingletonDriver.getInstance().getDrvr().findElement(btnLogin).click();
		//return new Homepage();
	}


	
	@Override
	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
		
	}
	@Override
	public String getPageTitle() {
		return this.pageTitle;
	}
	public void enterSigmaUserName(String userName, String password) {
		SingletonDriver.getInstance().getDrvr().findElement(sigmaUserName).sendKeys(userName);
		SingletonDriver.getInstance().getDrvr().findElement(sigmaPassword).sendKeys(password);
		
	}

	public void enterReportsUserNamePW(String userName, String password) throws InterruptedException {
		SingletonDriver.getInstance().getDrvr().findElement(reportsUserName).sendKeys(userName);
		SingletonDriver.getInstance().getDrvr().findElement(reportsPassword).sendKeys(password);
		
		
	}

	
	public void clickSigmaLogin() throws InterruptedException {
		// TODO Auto-generated method stub
		SingletonDriver.getInstance().getDrvr().findElement(loginBtn).click();
		Thread.sleep(30000);
	}
}
