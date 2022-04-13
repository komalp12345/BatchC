package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

       System.setProperty("webdriver.chrome.driver", "C:\\Users\\komal.pokharkar\\Desktop\\Copy\\Documents\\Selenium Dependancies\\chromedriver.exe");

       WebDriver path = new ChromeDriver();
       path.get("https://register.rediff.com/register/register.php?FormName=user_details");
       
       WebElement mypath = path.findElement(By.xpath("//*[contains(@name,'name')]"));
       mypath.sendKeys("komal pokharkar");
       
       WebElement ID = path.findElement(By.xpath("//*[contains(@name,'loginc')]"));
       ID.sendKeys("1234567890");
       
       WebElement check = path.findElement(By.xpath("//input[@class='btn_checkavail']"));
       check.click();
       
       WebElement pass = path.findElement(By.xpath("//*[contains(@name,'passwdc')]"));
       pass.sendKeys("komal@123");
       
       WebElement repass = path.findElement(By.xpath("//input[@name='confirm_passwdc07d5157']"));
       repass.sendKeys("komal@123");
       
       WebElement email = path.findElement(By.xpath("//*[@name='altemailc07d5157']"));
       email.sendKeys("abc@gmail.com");
       
       WebElement checkbox = path.findElement(By.xpath("//input[@class='nomargin']"));
       checkbox.sendKeys("//input[@class='nomargin']");
       
       
       
	}

}
