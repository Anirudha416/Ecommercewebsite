package TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day_3 {
	@Parameters({"URL"})
	@Test
	public void WebLoginCar(String urlname) {
		System.out.println("WbeLoginCar");
		System.out.println(urlname);
	}
	
	
	
	
	@Test(groups= {"Smoke"})
	public void print_2() {
		System.out.println("Good Exam");
	}
	
	@Test(dataProvider="getData")
	public void MobileLoginCar(String uname, String pass) {
		System.out.println("MobileWbeLoginCar");
		System.out.println(uname);
		System.out.println(pass);
	}
	
	@BeforeMethod
	public void MobileLoginCar_1() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void MobileLoginCar_2() {
		System.out.println("After Method");
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
	    data[0][0]="firstusername";
	    data[0][1]="password";
	    
	    data[1][0]="secondusername";
	    data[1][1]="secondpassword";
	    
	    data[2][0]="thirdusername";
	    data[2][1]="thirdpassword";
	    return data;
	    
	    
	    
	}

}
