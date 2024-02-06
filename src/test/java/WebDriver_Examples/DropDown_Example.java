package WebDriver_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Example {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demoqa.com/select-menu");
		
		Select lstbox=new Select(driver.findElement(By.id("oldSelectMenu")));
		//lstbox.selectByIndex(4);  //Index is starting from 0
		
		//lstbox.selectByVisibleText("White");
		
		lstbox.selectByValue("2");
		
		
		System.out.println("Drop Down is handled.......");

	}

}
