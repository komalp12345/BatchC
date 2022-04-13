package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) throws Exception {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\komal.pokharkar\\Desktop\\Copy\\Documents\\Selenium Dependancies\\chromedriver.exe");

    WebDriver FB = new ChromeDriver();
    FB.get("https://www.facebook.com/reg/");
    
    WebElement firstname = FB.findElement(By.xpath("//input[@name='firstname']"));
    firstname.sendKeys("komal");
    
    WebElement Lastname = FB.findElement(By.xpath("//input[@name='lastname']"));
    Lastname.sendKeys("pokharkar");
    
    WebElement mob = FB.findElement(By.xpath("//input[@name='reg_email__']"));
    mob.sendKeys("98765432098");
    
    WebElement newpass = FB.findElement(By.xpath("//input[@id='password_step_input']"));
    newpass.sendKeys("facebook#00");
    
    WebElement day = FB.findElement(By.xpath("//select[@id='day']"));
    day.sendKeys("28");
    
    WebElement month = FB.findElement(By.xpath("//select[@id='month']"));
    month.sendKeys("Aug");
    
    WebElement year = FB.findElement(By.xpath("//select[@id='year']"));
    year.sendKeys("1997");
    Thread.sleep(2000);
    
    WebElement female = FB.findElement(By.xpath("//*[contains(text(),'Female')]"));
    female.click();
    
    WebElement male = FB.findElement(By.xpath("//*[contains(text(),'Male')]"));
    male.click();
    
    WebElement custom = FB.findElement(By.xpath("//*[contains(text(),'Custom')]"));
    custom.click();
    
    WebElement pronoun = FB.findElement(By.xpath("//*[contains(@name,'preferred_pronoun')]"));
    pronoun.sendKeys("She:"+"Wish her happy birthday!");
    Thread.sleep(2000);
    
    WebElement Gender = FB.findElement(By.xpath("//input[@name='custom_gender']"));
    Gender.sendKeys("Female");
    
//    WebElement alreadyAC = FB.findElement(By.xpath("//*[contains(text(),'Already have an account')]"));
//    alreadyAC.click();
    
}

}
