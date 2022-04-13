package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {
	
public static void main(String[] args) throws IOException  {
	
	System.setProperty("webdriver.chrome.driver", "D:\\chromeSelenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.javatpoint.com/java-tutorial");
	driver.manage().window().maximize();
	
	//here driver hving the object that is TakesScreenshot will take
	//the ss in output file type and storing this in fileobj 
	File fileobj = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	//now copying this ss from fileobj to local machine 
	Files.copy(fileobj, new File("C:\\Users\\komal.pokharkar\\Desktop\\Copy\\123.jpeg"));
	
	driver.close();
	
}
	
	
}
