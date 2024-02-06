package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Example_4 {
	
	@BeforeClass
	public void m1() {
		System.out.println("This is a method 1");
	}
	
	@Test(priority=600)
	public void m2() {
		System.out.println("This is a method 2");
		
	}
	
	@Test(priority=100)
	public void m3() {
		System.out.println("This is a method 3");
	}
	
	@Test(priority=500)
	public void m4() {
		System.out.println("This is a method 4");
		
	}
	
	
	@AfterClass
	public void m5() {
		System.out.println("This is a method 5");
	}
	
	

}
