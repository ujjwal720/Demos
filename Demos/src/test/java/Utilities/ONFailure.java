package Utilities;

import java.sql.Date;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ONFailure implements ITestListener{
	
	
	public void onTestFailure(ITestResult Result) {
		
		/*
		 * ScreenshotUtility for the following
		 */
		
		String testcasename=Result.getTestName().toString();
		
		
		
		
	}

}
