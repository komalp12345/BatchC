package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUp_php {

	 void signUp(WebDriver driver) throws Exception
	 {
		 WebElement SignUp = driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]"));
		 SignUp.click();
		 
		 WebElement UserName = driver.findElement(By.id("name"));
		 UserName.sendKeys("xyz");
		 
		 Thread.sleep(2000);
		 WebElement Email = driver.findElement(By.xpath("//body/div[11]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/form[1]/div[1]/div[2]/input[1]"));
		 Email.sendKeys("vvvvvv@yahoo.com");
		 
		 WebElement Phone = driver.findElement(By.id("telephone_number"));
		 Phone.sendKeys("9876543220");
		 
		 WebElement Password = driver.findElement(By.id("password"));
		 Password.sendKeys("Password");
		 
		 WebElement ConfirmPassword = driver.findElement(By.id("confirm_password"));
		 ConfirmPassword.sendKeys("Password");
		 
		 WebElement Submit = driver.findElement(By.xpath("//input[@name='submit']"));
		 Submit.click();
		 
		 try 
		 {
			String EMailAddressalreadyexists = driver.findElement(By.xpath("//li[contains(text(),'Your E-Mail Address already exists in our records ')]")).getText();
//			System.out.println(EMailAddressalreadyexists);
			String originalMsg = "you for registering with us.";
			if(EMailAddressalreadyexists != originalMsg)
			 {
				 Email.clear();
				 Email.sendKeys("latest1@yahoo.com");
				 Submit.click();
			 }
		 } 
		 catch (Exception e) 
		 {
			e.printStackTrace();
			System.out.println(e+"New User");
		 }
		 Thread.sleep(10000);
		 String ThanksForRegistering = driver.findElement(By.xpath("//h1[contains(text(),'you for registering with us.')]")).getText();
	     System.out.println(ThanksForRegistering);
		
	 }
	
	
}
