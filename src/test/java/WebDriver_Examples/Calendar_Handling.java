package WebDriver_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Calendar_Handling {

	public static void main(String[] args) throws Exception {
		
		String month="October 2003";
		System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();   //To maximize the window
		driver.navigate().to("https://apps17.sutisoft.com/");
			Thread.sleep(3000);  //wait time
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		Thread.sleep(13000); 
		driver.findElement(By.xpath("//ul[@id='_helpid']/li[3]")).click();
		System.out.println("Clicked on My Transactions page........");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='fromDate']")).click(); // Clicking on from Date
		Thread.sleep(2000);
		
		while(true) {
			
		String text=driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr/th[@class='datepicker-switch']")).getText();
		System.out.println("Selecting the Month and Year from the Calendar.........");
		if (text.matches(month)) {
			break;
		}
		else {
			driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr/th[@class='prev']")).click(); 
			System.out.println("Clicking on Prev Button");
		}
		}
		driver.findElement(By.xpath("//div[@class='datepicker-days']/table/tbody/tr/td[contains(text(),'1')]")).click(); 
		System.out.println("Selecting the specific Date from the calendar ");
	}

}
