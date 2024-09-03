package TestNg;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(priority=1, groups= {"sanity", "regression"})
	void loginByEmail() {
		System.out.println("This is login by email");
	}
	@Test(priority=1, groups= {"sanity"})
	void loginByFacebook() {
		System.out.println("This is login by facebook");
	}
	@Test(priority=1, groups= {"sanity"})
	void loginByTwitter() {
		System.out.println("This is login by Twitter");
	}
	@Test(priority=1, groups= {"sanity", "regression"})
	void signUpByEmail() {
		System.out.println("This is signUpByEmail");
	}
	@Test(priority=1, groups= {"regression"})
	void signUpByFacebook() {
		System.out.println("This is signUpByFacebook");
	}
	@Test(priority=1, groups= {"regression"})
	void signUpByTwitter() {
		System.out.println("This is signUpByTwitter");
	}
	@Test(priority=1, groups= {"sanity", "regression"})
	void paymentInRupees() {
		System.out.println("This is paymentInRupees");
	}
	@Test(priority=1, groups= {"sanity"})
	void paymentInDollar() {
		System.out.println("This is paymentInDollar");
	}
	@Test(priority=1, groups= {"regression"})
	void paymentInBank() {
		System.out.println("This is paymentInBank");
	}

}
