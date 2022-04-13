package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeWebDriver {

	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\chromeSelenium\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.javatpoint.com/");//Open webpage
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.close();
	}

}
