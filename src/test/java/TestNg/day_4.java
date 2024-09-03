package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class day_4 {
	

	@Test
	public void WebLoginHomeCar() {
		System.out.println("WbeLoginHomeCar");
	}
	
	@Test
	public void MobileLoginHomeCar() {
		System.out.println("MobileWbeLoginHomeCar");
	}
	
	@Test(groups= {"Smoke"})
	public void print_3() {
		System.out.println("Good Mentor");
	}
	
	@BeforeClass
	public void MobileLoginHomeCar_1() {
		System.out.println("MobileWbeLoginHomeCar");
	}
	@AfterClass
	public void MobileLoginHomeCar_2() {
		System.out.println("MobileWbeLoginHomeCar");
	}

}
