package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelExe {

	@Test(enabled = true)
	public void openGoogle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.quit();
	}
	@Test(enabled = true)
	public void openFirefox() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Welcome\\Libs\\gecko\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.google.co.in");
		driver.quit();
	}
	@Test
	public void openEdge() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Welcome\\Libs\\Edge\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.co.in");
		driver.quit();
	}
}
