package testNG;

import org.testng.annotations.Test;

public class SkipTestCase {

	@Test(priority=0, enabled = false)
	public void playSchool() {
		System.out.println("playSchool Method");
	}

	@Test(priority=1)
	public void elementrySchool() {
		System.out.println("elementry school Method");
	}

	@Test(priority=2)
	public void highSchool() {
		System.out.println("High school Method");
	}

	@Test(priority=3)
	public void Collage() {
		System.out.println("Degreee");
	}
}
