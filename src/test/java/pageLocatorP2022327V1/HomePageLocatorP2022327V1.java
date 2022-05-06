package pageLocatorP2022327V1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilityP2022327V1.TestBaseP2022327V1;

public class HomePageLocatorP2022327V1 extends TestBaseP2022327V1 {

	{

		PageFactory.initElements(driver, this);

	}
	@FindBy(how = How.XPATH, using = "//div[@class='bot_column']")
	public WebElement Display;
	@FindBy(how = How.XPATH, using = "//input[@id='user-name']")
	public WebElement UserName;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	public WebElement Password;
	@FindBy(how = How.XPATH, using = "//input[@id='login-button']")
	public WebElement PressClick;
	@FindBy(how = How.XPATH, using = "//button[text()='Open Menu']")
	public WebElement VerifyCustomerloggedin;
	@FindBy(how = How.XPATH, using = "//span[text()='Products']")
	public WebElement InventorypgaeDisplay;

}
