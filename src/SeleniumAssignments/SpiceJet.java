package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Selenium.WindowTabHandle;

public class SpiceJet {

	void m1(WebDriver driver)
	{
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		WebElement city = driver.findElement(By.xpath("//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu')"));
	    city.click(); 
	}
	
	public static void main(String[] args) {
		SpiceJet obj = new SpiceJet();
		System.setProperty("webdriver.chrome.driver", "D:\\chromeSelenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
	}

}
