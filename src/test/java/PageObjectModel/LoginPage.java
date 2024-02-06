package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	//Locators
	By txt_Username=By.xpath("//input[@name='username']");
	By txt_password=By.xpath("//input[@name='userpassword']");
	By txt_Submit=By.xpath("//button[@class='btn login-btn']");
	
	
	
	
	//Actions
	
	public void setUsername(String username) {
		driver.findElement(txt_Username).sendKeys(username);
	}
	public void setpassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
		
	}
	public void clickSubmit() {
		driver.findElement(txt_Submit).click();
		
	}

}
