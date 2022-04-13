package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionsClass {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "D:\\chromeSelenium\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
         
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		
		 WebElement mouse = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		 Actions obj = new Actions(driver);
		 obj.moveToElement(mouse).build().perform();// It will move to that element
			
		 WebElement hello = driver.findElement(By.id("twotabsearchtextbox"));
		 obj.moveToElement(hello).click().sendKeys("Test").build().perform();// It will enter the Test text
		 
		 // If I want to enter text in All caps letters 
		 
	     obj.moveToElement(hello).click().keyDown(Keys.SHIFT).sendKeys("Test").build().perform();
		 
	     //  // If I want to enter text in All caps letters and select that text 
	     obj.moveToElement(hello).click().keyDown(Keys.SHIFT).sendKeys("Test").doubleClick().build().perform();
	     
}}