package WebDriver_Examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();   //To maximize the window
			
		//driver.get("https://apps17.sutisoft.com/");  //To open a specific URL
		
		driver.navigate().to("https://apps17.sutisoft.com/");
			
		Thread.sleep(3000);  //wait time
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		
		//driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(300));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Sign In']"))).click();
		

	}

}
