package testNG;

import org.testng.annotations.Test;

public class Priority {

	@Test
	public void playSchool() {
		System.out.println("Studying in Play school");
	}

	@Test(priority=-1)
	public void elementrySchool() {
		System.out.println("Studying in Elementry school");
	}

	@Test(priority=0)
	public void highschool() {
		System.out.println("Studying in High School");
	}

	@Test(priority=2)
	public void collage() {
		System.out.println("Studying Degree");
	}
	
	@Test
	public void job() {
		System.out.println("Got a Job");
	}
	@Test
	public void practice() {
		System.out.println("Practicing");
	}

}
