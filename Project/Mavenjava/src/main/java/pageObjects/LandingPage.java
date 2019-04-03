package pageObjects;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.utils.FileUtil;

public class LandingPage {
	
	public WebDriver driver;
	
	By users=By.cssSelector("a[href*='users']");
	By orders=By.cssSelector("a[href*='orders']");
	
	
	By title=By.xpath("//h3[contains(text(),'Filters')]");
	By usertitle=By.xpath("//label[contains(text(),'Username')]");
	By userdrop=By.xpath("//div[@id='q_username_input']//select");
	By userinput=By.id("q_username");
	By emailtitle=By.xpath("//label[contains(text(),'Email')]");
	By emaildrop=By.xpath("//div[@id='q_email_input']//select");
	By emailinput=By.id("q_email");
	By createtitle=By.xpath("//label[contains(text(),'Created at')]");
    By currentday=By.cssSelector(".ui-state-default.ui-state-highlight");
    By enter=By.xpath("//input[@value='Filter']");
	By clear=By.xpath("//a[@class='clear_filters_btn']");
	
	

	

	
	public LandingPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
		
	}
	
	
	public WebElement getuser()
	{
		return driver.findElement(users);
	}
	public WebElement getorders()
	{
		return driver.findElement(orders);
		
		
	}
	

	
	
	public WebElement filtertitle()
	{
		return driver.findElement(title);
	}
	public WebElement usert()
	{
		return driver.findElement(usertitle);
	}
	public WebElement userd()
	{
		return driver.findElement(userdrop);
	}
	public WebElement userIP()
	{
		return driver.findElement(userinput);
	}
	public WebElement emailt()
	{
		return driver.findElement(emailtitle);
	}
	public WebElement emaild()
	{
		return driver.findElement(emaildrop);
	}
	public WebElement emailIP()
	{
		return driver.findElement(emailinput);
	}
    public WebElement createt()
    {
    	return driver.findElement(createtitle);
    }
   
    public WebElement clearf()
    {
    	return driver.findElement(clear);
    }
    public WebElement filter()
    {
    	return driver.findElement(enter);
    }

    
   /*public void getScreenshot()
    {
    	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils
    	
    	
    }*/
    
    
}

