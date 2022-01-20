package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {

	@Test
	@Parameters("Name")
	public void givenName(String empName) {
		System.out.println("Employee Name Is: "+empName);
	}
	
	@Test
	@Parameters("Id")
	public void givenID(int empID) {
		System.out.println("Employee Id Is: "+empID);
	}
	@Test
	@Parameters({"URL","sendText"})
	public void loginPage(String URL, String sendText) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys(sendText);
	}
}
