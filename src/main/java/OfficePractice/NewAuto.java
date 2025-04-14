package OfficePractice;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewAuto {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.id("name")).sendKeys("SKP");
//		driver.findElement(By.id("email")).sendKeys("skp@gmail.com");
//		driver.findElement(By.id("phone")).sendKeys("7077310383");
//		driver.findElement(By.id("textarea")).sendKeys("Badapur");
//		driver.findElement(By.xpath("//input[@id='female']")).click();
//
//		List<WebElement> checkboxes = driver
//				.findElements(By.xpath("//input[@type='checkbox'and @class='form-check-input']"));
//		for (int i = 2; i <= 4; i++) {
//			if (i % 2 == 0) {
//				if (!checkboxes.get(i).isSelected()) {
//					checkboxes.get(i).click();
//				}
//			}
//		}
		
		WebElement ele1=driver.findElement(By.id("country"));
		Select s1=new Select(ele1);
		s1.selectByValue("canada");

		
		

	}
}
