package utilityP2022327V1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseP2022327V1 {

	public static Properties prop;
	public static WebDriver driver;

	public TestBaseP2022327V1() {

		try {
			FileInputStream flss = new FileInputStream(System.getProperty("user.dir")
					+ "\\src\\test\\java\\configurationP2022327V1\\ConfigP2022327V1.properties");
			prop = new Properties();
			prop.load(flss);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void initilize() {
		String Browsername = prop.getProperty("BrowserOrg");
		if (Browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\DriverV1\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(UtilP2022327V1.implicitlyWait_wait, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(UtilP2022327V1.pageLoadTimeout_wait, TimeUnit.SECONDS);

		} else if (Browsername.equals("IE")) {
			System.out.println("This is IE browser");
		} else
			System.out.println("Browser not found");

	}

	public static void launch(String URL) {
		driver.get(prop.getProperty("URL_T3"));
	}
}
