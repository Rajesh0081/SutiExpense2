package WebDriver_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class File_Upload {

	public static void main(String[] args) throws Exception {
WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();   //To maximize the window
			
		driver.get("https://apps17.sutisoft.com/");  //To open a specific URL
		
		//driver.navigate().to("https://apps17.sutisoft.com/");
			
		Thread.sleep(3000);  //wait time
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		
		Thread.sleep(13000); 
		
		driver.findElement(By.xpath("//div[@class='profile-pic']/a/img")).click();
		System.out.println("Clicked on User Profile");
		driver.findElement(By.xpath("//ul[@id='userDropDownMenuId']/li[1]/a")).click();
		System.out.println("Clicked on My Account Link");
		driver.findElement(By.xpath("//input[@name='file']")).sendKeys("C:\\Users\\dell\\Desktop\\7-27PM Screenshot.png");
		System.out.println("File is Upload Successfully");

	}

}
