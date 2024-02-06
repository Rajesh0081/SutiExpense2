package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNg_Example1 {
	public WebDriver driver;
	
	
		
	@Test
	public void login() throws Exception {
Thread.sleep(3000);  //wait time
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		driver.findElement(By.xpath("//button[@class='btn login-btn']")).click();
		Thread.sleep(13000); 
		}
	@Test
	public void test() {
		
	}
	
	@AfterClass
	public void logout() {
		driver.close();
	}
	
	@BeforeClass
	public void luanch() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		 driver=new EdgeDriver();
		driver.manage().window().maximize();   //To maximize the window
		driver.navigate().to("https://apps17.sutisoft.com/");
	}
	

}
