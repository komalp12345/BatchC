package SeleniumAssignments;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TMTest {
	
 void m1(WebDriver driver)
 {
	 driver.get("http://localhost/TestMagic/Login.aspx");
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	 Select role = new Select(driver.findElement(By.id("dllRole")));
	 role.selectByVisibleText("Project Admin");
	 
	 Select subrole = new Select(driver.findElement(By.id("cboProject")));
	 subrole.selectByVisibleText("Sample");
	 
	 WebElement Login = driver.findElement(By.id("btnLogin"));
	 Login.click();
 }
 void m2(WebDriver driver)
 {
	 WebElement testplan = driver.findElement(By.xpath("//span[contains(text(),'Test Plan Management')]"));
	 testplan.click();
	 
	 WebElement opt = (driver.findElement(By.xpath("//a[contains(text(),'Scheduled Test Management')]")));
     opt.click();
     
     Select project = new Select(driver.findElement(By.id("cboSubProject")));
     project.selectByVisibleText("Sample");
 }
	void calendar(WebDriver driver) throws Exception
	{
		WebElement calendar = driver.findElement(By.id("ImageButton1"));
		calendar.click();
		WebElement month = driver.findElement(By.xpath("//div[@id='CalendarExtender1_title']"));
		String s1 = "January, 2021";
		while(!month.getText().contains(s1))//Check till desire month
		{
			driver.findElement(By.id("CalendarExtender1_prevArrow")).click();//To click on calendar prev arrow
		}
		List<WebElement> date = driver.findElements(By.xpath("//div[@id='CalendarExtender1_day_0_5']"));
		Thread.sleep(3000);
		
		for(WebElement day:date)
		{
			//int dayselect = 16;
			if(day.getText().equalsIgnoreCase("1"))
			{
				day.click();
			}
		}
	}
	void calnext(WebDriver driver)
	{
		WebElement calnxt = driver.findElement(By.xpath("//input[@id='ImageButton2']"));
		calnxt.click();
		WebElement month2 = driver.findElement(By.xpath("//div[@id='CalendarExtender2_title']"));
		String s2 = "December, 2022";
		
		while(!month2.getText().contains(s2))
		{
			driver.findElement(By.id("CalendarExtender2_nextArrow")).click();
		}
		List<WebElement> date2 = driver.findElements(By.xpath("//div[@id='CalendarExtender2_day_4_6']"));
		
		for(WebElement day2:date2)
		{
			if(day2.getText().equalsIgnoreCase("31"))
			{
				day2.click();
			}
		}
	}
	void next(WebDriver driver) throws Exception
	{
		WebElement go = driver.findElement(By.id("btnGo"));
		go.click();
		
		WebElement delete = driver.findElement(By.xpath("//tbody/tr[@id='dgvGroup_ctl00__0']/td[9]/a[1]/img[1]"));
	    delete.click();
	    
	    Thread.sleep(3000);
	    driver.switchTo().alert().accept();
	    
	    //driver.switchTo().defaultContent();	    
	    String success = driver.findElement(By.xpath("//span[contains(text(),'Record deleted successfully')]")).getText();
        System.out.println(success);
	    Thread.sleep(3000);
	    
	    WebElement logoff = driver.findElement(By.xpath("//input[@name='LogOff']"));
	    logoff.click();
	    Thread.sleep(5000);
	    driver.close();
	}
	public static void main(String[] args) throws Exception {
		TMTest obj = new TMTest();
		System.setProperty("webdriver.chrome.driver", "D:\\chromeSelenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		obj.m1(driver);
		obj.m2(driver);
		obj.calendar(driver);
		obj.calnext(driver);
		obj.next(driver);
	}

}
