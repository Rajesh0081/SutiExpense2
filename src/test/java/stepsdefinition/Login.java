package stepsdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	public WebDriver driver;
	
	
	@Given("Open SutiExpense Application")
	public void launch() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		 driver=new EdgeDriver();
		
		driver.manage().window().maximize();   //To maximize the window
			
		//driver.get("https://apps17.sutisoft.com/");  //To open a specific URL
		
		driver.navigate().to("https://apps17.sutisoft.com/");
	}
	
	@When("Typing Username and password")
	public void credentials() throws Exception {
		Thread.sleep(3000);  //wait time
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
	}
	@Then("Login Page should display")
	public void Verify_Title() {
		String title=driver.getTitle();
		System.out.println(title);
	}

}
