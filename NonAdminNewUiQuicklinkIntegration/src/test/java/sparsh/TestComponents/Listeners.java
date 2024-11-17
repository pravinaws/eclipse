//package sparsh.TestComponents;
//
//import java.io.IOException;
//import org.apache.log4j.Logger;
//import org.openqa.selenium.WebDriver;
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import lombok.extern.log4j.Log4j;
//import sparsh.resources.ExtentReporterNG;
//
//public class Listeners extends BaseTest implements ITestListener
//{
//	ExtentTest test;
//	ExtentReports extent=ExtentReporterNG.getReportObject(); 
//	ThreadLocal<ExtentTest> extentTest=new ThreadLocal<ExtentTest>(); //Thread safe
//	private static Logger Log = Logger.getLogger(Log4j.class.getName());
//	
//	public void onTestStart(ITestResult result)
//	{
//		test=extent.createTest(result.getMethod().getMethodName());
//		extentTest.set(test); //unique thread id & instide of test use extentTest.get()
//		Log.info("Test Started:   "+result.getName());
//	}
//	
//	public void onTestSuccess(ITestResult result)
//	{
//		extentTest.get().log(Status.PASS, "Test Passed");
//		Log.info(result.getName()+" Passed");
//		//Log.info(result.getMethod().getMethodName()+"Passed");
//	}
//	
//	public void onTestFailure(ITestResult result)
//	{
//		//test.log(Status.FAIL, "Test Failed");
//		//test.fail(result.getThrowable());
//		extentTest.get().log(Status.FAIL,"Test Failed");
//		extentTest.get().fail(result.getThrowable());
//		Log.info("Failed because of: "+result.getThrowable());
//		System.out.println("TEST2");
//		try
//		{
//			driver=(WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
//		}
//		catch (Exception e1)
//		{
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		
//		String filePath=null;
//		try
//		{
//			filePath=getScreenshot(result.getMethod().getMethodName(),driver);
//		}
//		catch (IOException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		extentTest.get().addScreenCaptureFromPath(filePath, result.getMethod().getMethodName());
//	}
//	
//	public void onTestSkipped(ITestResult result)
//	{
//		Log.info("Skipped because of: "+ result.getThrowable());		
//	}
//	
//	public void onFinish(ITestContext context)
//	{
//		//Log.info("=========== onFinish :-" + context.getName() + "===============");
//		extent.flush();
//	}
//}