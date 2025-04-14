package OfficePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class BrowserCommand {
   public static void main(String[] args) throws InterruptedException {

      // Initiate the Webdriver
      WebDriver driver = new ChromeDriver();

      // adding implicit wait of 15 secs
      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

      // launching a browser and open a  URL
      driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

      // Getting browser title after launch
      System.out.println("Getting browser title after launch: " + driver.getTitle());

      // Getting browser URL after launch
      System.out.println("Getting URL after launch: " + driver.getCurrentUrl());

      // identify link then click
      WebElement l = driver.findElement(By.xpath("//*[@id='collapseTwo']/div/ul/li[2]/a"));
      l.click();

      // Getting browser title after clicking link
      System.out.println("Getting browser title after clicking link: " + driver.getTitle());

      // Getting browser URL after launch
      System.out.println("Getting URL after clicking link: " + driver.getCurrentUrl());

      // Quitting browser
      driver.quit();
   }
}