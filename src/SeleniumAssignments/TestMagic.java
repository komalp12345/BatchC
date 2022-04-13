package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestMagic {

	void URL(WebDriver driver)
	{
		driver.get("http://localhost/TestMagic/Login.aspx");
		driver.manage().window().maximize();
	}
	
	void DropDown(WebDriver driver) throws Exception
	{
		WebElement drop = driver.findElement(By.id("dllRole"));//Dropdown 1
		Select dropdown = new Select(drop); //Creating object for select class of dropdown 
//		dropdown.selectByValue("Project Tester");
//		dropdown.selectByIndex(0);
		dropdown.selectByVisibleText("Project Tester");//Select by Visible text
		Thread.sleep(3000);
		
		WebElement Drop2 = driver.findElement(By.id("cboProject"));//Dropdown 2
		Select drop2 = new Select(Drop2);
		drop2.selectByVisibleText("Omni_channel");
		Thread.sleep(3000);
		
		WebElement Drop3 = driver.findElement(By.id("cboSubProject"));//Dropdown 3
		Select drop3 = new Select(Drop3);
		drop3.selectByVisibleText("Omni_channel");
		Thread.sleep(3000);
	}
	    void m3(WebDriver driver) throws Exception
	    {
		WebElement login = driver.findElement(By.id("btnLogin"));//Login button
		login.click();
		Thread.sleep(3000);
	    }
	
	public static void main(String[] args) throws Exception {
		TestMagic obj = new TestMagic();
		System.setProperty("webdriver.chrome.driver", "D:\\chromeSelenium\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    obj.URL(driver);
	    obj.DropDown(driver);
	    obj.m3(driver);
	    driver.close();
	
	}

}
