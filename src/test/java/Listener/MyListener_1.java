package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener_1  implements ITestListener{
    public void onTestStart(ITestResult result) {
    	System.out.println("On Start");
    	
    }
public void onTestSuccess(ITestResult result) {
	System.out.println("On Success");
    }
public void onTestFailure(ITestResult result) {
	System.out.println("On Failure");
}
public void onTestSkipped(ITestResult result) {
	System.out.println("On Skipped");
}
public void onFinish(ITestContext context) {
	System.out.println("On Finished");
}
}
