package tasks_01;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Automation_Practice_Task {

	@Test
	public void PaginationTable() throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();
		String expdata="Wireless Earbuds";
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		Actions act= new Actions(driver);
		
		act.scrollToElement(driver.findElement(By.id("pagination"))).perform();
		
		List<WebElement>li= driver.findElements(By.xpath("//table[@id='productTable']//td"));
		for(WebElement ele:li)
		{
			
		}
	
	}
	
}
