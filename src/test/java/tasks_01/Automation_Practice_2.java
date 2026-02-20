package tasks_01;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Automation_Practice_2 {
	
	@Test
	public void dynamicWebTable() throws InterruptedException
	{
		Scanner sc= new Scanner(System.in);
		String browser=sc.nextLine();
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		Actions act= new Actions(driver);
		
		//Thread.sleep(5000);
		act.moveToElement(driver.findElement(By.id("displayValues"))).perform();
		Thread.sleep(5000);
		
		System.out.print(browser+"CPU :");
		System.out.println(driver.findElement(By.xpath("//table[@id='taskTable']/tbody/tr/td[contains(.,'"+browser+"')]/../td[contains(.,'%')]")).getText());
	
		driver.quit();
	}
}
