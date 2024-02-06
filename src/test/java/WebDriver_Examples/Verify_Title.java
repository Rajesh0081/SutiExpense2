package WebDriver_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Verify_Title {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://apps17.sutisoft.com/");
		String title=driver.getTitle();   //Verify Title
		System.out.println(title);
		
		
		
		// Validate Title
		if (driver.getTitle().equals("Login | SutiExpense")) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

	}

}
