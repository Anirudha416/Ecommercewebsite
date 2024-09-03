package TestNg;


import org.testng.annotations.*;

public class AutomationDemo_1 {
	@BeforeMethod
	void login() {
		System.out.println("Login");
	}
	@Test
	void search() {
		System.out.println("Search");
	}
	@Test
	void advsearch() {
		System.out.println("AdvSearch");
	}
	@AfterMethod
	void logout() {
		System.out.println("Logout");
	}
}
