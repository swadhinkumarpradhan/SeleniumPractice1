package Selenium1.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginAutomation {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		WebElement emailField = driver.findElement(By.id("email"));
		emailField.sendKeys("your_email@example.com");

		WebElement passwordField = driver.findElement(By.id("pass"));
		passwordField.sendKeys("your_password");

		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.quit();
	}
}
