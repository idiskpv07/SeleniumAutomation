package switchToPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	WebDriver driver;

	@Test

	public void verifyLogin() throws Exception {

		//WebElement ele = driver.findElement(By.cssSelector("//iframe[@name=\"packageFrame\"]"));
		
		//driver.switchTo().frame(ele);
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Launch modal')]")).click();
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.xpath("//h4[contains(text(),'Modal window demo')]")).getText());
		
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'gmail')]")).getText());
	}

}