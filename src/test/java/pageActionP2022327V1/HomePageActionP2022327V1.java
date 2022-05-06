package pageActionP2022327V1;

import junit.framework.Assert;
import pageLocatorP2022327V1.HomePageLocatorP2022327V1;
import utilityP2022327V1.TestBaseP2022327V1;

public class HomePageActionP2022327V1 extends TestBaseP2022327V1 {

	HomePageLocatorP2022327V1 homePageLocatorP2022327V1 = new HomePageLocatorP2022327V1();

	public void SaucelabDisplay() {
		boolean rst = homePageLocatorP2022327V1.Display.isDisplayed();
		Assert.assertTrue(rst);
	}

	public void UserCard(String u, String p) {
		homePageLocatorP2022327V1.UserName.sendKeys(u);
		homePageLocatorP2022327V1.Password.sendKeys(p);

	}

	public void ClickonLogin() {
		homePageLocatorP2022327V1.PressClick.click();
	}

	public void VerifyLogginSuc() {
		boolean rtt = homePageLocatorP2022327V1.VerifyCustomerloggedin.isDisplayed();
		Assert.assertTrue(rtt);
	}

	public void VerifyInventory() {
		boolean rttk = homePageLocatorP2022327V1.InventorypgaeDisplay.isDisplayed();
		Assert.assertTrue(rttk);
	}

}
