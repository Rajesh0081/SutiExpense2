package WebDriver_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Page_Source {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://apps17.sutisoft.com/");
	String page=driver.getPageSource();
	System.out.println(page);
	
	

	}

}
