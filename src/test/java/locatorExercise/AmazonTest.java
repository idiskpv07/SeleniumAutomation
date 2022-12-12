package locatorExercise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {
	WebDriver driver;
	
	@Test
	public void validateSeeMore() {
		driver = new ChromeDriver();
		driver.get("https://amazon.in/");
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div[14]/div/div[3]/a")).click();
		driver.findElement(By.xpath("//h2[text()='Shop for your baby by age']//parent::div//following-sibiling::div[@class='a-cardui-footer']//child::a[text()='See more']")).click();
		driver.findElement(By.xpath("//h2[contains(text(), 'your baby')]//parent::div//following-sibiling::div[contains(@class, 'cardui-foot')]//child::a[text()='See more']"));
	}
}
