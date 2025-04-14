package OfficePractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class OfficePractice1 {

	public static void main(String[] args) throws InterruptedException {

		RemoteWebDriver Driver=new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		Driver.get("https://www.facebook.com/");
		Driver.manage().window().maximize();
		String title=Driver.getTitle();
		System.out.println("title of webpage is "+title);
		
		String Currenturl=Driver.getCurrentUrl();
		System.out.println("Currenturl of webpage is "+Currenturl);
//		Driver.close();
		System.out.println("hi");
		
		
	
		
		Driver.navigate().to("https://www.google.com/");
		Thread.sleep(1000);

		String title1=Driver.getTitle();
		System.out.println("title of webpage is "+title1);
		Driver.navigate().back();
		Thread.sleep(1000);
		
		Driver.navigate().forward();
		Thread.sleep(1000);
		
		Driver.navigate().refresh();
	}
}
