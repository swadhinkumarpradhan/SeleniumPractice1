package Selenium1.SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountPage {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(20);
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("swadhin");
		driver.findElement(By.id("RESULT_TextField-2")).sendKeys("Kumar");
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("7077310383");
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("india");
		driver.findElement(By.id("RESULT_TextField-5")).sendKeys("Berhampur");
		driver.findElement(By.id("RESULT_TextField-5")).sendKeys("Berhampur");
		driver.findElement(By.id("RESULT_TextField-6")).sendKeys("swadhinkumarpradhan012@gmail.com");
		driver.findElement(By.xpath("(//label[normalize-space()='Female'])[1]")).click();
		driver.findElement(By.xpath("(//label[normalize-space()='Wednesday'])[1]")).click();
		driver.findElement(By.xpath("(//select[@id='RESULT_RadioButton-9'])[1]")).click();
		WebElement fileInput = driver.findElement(By.id("q21"));

        // Provide the full file path to upload (make sure the file exists on your system)
        String filePath = "C:\\Test\\p.txt";

        // Upload the file by sending the file path to the file input field
        fileInput.sendKeys(filePath);
		driver.findElement(By.id("FSsubmit")).click();

		System.out.println("pass");

	}

}
