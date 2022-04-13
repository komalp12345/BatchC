package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUPDown {

	void m1(WebDriver driver)
	{
		driver.get("https://www.timeanddate.com/calendar/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;//javascript executer object
		
		WebElement Month = driver.findElement(By.xpath("//a[contains(text(),'December')]"));
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		js.executeScript("arguments[0].scrollIntoView();", Month);//scroll down till element find
		//Month.click();
	}
	
	public static void main(String[] args) {
		ScrollUPDown obj = new ScrollUPDown();
		System.setProperty("webdriver.chrome.driver", "D:\\chromeSelenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    obj.m1(driver);
	
	}

}
