package myproject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import browser.Utilities;
import pageObjects.LandingPage;
import pageObjects.NewUser;
import pageObjects.Userpage;

public class Homepage extends Utilities{
   private static Logger logger =LogManager.getLogger(Homepage.class.getName());
	
	
    @Test

public void homepage() throws IOException, InterruptedException
{
    driver=initializeDriver();
    driver.get("http://ec2-54-84-52-184.compute-1.amazonaws.com:8080/admin/");
      LandingPage l=new LandingPage(driver);
      AssertJUnit.assertTrue(l.getorders().isDisplayed());
      l.getuser().click();
    System.out.println(driver.getCurrentUrl());
      logger.info("URL Validated");
      
      
      
AssertJUnit.assertTrue(l.filtertitle().isDisplayed());
		 //System.out.println("Filter title Validated");
 logger.info("Filter Title validated");
AssertJUnit.assertTrue(l.usert().isDisplayed());
      //System.out.println("Username title Validated");
 logger.info("Username Title Validated");
l.userd().click();
     System.out.println("Username Dropdown Validated");
     Thread.sleep(1000);
 logger.info("Username Dropdown Validated");
l.userIP().sendKeys("TEST");
     Thread.sleep(1000);
     System.out.println("Username emailinput Validated");
 logger.info("Username Email Input Validated");
AssertJUnit.assertTrue(l.emailt().isDisplayed());
     //System.out.println("Email Title Validated");
 logger.info("Email Title Validated");
l.emaild().click();
     System.out.println("Email dropdown Validated");
 logger.info("Email Dropdown Validated");
     Thread.sleep(1000);
l.emailIP().sendKeys("pwd");
     Thread.sleep(1000);
     System.out.println("Email Input validated");
  logger.info("Email entered");
AssertJUnit.assertTrue(l.createt().isDisplayed());
     //System.out.println("Create title Validated");
AssertJUnit.assertTrue(l.clearf().isDisplayed());
    //System.out.println("Clear Button Validated");
AssertJUnit.assertTrue(l.filter().isDisplayed());
    //System.out.println("Filter Button Validated");

      
      
    
}

    @Test
    
public void userpage() throws IOException, InterruptedException
{
  
   driver.get("http://ec2-54-84-52-184.compute-1.amazonaws.com:8080/admin/users");
        Userpage up=new Userpage(driver);
        AssertJUnit.assertTrue(up.gettitle().isDisplayed());
        AssertJUnit.assertTrue(up.getfilter().isDisplayed());
        Thread.sleep(1000);
        up.getnewuser().click();
        System.out.println(driver.getCurrentUrl());
        logger.info("New User Page opened");
        
        
}
  
   @Test
 public void newuser() throws InterruptedException
 {
    	
    	driver.get("http://ec2-54-84-52-184.compute-1.amazonaws.com:8080/admin/users/new");
    	   NewUser NU=new NewUser(driver);
    		 System.out.println(NU.pagetitle());
    		 Thread.sleep(1000);
    		 NU.getusername().sendKeys("usrname");
    		 NU.getpassword().sendKeys("usrpwd");
    		 NU.getEmail().sendKeys("abc.gmail.com");
    		 Thread.sleep(2000);
    		 AssertJUnit.assertTrue(NU.createbutton().isDisplayed());
    		 NU.cancelbutton().click();
    		 logger.info("User info input and Cancel button Validated");
    		
 }
    
  
    
    
    @AfterClass
    public void afterClass()
    {
    	driver.quit();
    }
    
   
    
    
    
    
}




