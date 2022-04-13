package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElerment {

	public static void main(String[] args) throws Exception {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\komal.pokharkar\\Desktop\\Copy\\Documents\\Selenium Dependancies\\chromedriver.exe");

		WebDriver myelement = new ChromeDriver();
		myelement.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement FullName = myelement.findElement(By.xpath("//tbody/tr[3]/td[3]/input[1]"));
		FullName.sendKeys("Komal");
		
		Thread.sleep(5000);
		
		WebElement Id = myelement.findElement(By.xpath("//tbody/tr[7]/td[3]/input[1]"));
		Id.sendKeys("12345");       
		
	}

}
