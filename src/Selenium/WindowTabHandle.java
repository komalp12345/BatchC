package Selenium;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowTabHandle {

	void win1(WebDriver driver) throws Exception
	{
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
		WebElement option = driver.findElement(By.xpath("//h5[contains(text(),'Alerts, Frame & Windows')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;//object for scroll down
		js.executeScript("window.scrollBy(0,350)", "");//scrolling
		Thread.sleep(3000);
		option.click();
	    
	    WebElement browser = driver.findElement(By.xpath("//span[contains(text(),'Browser Windows')]"));
        Thread.sleep(2000);
        JavascriptExecutor browserscroll = (JavascriptExecutor) driver;//object for scroll down
		browserscroll.executeScript("window.scrollBy(0,150)", "");//scrolling
	    browser.click();
	    

        WebElement window = driver.findElement(By.id("windowButton"));//Parent text element
        window.click();
        Thread.sleep(5000);
        
	    Set<String> win =driver.getWindowHandles();//To store multiple windows
	    Iterator<String> itr1 = win.iterator();//To iterate through all the elements
	    String main = itr1.next();//Main window
	    String subwin = itr1.next();//Child window
	    driver.switchTo().window(subwin);//To switch from main to child
	    
	    WebElement textwin = driver.findElement(By.id("sampleHeading"));//Text element
		System.out.println(textwin.getText());

	}
	
	void Tab(WebDriver driver) throws Exception
	{
		driver.switchTo().defaultContent();
		WebElement Tab = driver.findElement(By.className("btn btn-primary"));
		Tab.click();
		Thread.sleep(5000);
		
		Set<String> tab = driver.getWindowHandles();//To store multiple tabs or windows
	    Iterator<String> itr = tab.iterator();//Iterate through all the elements
	    String Parent = itr.next();//Parent tab
		String child = itr.next();//Child tab
		driver.switchTo().window(child);//Switch from main window to child window
		Thread.sleep(2000);
		
		WebElement text = driver.findElement(By.id("sampleHeading"));
		System.out.println(text.getText());

	}
	public static void main(String[] args) throws Exception {
		WindowTabHandle obj = new WindowTabHandle();
		System.setProperty("webdriver.chrome.driver", "D:\\chromeSelenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		obj.win1(driver);
		obj.Tab(driver);
		Thread.sleep(1000);
		driver.quit();
	}

}
