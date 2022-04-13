package Selenium;

import org.testng.Assert;

public class Assertions {

	// Assertions are used to validate our expected results with actual results 
	
	// Types of assertions >
	// 1.
	 void assertions()
	 {
		 Assert.assertTrue(true); // Assert true will pass the case only when expected value and in arguments
		 // returns true or the condition is passed.
		 Assert.assertTrue(false);
		 // It will fail the case when when actual result is false
		 
		 
	// 2.
		 Assert.assertFalse(false); // Assert false will pass the case onlt when our actual value is returns 
		 //false	
		 
		 Assert.assertFalse(true);// It will fail the case when actual value id true

   // 3. 
		 Assert.assertEquals("actual", "expected");
		 // It will pass the case only if both teh cases are equal.
		 
		
	
	
	
	
	
	 }
}
