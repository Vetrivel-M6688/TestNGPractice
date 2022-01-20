package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationExeOrder {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite Method");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test Method");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class Method");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	@Test
	public void testMethod() {
		System.out.println("Test Method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test Method");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
}
