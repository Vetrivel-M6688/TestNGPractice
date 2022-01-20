package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginWithData{

	@DataProvider(name="LoginData")
	public String[][] dataProvider() {
		String[][] data = {						//we can also initialize 2d array as class variable
				{"Admin","admin123"},
				{"Admin","admin"},
				{"Admin1","admin123"},
				{"Admin1","admin12"}
		};
		return data;
	}
	
	@Test(dataProvider = "LoginData")
	public void loginFunc(String userName, String Password) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		driver.findElement(By.id("btnLogin")).click();
		driver.quit();
	}
}
