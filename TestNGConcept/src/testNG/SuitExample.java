package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuitExample {

	WebDriver driver; // Make it know for every method, because we use "driver" in all methods
	long startTime; // Taking every page star time and calculating total time at the diff method

	@BeforeSuite
	public void beforeSuit() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		startTime = System.currentTimeMillis();
	}

	@Test
	public void openGoogle() {
		driver.get("https://google.co.in");
	}

	@Test
	public void openBing() {
		driver.get("https://www.bing.com/");
	}

	@Test
	public void openYahoo() {
		driver.get("https://in.mail.yahoo.com");
	}

	@AfterSuite
	public void afterSuit() {
		driver.quit();
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total Time :" + totalTime);
	}
}
