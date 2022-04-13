package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\komal.pokharkar\\Desktop\\Copy\\Documents\\Automation\\Selenium Dependancies\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");	
		driver.findElement(By.id("")).click();
		
		//when we have to iterate for multiple times
		int i =1;
		while (i<7)
		{
			driver.findElement(By.id("")).click();
			i++;
		}
		System.out.println(driver.findElement(By.id("")).getText());//To see what values we have select
		
		
		//we can do this using for loop also
		
		for(int j=1;j<5;j++)
		{
			driver.findElement(By.id("")).click();
		}
		System.out.println(driver.findElement(By.id("")).getText());//To see what values we have select
	
	}

}
