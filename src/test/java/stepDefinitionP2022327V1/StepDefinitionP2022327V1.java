package stepDefinitionP2022327V1;

import org.apache.log4j.Logger;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageActionP2022327V1.HomePageActionP2022327V1;
import utilityP2022327V1.LogsHelpper_Loggggg;
import utilityP2022327V1.TestBaseP2022327V1;
import utilityP2022327V1.UtilP2022327V1;

public class StepDefinitionP2022327V1 extends TestBaseP2022327V1 {

	HomePageActionP2022327V1 homePageActionP2022327V1 = new HomePageActionP2022327V1();
	Logger logs = LogsHelpper_Loggggg.getLogss(LogsHelpper_Loggggg.class);

	@Given("^Open application \"([^\"]*)\"$")
	public void open_application(String URL) throws Throwable {
		launch(URL);
		UtilP2022327V1.takescreenshot(driver, "HomePage");
		logs.info("Launch URL");

	}

	@Then("^Verify login page properly displayed$")
	public void verify_login_page_properly_displayed() throws Throwable {
		homePageActionP2022327V1.SaucelabDisplay();
		UtilP2022327V1.takescreenshot(driver, "LoginPage");
	}

	@Then("^Input username and password and click$")
	public void input_username_and_password_and_click() throws Throwable {
		homePageActionP2022327V1.UserCard(prop.getProperty("MrX"), prop.getProperty("Mrxpass"));
		homePageActionP2022327V1.ClickonLogin();
		logs.info("Login");
	}

	@Then("^Verify customer successfully logged in$")
	public void verify_customer_successfully_logged_in() throws Throwable {
		homePageActionP2022327V1.VerifyLogginSuc();
		UtilP2022327V1.takescreenshot(driver, "Logged");
	}

	@Then("^Verify Inventory page is displayed properly$")
	public void verify_Inventory_page_is_displayed_properly() throws Throwable {
		homePageActionP2022327V1.VerifyInventory();
		UtilP2022327V1.takescreenshot(driver, "Inventorypage");
		logs.info("Inventory");

	}

}
