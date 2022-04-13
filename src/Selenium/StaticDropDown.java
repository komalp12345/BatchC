package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaticDropDown {

	public static void main(String[] args) throws Exception {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\komal.pokharkar\\Desktop\\Copy\\Documents\\Automation\\Selenium Dependancies\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("http://driverhost:3000/");
			
			WebElement UI = driver.findElement(By.xpath("//*[contains(text(),'UI Automation Testing')]"));
			UI.click();
			
			WebElement User = driver.findElement(By.xpath("//input[@class='email_input']"));
			User.sendKeys("suhas.awale");
			
			WebElement pass =  driver.findElement(By.xpath("//input[@class='password_input']"));
			pass.sendKeys("suhas@123");
			
			User.click();
			
			WebElement login = driver.findElement(By.xpath("//*[contains(text(),'Login')]"));
			login.click();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//Implicit wait
			
			WebDriverWait wait = new WebDriverWait(driver,20);//Explicit wait
	
//Static dropdowns > we can use below methods only if we have select tag for these dropdowns			
			
			//creating webelement and storing it in
			WebElement drop = driver.findElement(By.xpath("//select[@xpath='1']"));
			
			//creating select class object
			Select dropdown = new Select(drop);//passing webelement to select class
			
			dropdown.selectByIndex(1);//selecting 0 index value
			System.out.println(dropdown.getFirstSelectedOption().getText());//To confirm that our option is selected correctly or not
			Thread.sleep(1000);
			
			//Select dropdown by value
			dropdown.selectByValue("Option 2");//you will find the value of this object in DOM
			System.out.println(dropdown.getFirstSelectedOption().getText());
			
			//Select dropdown by visible text
			dropdown.selectByVisibleText("Option 2");//you can provide visible text directly here
			System.out.println(dropdown.getFirstSelectedOption().getText());
			driver.close();
			
	}

}
