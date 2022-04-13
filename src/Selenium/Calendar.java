package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	void m1(WebDriver driver) throws Exception
	{
		driver.get("https://phptravels.net/");
	    driver.manage().window().maximize();
	    
	    WebElement calendar = driver.findElement(By.id("checkin"));//Clicking on calendar field
	    calendar.click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
//	    
//	    while(true)
//	    {
//	    	String month = driver.findElement(By.xpath("//body/div[3]/div[1]/table[1]")).getText();
//	    	
//	    	if(month.equals("August 2023"))
//	    	{
//	    		break;
//	    	}
//	    	else
//	    	{
//	    		WebElement arrow = driver.findElement(By.xpath("//body[1]/div[4]/div[1]/table[1]/thead[1]/tr[1]/th[3]/i[1]"));
//	    		arrow.click();
//	    	}
//	    	
//	    }
//	}
	    while(!driver.findElement(By.xpath("//body[1]/div[4]/div[1]/table[1]")).getText().contains("August 2023"))
	    		{
	    	driver.findElement(By.xpath("//body[1]/div[4]/div[1]/table[1]/thead[1]/tr[1]/th[3]/i[1]")).click();
	    		}
 }
	    void m2(WebDriver driver)
	    {
	    	
	WebElement day = (WebElement) driver.findElement(By.className("day")).getSize();
	   // day.click();
	    
	   // for(int i=0;i<day;i++) 
	    {
	    	
	    }
	    }
	   
	
	public static void main(String[] args) throws Exception {
		Calendar obj = new Calendar();
		System.setProperty("webdriver.chrome.driver", "D:\\chromeSelenium\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	
	    obj.m1(driver);
	   // obj.m2(driver);
	    
	}
	
	

}
