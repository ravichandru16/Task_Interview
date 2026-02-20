package tasks_01;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Automation_Practice_Task {

	@Test
	public void PaginationTable() throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();
		String expdata="Soundbar";
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Actions act= new Actions(driver);

		act.scrollToElement(driver.findElement(By.id("pagination"))).perform();

		List<WebElement> li= driver.findElements(By.xpath("//ul[@id='pagination']//a"));


		//List<WebElement>li= driver.findElements(By.xpath("//ul[@id='pagination']//a"));

		//		for(WebElement ele:li)
		//		{
		//			try {
		//			System.out.println(driver.findElement(By.xpath("//table[@id='productTable']//tr[contains(.,'"+expdata+"')]/td[contains(.,'$')]")).getText());

		for(WebElement ele:li)
		{
			try 
			{
				//System.out.println(driver.findElement(By.xpath("//table[@id='productTable']//td[contains(.,'"+expdata+"')]/following-sibling::td[1]")).getText());

				driver.findElement(By.xpath("//table[@id='productTable']//tr[contains(.,'"+expdata+"')]/td/input")).click();
				break;
			}
			catch(Exception e)
			{
				ele.click();
			}

		}
		Thread.sleep(2000);
		driver.quit();
	}
}
