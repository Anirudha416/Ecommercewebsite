package TestNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	 public void onTestStart(ITestResult result) {
	    //	System.out.println("I successfully executed Listeners Pass code");
	    	
	    }
	public void onTestSuccess(ITestResult result) {
		System.out.println("I successfully executed Listeners Pass code");
	    }
	public void onTestFailure(ITestResult result) {
		System.out.println("I Failed executed Listeners Pass code "+result.getName());
	}
	public void onTestSkipped(ITestResult result) {
		
	}
	public void onFinish(ITestContext context) {
		
	}

    
}
