package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.After;
import singletondriver.SingletonDriver;

public class Homepage extends AbstractBasePage{
	Actions actions = new Actions(SingletonDriver.getInstance().getDrvr());

	By userDisplay = By.xpath("//span[@class='user-display']");
//	By logOutSpan = By.xpath("//span[@data-item-id='ct-user-details']");
	By logOutSpan = By.xpath("//div[@role='listbox']");
//	By logOutAnchor = By.xpath("(//a[@data-item-id='ct_logout'])[1]");
	By logOutAnchor = By.xpath("//span[text()='Log Out']");
	By btnCreate = By.xpath("//span[text()='Create']");
	By btnCreateNewConn = By.xpath("//a[@data-item-id=\"CREATE_NEW_DSCONNECTION\"]");
	By btnCreateNewRept = By.xpath("//a[@data-item-id='CREATE_NEW_REPORT']");
	By btnFilter = By.xpath("//span[@data-original-title='Filter / Search']");

	By hvConnName = By.xpath("(//li[@data-colid='CONNECTION_NAME'])[1]");
	By hvConnNameEq = By.xpath("(//li[@data-colid='CONNECTION_NAME'])[1]//li[@data-submenu='contains']");
	By exactConnName = By.xpath("//input[@id='stringContains']");
	By connNameText = By.xpath("//td[@data-item-id='CONNECTION_NAME']");
	By dsLink = By.xpath("//a[@data-context-id='CREATE_DATA_SOURCE']");
	By navMenu = By.xpath("//span[@data-item-id='ct_sidebar_menu_toggler']");
	By irMenu = By.xpath("//a[@data-item-id='SIG_IR_WS_NEW']");
	//By logOutAnchor2 = By.xpath("//a[@data-item-id='dialogBtnYes']");
	By btnCreateNewGroup = By.xpath("//span[@data-original-title='Create New Group']");
	By btnSchedule = By.xpath("//span[@data-original-title='Schedule']");
	By reportSearch = By.xpath("//input[@id='report-srch']");
	String string1 = "//span[@data-item-value='";
	String string2 = "']";
	
	public void verifyUser(String userDisplayText) {
		System.out.println(SingletonDriver.getInstance().getDrvr().findElement(userDisplay).getText());
		Assert.assertEquals(SingletonDriver.getInstance().getDrvr().findElement(userDisplay).getText(), userDisplayText);
	}

	public void clickCreateButton() {
		SingletonDriver.getInstance().getDrvr().findElement(btnCreate).click();

	}

	public void clickNavButton() {
		SingletonDriver.getInstance().getDrvr().findElement(navMenu).click();

	}

	public void clickInfoReports() {
		SingletonDriver.getInstance().getDrvr().findElement(irMenu).click();

	}

	public void clickConnectionButton() throws InterruptedException {
		SingletonDriver.getInstance().getDrvr().findElement(btnCreateNewConn).click();

	}

	public void clickReportButton() throws InterruptedException {
		SingletonDriver.getInstance().getDrvr().findElement(btnCreateNewRept).click();

	}

	public void logOut() throws InterruptedException {
		SingletonDriver.getInstance().getDrvr().findElement(logOutSpan).click();
//		Thread.sleep(5000);
		SingletonDriver.getInstance().getDrvr().findElement(logOutAnchor).click();
//		Thread.sleep(5000);
//		SingletonDriver.getInstance().getDrvr().findElement(logOutAnchor2).click();
//		Thread.sleep(5000);
//		SingletonDriver.getInstance().getDrvr().close();
//		SingletonDriver.getInstance().getDrvr().quit();
	}

	@Override
	public void setPageTitle(String title) {
		this.pageTitle=pageTitle;
		
	}

	@Override
	public String getPageTitle() {
		// TODO Auto-generated method stub
		return this.pageTitle;
	}

	public void clickFilter() {
		SingletonDriver.getInstance().getDrvr().findElement(btnFilter).click();

	}
	public void clickEquals() throws InterruptedException {
		actions.moveToElement(SingletonDriver.getInstance().getDrvr().findElement(hvConnName)).perform();
		SingletonDriver.getInstance().getDrvr().findElement(hvConnNameEq).click();
	}

	public void enterConnName(String connName) throws InterruptedException {
		Thread.sleep(5000);
		SingletonDriver.getInstance().getDrvr().findElement(exactConnName).sendKeys(connName);
		Thread.sleep(5000);
		SingletonDriver.getInstance().getDrvr().findElement(exactConnName).sendKeys(Keys.TAB);
		Thread.sleep(5000);
		SingletonDriver.getInstance().getDrvr().findElement(exactConnName).sendKeys(Keys.ENTER);
		//actions.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(10000);
	}

	public void ClickDataSource() throws InterruptedException {
		actions.contextClick(SingletonDriver.getInstance().getDrvr().findElement(connNameText)).perform();
		Thread.sleep(5000);
		SingletonDriver.getInstance().getDrvr().findElement(dsLink).click();
		Thread.sleep(20000);
	}
	
	public void clickCreateNewGroup() throws InterruptedException {
		SingletonDriver.getInstance().getDrvr().findElement(btnCreateNewGroup).click();
		Thread.sleep(20000);
	}

	public void clickSchedule() throws InterruptedException {
		SingletonDriver.getInstance().getDrvr().findElement(btnSchedule).click();
		Thread.sleep(5000);
	}

	public void enterReportGroup(String txtReportGroup) throws InterruptedException {
		
		SingletonDriver.getInstance().getDrvr().findElement(reportSearch).sendKeys(txtReportGroup);
		Thread.sleep(5000);
	}

	public void clickMenuItem(String txtReportGroup) throws InterruptedException {
		
		String clubbedXpath = string1 + txtReportGroup + string2;
		
		SingletonDriver.getInstance().getDrvr().findElement(By.xpath(clubbedXpath)).click();
		Thread.sleep(5000);
	}
	
}
