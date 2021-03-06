package pageobjects;

import constants.GLOBAL_DATA;
import pageobjectspf.LandingPagePF;
import singletondriver.SingletonDriver;

public abstract class AbstractBasePage {
	protected String pageTitle; 
	public void navigateURL() {
		SingletonDriver.getInstance().getDrvr().navigate().to(GLOBAL_DATA.URL);
	//	return new LandingPage();
	}

	public void navigateSIGMAURL() {
		SingletonDriver.getInstance().getDrvr().navigate().to(GLOBAL_DATA.SIGMA_URL);
	//	return new LandingPage();
	}

	public void navigateSIGMAREPORTURL() {
		SingletonDriver.getInstance().getDrvr().navigate().to(GLOBAL_DATA.SIGMA_REPORT_URL);
	//	return new LandingPage();
	}
	
	public void openBrowser(String browserName, String platform, String gridSetting) {
		try {
			SingletonDriver.getInstance().setDrvr(browserName, platform, gridSetting, null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public abstract void setPageTitle(String pageTitle);
	public abstract String getPageTitle();

}
