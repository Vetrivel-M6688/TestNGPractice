package testNG;

import org.testng.annotations.Test;

public class DependsOn {

	@Test(enabled = true)
	public void openBrowser() {
		System.out.println("Chrome Browse launch");
	}

	@Test(dependsOnMethods = "openBrowser")
	public void lauchURL() {
		System.out.println("Google page launched");
	}
	
	@Test(dependsOnMethods = "lauchURL")
	public void login() {
		System.out.println("Login with proper creds");
	}
	
	@Test(dependsOnMethods = "login" )
	public void successful() {
		System.out.println("Login successfully");
	}
}
