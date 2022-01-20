package testNG;

import org.testng.annotations.Test;

public class GroupClass {

	@Test(groups = {"Apple"})
	public void apple1() {
		System.out.println("Apple Product");
	}
	@Test(groups = {"Apple"})
	public void apple2() {
		System.out.println("Apple Product");
	}
	@Test(groups = {"Xiomi"})
	public void Xiomi1() {
		System.out.println("Xiomi Product");
	}
	@Test(groups = {"Xiomi"})
	public void Xiomi2() {
		System.out.println("Xiomi Product");
	}
	@Test(groups = {"Samsung"})
	public void Samsung1() {
		System.out.println("Samsung Product");
	}
	@Test(groups = {"Samsung"})
	public void Samsung2() {
		System.out.println("Samsung Product");
	}
}
