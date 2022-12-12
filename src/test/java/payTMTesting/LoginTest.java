package payTMTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	WebDriver driver;

	@Test

	public void verifyLogin() throws Exception {

		WebElement ele = driver.findElement(By.cssSelector("//iframe[@name=\"packageFrame\"]"));
		
		driver.switchTo().frame(ele);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@href, 'Actions.html')]"));
	}

}