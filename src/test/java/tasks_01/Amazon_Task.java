package tasks_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon_Task {

	@Test
	public void AmazonTask1() throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']"))).perform();
		act.moveToElement(driver.findElement(By.xpath("//span[@class='nav-text' and contains(.,'MR')]/i"))).click().perform();
		
		Thread.sleep(3000);
		driver.quit();
		
		System.out.println("========Done============");
	}
}
