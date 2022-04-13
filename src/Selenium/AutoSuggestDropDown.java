package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDown {

	void m1(WebDriver driver) throws Exception
	{
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		
		WebElement drop = driver.findElement(By.id("sb_form_q"));
		Thread.sleep(2000);
		drop.sendKeys("testing");//entering input text
		String s = "tools";//storing string in var
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//Implicity wait to whole class
		List<WebElement> List = driver.findElements(By.xpath("//li[@class='sa_sg']//span"));//storing all list values in var including duplicates bcoz list accept duplicates 
	//	System.out.println(List);
	
		for(WebElement option:List)//Itearting through all list elements using for each loop
		{
			if(option.getText().contains(s))//checking if list values contains our string or not
			{
			option.click();//If yes click on taht element
			break;// break the loop 
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		AutoSuggestDropDown obj = new AutoSuggestDropDown();
		System.setProperty("webdriver.chrome.driver", "D:\\chromeSelenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		obj.m1(driver);
		driver.close();
		
	}

}
