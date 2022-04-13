package SeleniumAssignments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class TCListener implements ITestListener {

WebDriver driver;
	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCase executed Successfully");

		File fileobj = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 
		try {
			Files.copy(fileobj, new File("C:\\Users\\komal.pokharkar\\Desktop\\Copy\\123.jpeg"));
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

	
	
}
