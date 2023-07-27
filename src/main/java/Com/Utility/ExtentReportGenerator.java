package Com.Utility;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.ExtentReports;
public class ExtentReportGenerator {
	public static ExtentReports extent;
	public static ExtentReports getReports() {
		String path = "D:\\eclipse_yogesh\\Eclipse_23\\Yogesh_Workspace\\ISSR\\Reports";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Yogesh Automation Test Report");
		reporter.config().setReportName("ISSR Test Report");
		reporter.config().setTheme(Theme.DARK);
		 extent = new ExtentReports();
		 extent.attachReporter(reporter);
		 extent.setSystemInfo("Project Name", "ISSR Test");
		 extent.setSystemInfo("Tool", "Selenium WebDriver");
		 extent.setSystemInfo("QA", "Yogesh Nathjogi");
		 return extent;
		
		
		
		
		
	}

}
