
package actionsExample;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickDoubleClickTest {

	WebDriver driver;

	@BeforeTest

	public void loadPage() throws Exception {

		String url = "https://demo.guru99.com/test/simple_context_menu.html";

		driver = WebDriverManager.chromedriver().create();

		driver.get(url);

		driver.manage().window().maximize();

		Thread.sleep(1000);

	}

	@AfterTest

	public void closePage() throws Exception {

		Thread.sleep(5000);

		driver.close();

	}

	@Test

	public void RightClickTest() throws Exception {

		WebElement rightButton = driver.findElement(By.xpath("//span[contains(text(), 'right click')]"));

		WebElement deleteButton = driver.findElement(By.xpath(""));

		// Create an Object of Actions class

		Actions act = new Actions(driver);

		act.contextClick(rightButton).perform();

		// deleteButton.click();

		// act.click(deleteButton).perform();

		// handle alert

		// validation step

		Assert.assertTrue(driver.getTitle().contains("delete"));

		// dismiss

	}

	@Test

	public void DoubleClickTest() throws Exception {

		WebElement doubleButton = driver.findElement(By.xpath(""));

		// Create an Object of Actions class

		Actions act = new Actions(driver);

		act.doubleClick(doubleButton).perform();

		// deleteButton.click();

		// act.click(deleteButton).perform();

		// handle alert

		// validation step ---- alert Text

		Assert.assertTrue(driver.getTitle().contains("double"));

		// dismiss

	}

}
