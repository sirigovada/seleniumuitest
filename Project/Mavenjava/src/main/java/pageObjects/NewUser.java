package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewUser {
	
	public WebDriver driver;
	
	By title=By.id("page_title");
	By username=By.id("user_username");
	By password=By.id("user_password");
	By email=By.id("user_email");
	By create=By.name("commit");
	By cancel=By.cssSelector("a[href*='user']");
	
	public NewUser(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
		
	}
	
	
	public WebElement pagetitle()
	{
		return driver.findElement(title);
	}
	public WebElement getusername()
	{
		return driver.findElement(username);
	}
	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	public WebElement createbutton()
	{
		return driver.findElement(create);
	}
	public WebElement cancelbutton()
	{
		return driver.findElement(cancel);
	}

}



