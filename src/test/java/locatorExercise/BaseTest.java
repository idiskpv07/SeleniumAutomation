package locatorExercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utilities.ReadDataConfig;
import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseTest {

    

    

    

    WebDriver driver;

    ReadDataConfig conf;

    //ctrl+Shoift+O ----- autoimport

    //pre-condition    ----- @BeforeSuite-----

    //Test

    //post-condition   ----- @AfterSuite

    

    

    @BeforeTest

    public void launchApp() throws Exception {

        

        System.out.println("launching application");

        

        

        //create an Object on ReadConfig file

        conf = new ReadDataConfig();

        System.out.println(conf.get_NOP_URL());

        

        

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get(conf.get_SampleAppURL());

        driver.manage().window().maximize();

        

    }

    

    @AfterTest

    public void closeApp() throws Exception {

        

        Thread.sleep(5000);

        driver.close();

        System.out.println("closing application");

    }



}


