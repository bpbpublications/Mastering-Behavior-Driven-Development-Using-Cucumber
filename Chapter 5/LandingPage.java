package pageobjects;

import org.openqa.selenium.By;

import singletondriver.SingletonDriver;

public class LandingPage extends AbstractBasePage{
	By btnLogin = By.xpath("//a[@href='https://ui.freecrm.com']");
	
	public void clickLogin() {
		SingletonDriver.getInstance().getDrvr().findElement(btnLogin).click();
	//	return new LoginPage();
	}

	@Override
	public void setPageTitle(String pageTitle) {
		this.pageTitle=pageTitle;
		
	}

	@Override
	public String getPageTitle() {
		// TODO Auto-generated method stub
		return this.pageTitle;
	}
}
