package locators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LandingPageLocators {

	@FindBy(how=How.XPATH,using="//a[@href='https://ui.cogmento.com']")
	public  WebElement btnLogin;
	

}
