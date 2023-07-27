package Com.Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends BaseClass implements ITestListener {
	
	ExtentReports extent = ExtentReportGenerator.getReports();
	ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
	public void onTestStart(ITestResult result) {
		extent.createTest(result.getTestClass().getName()+"=="+result.getMethod().getMethodName());
		
	}
	public void onTestSuccess(ITestResult result) {
		extentTest.get().log(Status.PASS, "Test Case Pass");
		
	}
//	public void onTestFailure(ITestResult result) {
//		extentTest.get().log(Status.FAIL, "Test Case fail");
//		
//	}
	public void onTestSkipped(ITestResult result) {
		extentTest.get().log(Status.SKIP, "Test Case skip");
		
	}
	
	public void onFinish(ITestContext context) {
		extent.flush();
		
	}
	
	

}
