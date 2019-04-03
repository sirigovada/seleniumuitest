package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Userpage {
	
	public WebDriver driver;
	
	By filters=By.id("sidebar");
	By newusers=By.cssSelector("a[href*='new']");
	By title=By.id("page_title");
	
	public Userpage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
		
	}
	
	
	public WebElement getfilter()
	{
		return driver.findElement(filters);
	}
	public WebElement gettitle()
	{
		return driver.findElement(title);
	}
	public WebElement getnewuser()
	{
		return driver.findElement(newusers);
	}
	

}


































