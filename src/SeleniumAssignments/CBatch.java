package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CBatch {

	void m1(WebDriver driver) throws Exception
	{
		driver.get("https://meet.google.com/oqm-ixfa-qww?pli=1");
		driver.manage().window().maximize();
		
//		WebElement alert1 = driver.findElement(By.id("alertButton"));
//		alert1.click();
		Thread.sleep(10000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		WebElement vdo = driver.findElement(By.xpath("//body/div[@id='yDmH0d']/c-wiz[1]/div[1]/div[1]/div[9]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/span[1]/span[1]/div[1]/span[2]/*[1]"));
	    vdo.click();
	    
	    WebElement audio = driver.findElement(By.xpath("//body/div[@id='yDmH0d']/c-wiz[1]/div[1]/div[1]/div[9]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/div[1]/div[1]/span[2]/*[1]"));
	    audio.click();
	    
	    WebElement join = driver.findElement(By.xpath("//span[contains(text(),'Ask to join')]"));
	    join.click();
	    
	    
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws Exception {
		CBatch obj = new CBatch();
		System.setProperty("webdriver.chrome.driver", "D:\\chromeSelenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		obj.m1(driver);

	}

}
