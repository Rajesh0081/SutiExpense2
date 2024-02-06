package WebDriver_Examples;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class Screenshot_Example {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demoqa.com/select-menu");
		
		
		TakesScreenshot tss=(TakesScreenshot)driver;
		File src=tss.getScreenshotAs(OutputType.FILE);
		
			File dest= new File("C:\\Users\\dell\\Desktop\\7-27PM Screenshot.png");
			
			Files.copy(src, dest);
	}

}
