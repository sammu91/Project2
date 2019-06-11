package com.actitime.generic;

import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyTestNgListener implements ITestListener
{

	public static int executionCount,passCount,failCount,skipCount;   
	// These variables should be static as we will using these in static methods
	
	@Override
	public void onTestStart(ITestResult result) {

		Reporter.log(result.getName()+ "script start executing" + new Date(), true);
		executionCount++;
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		Reporter.log(result.getName()+"script is passed",true);
		passCount++;
	}

	@Override
	public void onTestFailure(ITestResult result) {

		Reporter.log(result.getName()+"script is failed",true);
		failCount++;
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName()+"script is skipped",true);
		skipCount++;		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub no need of this method
		
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("Suite Execution starts"+new Date(),true);
		
	}

	@Override
	public void onFinish(ITestContext context) {

		Reporter.log("Suite Execution ends"+new Date(),true);
		Reporter.log("Total scripts executed:"+executionCount ,true);
		Reporter.log("Total scripts passed:"+passCount ,true);
		Reporter.log("Total scripts failed:"+failCount ,true);
		Reporter.log("Total scripts skipped:"+skipCount ,true);


	}

	
	
	
}