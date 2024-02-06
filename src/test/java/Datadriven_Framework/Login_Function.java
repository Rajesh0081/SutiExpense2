package Datadriven_Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Login_Function {
	public WebDriver driver;
	@BeforeClass
	public void launch() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		 driver=new EdgeDriver();
		driver.manage().window().maximize();   //To maximize the window
		driver.navigate().to("https://apps17.sutisoft.com/");	
	}
	
	@Test
	public void login() throws Exception {
		FileInputStream f1=new FileInputStream("C:\\Users\\dell\\Desktop\\Book1.xls");
		Workbook wb=Workbook.getWorkbook(f1);
		Sheet s=wb.getSheet(0);
		String username=s.getCell(0,1).getContents();
		String password=s.getCell(1,1).getContents();
		Thread.sleep(3000);  //wait time
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.id("userpassword")).sendKeys(password);
		driver.findElement(By.xpath("//button[@class='btn login-btn']")).click();
		Thread.sleep(13000); 
		}
		@AfterClass
	public void logout() {
		driver.close();
	}
	

}
