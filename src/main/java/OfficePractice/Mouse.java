package OfficePractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouse {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

		driver.manage().window().maximize();

		Actions one = new Actions(driver);
//		one.scrollByAmount(0, 500);
		WebElement element = driver.findElement(By.xpath("//input[@id='subjects']"));
		one.moveToElement(element).perform();
		one.contextClick().perform();
		System.out.println("hi");
	}

}
