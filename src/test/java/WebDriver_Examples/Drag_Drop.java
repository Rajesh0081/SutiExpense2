package WebDriver_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
		WebDriver driver =new EdgeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);   //To enter the frame
		
		Actions action=new Actions(driver);
		action.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		
		driver.switchTo().defaultContent();  //To Exist from frame

	}

}
