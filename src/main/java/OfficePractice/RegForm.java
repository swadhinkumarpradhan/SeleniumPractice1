package OfficePractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegForm {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.manage().window().maximize();
		driver.findElement(By.id("name")).sendKeys("swadhin");
		driver.findElement(By.id("email")).sendKeys("swadhin123@gmail.com");

		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		driver.findElement(By.id("mobile")).sendKeys("7077310383");

		driver.findElement(By.id("dob")).sendKeys("10/12/2000");

		driver.findElement(By.id("subjects")).sendKeys("Software");
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (int i = 0; i < checkboxes.size(); i++) {
			if (!checkboxes.get(i).isSelected()) {
				checkboxes.get(i).click();
			}
		}

//		WebElement ele = driver.findElement(By.xpath("//input[@type='file']"));
//		ele.click();
//		ele.sendKeys("/SeleniumPractice/src/main/java/OfficePractice/Untitled.png");

		driver.findElement(By.xpath("//textarea[@id='picture']")).sendKeys("Badapur");

		WebElement p = driver.findElement(By.xpath("//select[@id='state']"));

		Select s1 = new Select(p);
		s1.selectByValue("Uttar Pradesh");

		WebElement p1 = driver.findElement(By.xpath("//select[@id='city']"));

		Select s2 = new Select(p1);
		s2.selectByValue("Agra");
		
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("submited");


	}

}
