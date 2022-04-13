package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	void Alert1(WebDriver driver) throws Exception
	{
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement alert1 = driver.findElement(By.id("alertButton"));
		alert1.click();
		Thread.sleep(5000);
	    
	    driver.switchTo().alert().accept();//To accept the alert>clicked on oK
	}
	void Alert2(WebDriver driver) throws Exception
	{
		WebElement alert2 = driver.findElement(By.id("timerAlertButton"));
		alert2.click();
	
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.alertIsPresent());//To wait until alert appears
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}
	void Alert3(WebDriver driver) throws Exception
	{
		WebElement alert3 = driver.findElement(By.id("confirmButton"));
		alert3.click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
	}
	void Alert4(WebDriver driver) throws Exception
	{
		WebElement alert4 = driver.findElement(By.id("promtButton"));
		alert4.click();
		driver.switchTo().alert().sendKeys("komal");
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
	}
	
	public static void main(String[] args) throws Exception  {
		Alerts obj = new Alerts();
		System.setProperty("webdriver.chrome.driver", "D:\\chromeSelenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		obj.Alert1(driver);
		obj.Alert2(driver);
		obj.Alert3(driver);
		obj.Alert4(driver);
		driver.close();
	}

}
