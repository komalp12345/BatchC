package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElermentAss {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\komal.pokharkar\\Desktop\\Copy\\Documents\\Selenium Dependancies\\chromedriver.exe");
         
		WebDriver mydriver = new ChromeDriver();
		mydriver.get("https://www.youtube.com/c/pavanoltraining/videos");
		
		WebElement Search = mydriver.findElement(By.xpath("//input[@id='search']"));
		Search.sendKeys("Automation Testing");
		
		
		
	}

}
