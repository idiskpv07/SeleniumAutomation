package switchToPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Utilities.ReadDataConfig;

public class BaseTest {

	WebDriver driver;

	ReadDataConfig conf;

	// ctrl+Shoift+O ----- autoimport

	// pre-condition ----- @BeforeSuite-----

	// Test

	// post-condition ----- @AfterSuite

	@Parameters("ibm_br")

	@BeforeTest

	public void launchApp(String ibm_browser) throws Exception {

		System.out.println("launching application");

		// create an Object on ReadConfig file

		conf = new ReadDataConfig();

		System.out.println(conf.get_payTM());

		// String ibm_browser = "chrome";

		// driver = WebDriverManager.chromedriver().create();

		System.out.println("Execution on browser : " + ibm_browser);

		if (ibm_browser.equalsIgnoreCase("CHROME")) {

			driver = new ChromeDriver();

		}

		else if (ibm_browser.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();

		}

		else {

			System.out.println("Execution on deafult browser");

			driver = new ChromeDriver();

		}

		driver.get(conf.get_NOP_URL());

		// driver.get(conf.get_sampleApp_URL());

		driver.manage().window().maximize();

	}

	@AfterTest

	public void closeApp() throws Exception {

		Thread.sleep(5000);

		driver.close();

		System.out.println("closing application");

	}

}
