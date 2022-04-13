 package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	void m1(WebDriver driver)
	{
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
	}
	void m2(WebDriver driver) throws Exception
	{
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));//To switch into frame
		Thread.sleep(3000);
		
		Actions obj1 = new Actions(driver);
		obj1.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).build().perform();
		Thread.sleep(3000);
	}
	void m3(WebDriver driver) throws Exception
	{
		driver.switchTo().defaultContent();//To comeout from any iframe to default page
		WebElement mainpage = driver.findElement(By.xpath("//input[@name='s']"));
		mainpage.sendKeys("draggable");
		Thread.sleep(3000);
		
//		WebElement dragclick = driver.findElement(By.xpath("//span[@xpath='1']"));
//		dragclick.click();
		Thread.sleep(2000);
	}
	public static void main(String[] args) throws Exception {
		DragDrop obj = new DragDrop();
	    System.setProperty("webdriver.chrome.driver", "D:\\chromeSelenium\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    obj.m1(driver); 
	    obj.m2(driver);
	    obj.m3(driver);
	    
	    driver.close();
	
	}
	
	
	

}
