package Selenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {

	@Test(dataProvider="getdata")// giving knowledge of array method to read the data 
	void DataProviderMethod(String User,String Pass) // passing parametrs to read the combinations
	{
		System.out.println(User);
		System.out.println(Pass);
	}
	
	@DataProvider
	public Object [][] getdata()   // Creating two dimentional array here to store the multiple data combinations
			{
		
		Object [][] data = new Object[3][2]; // Here 3 rows considered as number of combinations and 2 is 
		// considered as number of values we are passing that is user and pass.
		
		data[0][0] = "FirstUser";
		data[0][1] = "FirstPass";
		
		data[1][0] = "SecondUser";
		data[1][1] = "SecondPass";
		
		data[2][0] = "ThirdUser";
		data[2][1] = "ThirdPass";
		
				return data; // returning data which we are passing 
		
			}
}
