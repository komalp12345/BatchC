package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextByMethod {

	void m1(WebDriver driver)//Parameter passing to give the WebDriver knowledge to method
	{
		driver.get("http://localhost/TestMagic/Login.aspx");//Invoking URL
		driver.manage().window().maximize();//Maximize window
	}
	
	void m2(WebDriver driver)////Parameter passing to give the WebDriver knowledge to method
	{
		WebElement name = driver.findElement(By.id("lbluserNamedisp"));//Finding WebElement by locator id
		String myname = name.getText();//Getting text and storing in string
		System.out.println(myname);//Printing String
	}
	
	public static void main(String[] args) {
		
		GetTextByMethod obj = new GetTextByMethod();//Class Object
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\komal.pokharkar\\Desktop\\Copy\\Documents\\Automation\\Selenium Dependancies\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();//WebDriver Object
	    
	    obj.m1(driver);//Calling method
	    obj.m2(driver);//Calling method
	    
	    driver.close();//Close Browser
		
	}

}
