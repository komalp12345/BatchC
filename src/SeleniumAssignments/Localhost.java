package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Localhost {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\chromeSelenium\\chromedriver.exe");
		
		WebDriver local = new ChromeDriver();
		local.get("http://localhost:3000/");
		
		WebElement UI = local.findElement(By.xpath("//*[contains(text(),'UI Automation Testing')]"));
		UI.click();
		
		WebElement User = local.findElement(By.xpath("//input[@class='email_input']"));
		User.sendKeys("suhas.awale");
		
		WebElement pass =  local.findElement(By.xpath("//input[@class='password_input']"));
		pass.sendKeys("suhas@123");
		
		User.click();
		Thread.sleep(2000);
		WebElement login = local.findElement(By.xpath("//*[contains(text(),'Login')]"));
		login.click();
		
	}

}
