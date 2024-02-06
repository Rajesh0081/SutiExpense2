package WebDriver_Examples;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Window_Handles {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();   //To maximize the window
			
	
		driver.navigate().to("https://apps17.sutisoft.com/");
			
		Thread.sleep(3000);  //wait time
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		
		Thread.sleep(13000); 
		driver.findElement(By.xpath("//ul[@id='_helpid']/li[7]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@id='_helpid']/li[7]/ul/li[1]")).click();
		Thread.sleep(2000);
	Set<String>windows	=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parent =it.next();
		String child =it.next();
		String grandchild=it.next();
		
		driver.switchTo().window(child);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/p[1]/a")).click();
		Thread.sleep(5000);
		driver.switchTo().window(grandchild);

	}

}
