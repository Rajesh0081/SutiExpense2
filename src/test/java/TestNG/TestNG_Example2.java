package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Example2 {
	
	@BeforeMethod 
	public void login() {
		System.out.println("This is a Login");
	}
	
	@Test 
	
	public void addemp() {
		System.out.println("This is add emp");
	}
	
	@Test
	public void deleteemp()
	{
		System.out.println("This is a delete emp....");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("This is logout");
	}

}
