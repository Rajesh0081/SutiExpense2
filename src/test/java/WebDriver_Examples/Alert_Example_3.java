package WebDriver_Examples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert_Example_3 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//ul[@class='nav nav-tabs nav-stacked']/li[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	Alert alt=	driver.switchTo().alert();
	alt.sendKeys("Rajesh");
	alt.accept();
		

	}

}
