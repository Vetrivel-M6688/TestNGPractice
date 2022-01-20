package testNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelData {
	String[][] data = null;

	@DataProvider(name = "crediantials")
	public String[][] dataProviderMethod() throws BiffException, IOException {
		data = getExcelData();
		return data;
	}

	public String[][] getExcelData() throws BiffException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Welcome\\Documents\\Creds.xls");
		Workbook workbook = Workbook.getWorkbook(file);

		Sheet sheet = workbook.getSheet(0);
		int rowCount = sheet.getRows();
		int colCount = sheet.getColumns();

		String[][] testData = new String[rowCount - 1][colCount];

		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				testData[i - 1][j] = sheet.getCell(j, i).getContents();
			}
		}
		return testData;

	}

	@Test(dataProvider = "crediantials")
	public void loginPage(String userName, String Password) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Libs\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		driver.findElement(By.id("btnLogin")).click();
		driver.quit();
	}
}
