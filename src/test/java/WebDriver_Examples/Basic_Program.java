package WebDriver_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Basic_Program {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();   //To maximize the window
			
		//driver.get("https://apps17.sutisoft.com/");  //To open a specific URL
		
		driver.navigate().to("https://apps17.sutisoft.com/");
			
		Thread.sleep(3000);  //wait time
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		
		Thread.sleep(13000); 
		
		driver.navigate().refresh();
		
		driver.close();
		
		//driver.quit();
				
	}

}


