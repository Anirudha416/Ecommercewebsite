package TestNg;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day_2 {
 
	@Test
	public void print() {
		System.out.println("Good");
	}
	
	@Test(groups= {"Smoke"})
	public void print_1() {
		System.out.println("Good Test");
	}
	
	@BeforeTest
	public void prerequisite() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void prerequisite_1() {
		System.out.println("After Test");
	}
	
}
