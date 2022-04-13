package SeleniumAssignments;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PurpleTestNGMain {

	WebDriver driver;
	
		void methodinvoke(WebDriver driver)
		{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://www.purplestores.in/ecommerce-website-themes.php");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
		}
		
		void scroll(WebDriver driver)
		{
			JavascriptExecutor scrlobj = (JavascriptExecutor) driver;
			scrlobj.executeScript("window.scrollBy(0,150)", "");
			WebElement viewdemo = driver.findElement(By.xpath("(//*[contains(text(),'View Demo')])[2]")); //if there are multiple elements with same xpath are there write xpath with indexing 
//			scrlobj.executeScript("arguments[0].scrollIntoView();", viewdemo);//scroll down till element find
			viewdemo.click();
		}	
		
			void newwin(WebDriver driver) throws Exception
			{
				Set<String> win = driver.getWindowHandles();//To store multiple windows
				Iterator<String> itr = win.iterator();
				String mainWin = itr.next();
				String subWin = itr.next();
			    driver.switchTo().window(subWin);	//To switch into subwindow
			
	          //  driver.getTitle();

		        WebElement gorgeouswin = driver.findElement(By.xpath("//span[@data-id='159']"));
			    gorgeouswin.click();
			
			    WebElement women = driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[3]/span[1]/i[1]"));
			    women.click();
			    
			    Thread.sleep(3000);
			    WebElement SunGlasses = driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[3]/ul[1]/li[3]/a[1]"));
			    SunGlasses.click();
			    
			    JavascriptExecutor bottom = (JavascriptExecutor) driver;
			    WebElement page1 = driver.findElement(By.xpath("//input[@id='custom-price-btn']"));
			    bottom.executeScript("arguments[0].scrollIntoView", page1);
			
			    WebElement min = driver.findElement(By.xpath("//input[@name='start_price_range']"));
			    min.sendKeys("1000");
			    
			    Thread.sleep(3000);
			    WebElement max = driver.findElement(By.xpath("//input[@name='end_price_range']"));
			    max.sendKeys("3000");
			    
			    WebElement go = driver.findElement(By.xpath("//input[@id='custom-price-btn']"));
			    go.click();
		}
			void selectitem(WebDriver driver) throws Exception
			{
				WebElement item = driver.findElement(By.xpath("//input[@id='add_to_cart2562_list']"));
				item.click();
				
				Select clr = new Select(driver.findElement(By.id("id[55]")));
				clr.selectByVisibleText("Blue Pink");
				
				Thread.sleep(3000);
				WebElement AddToWishList = driver.findElement(By.xpath("//a[contains(text(),'Add to wishlist')]"));
				AddToWishList.click();			
			}
			
			
			}






	
	

