package testNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class AdExcelData {
	WebDriver driver;
	String[][] data;

	@DataProvider(name = "loginCreds")
	public String[][] dataProvide() throws BiffException, IOException {
		data = excelRead();
		return data;
	}

	public String[][] excelRead() throws BiffException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Welcome\\Documents\\Creds.xls");
		Workbook workbook = Workbook.getWorkbook(file);
		Sheet sheet = workbook.getSheet(0);
		int noOfRows = sheet.getRows();
		int noOfCols = sheet.getColumns();

		String[][] credsData = new String[noOfRows - 1][noOfCols];
		for (int i = 1; i < noOfRows; i++) {
			for (int j = 0; j < noOfCols; j++) {
				credsData[i - 1][j] = sheet.getCell(j, i).getContents();
			}
		}
		return credsData;
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Test(dataProvider = "loginCreds")
	public void loginPage(String uName, String pWord) {

		driver.findElement(By.id("txtUsername")).sendKeys(uName);
		driver.findElement(By.id("txtPassword")).sendKeys(pWord);
		driver.findElement(By.id("btnLogin")).click();
	}

	@AfterTest
	public void afterTest() {

		driver.quit();
	}
}
