package testRunnerP2022327V1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import utilityP2022327V1.TestBaseP2022327V1;

@CucumberOptions(features = { "src/test/resources/FeaturesV1" }, plugin = {
		"json:target/cucumber.json" }, glue = "stepDefinitionP2022327V1", tags = { "@Sanity" })

public class TestRunnerP2022327V1 extends AbstractTestNGCucumberTests {

	@BeforeTest

	public void LaunchApplicationURL() {
		TestBaseP2022327V1 lunchh = new TestBaseP2022327V1();
		lunchh.initilize();

	}

	@AfterTest
	public void CloseApplicationURL() {
		TestBaseP2022327V1 lunchh = new TestBaseP2022327V1();
		lunchh.driver.quit();

	}
}
