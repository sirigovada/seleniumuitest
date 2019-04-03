package browser;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utilities {
	
public WebDriver driver;

public WebDriver initializeDriver() throws IOException
	{
Properties prop=new Properties();
FileInputStream fis=new FileInputStream("/Users/siri/Mavenjava/src/main/java/browser/data.properties");

prop.load(fis);
String browserName=prop.getProperty("browser");

if(browserName.equals("chrome"))
{
	System.setProperty("webdriver.chrome.driver","//Users//siri//Downloads//chromedriver-4");
	driver=new ChromeDriver();
	
		
}
else if(browserName.equals("IE"))
{
	/* Code for invoking an IE Browser Instance
	 * System.setProperty();
	 * driver=new IEDriver();
	 */
}
else if(browserName.equals("Firefox"))
{
	/* Code for invoking a Firefox Browser Instance
	 * System.setProperty();
	 * driver=new FirefoxDriver();
	 * 
	 */
	}
	
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;

}
}
