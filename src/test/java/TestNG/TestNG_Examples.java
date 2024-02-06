package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Examples {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is a BeforeSuite");
		}
	@BeforeTest
public void beforetest() {
		System.out.println("This is a BeforeTest");
		}
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is a before Class");
	}
	@Test
	public void test() {
		System.out.println("This is a test");
		}
	
	@Test
	public void test2() {
		System.out.println("This is a test 2");
	}
	@AfterClass
		public void afterclass() {
			System.out.println("This is a afterclass");
		}
	@AfterTest
	public void aftertest() {
		System.out.println("This is a aftertest");
		}
	@AfterSuite
	public void aftersuite() {
		System.out.println("This is a AfterSuite");
	}
	}
