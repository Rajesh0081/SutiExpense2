package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	
	@BeforeClass
	public void launch() {
		driver=new EdgeDriver();
		driver.manage().window().maximize();   //To maximize the window
		
	//driver.get("https://apps17.sutisoft.com/");  //To open a specific URL
	
	driver.navigate().to("https://apps17.sutisoft.com/");
		
	}
	
	@Test
	public void login() throws Exception {
		Thread.sleep(4000);
		LoginPage lp=new LoginPage(driver);
		lp.setUsername("rajeshv@sutisoft.in");
		lp.setpassword("test@1234");
		lp.clickSubmit();
		
	}
	
	@AfterClass
	public void logout() {
		driver.close();
	}
}
