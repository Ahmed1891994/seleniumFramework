package Tests;

import Base.TestBase;
import Pages.LoginPage;
import Pages.SecureAreaPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginpage;
    SecureAreaPage secureareapage;
    
    String username;
    String password;
    @Test(enabled = true)
    public void SuccessfullLogin()
    {
    	username = "tomsmith";
    	password = "SuperSecretPassword!";
    	
    	logger.debug("***************** start of testcase :"+Thread.currentThread().getStackTrace()[1].getMethodName()+"*******************");
    	logger.info("Enter Loginpage");
        loginpage = homepage.EnterLoginPage();
        
        logger.info("set username :"+username);
    	loginpage.SetUsername(username);
    	
    	logger.info("set password :"+password);
    	loginpage.SetPassword(password);
    	
    	logger.info("press submit");
    	secureareapage = loginpage.ClickSubmitButton();
    	logger.info("button is pressed");
    	
        String loginsuccess = secureareapage.GetSuccessLoginText();
        logger.info("Check login is successful");
        
        Assert.assertTrue(loginsuccess.contains("You logged into a secure area!"));
    	logger.debug("***************** end of testcase :"+Thread.currentThread().getStackTrace()[1].getMethodName()+"*******************");

    }
    @Test(enabled = true)
    public void FailedUserLogin()
    {
    	username = "ttomsmith";
    	password = "SuperSecretPassword!";
    	
    	logger.debug("***************** start of testcase :"+Thread.currentThread().getStackTrace()[1].getMethodName()+"*******************");
    	logger.info("Enter Loginpage");
        loginpage = homepage.EnterLoginPage();
        
        logger.info("set username :"+username);
        loginpage.SetUsername(username);
        
    	logger.info("set password :"+password);
        loginpage.SetPassword(password);
        
        logger.info("press submit");
    	secureareapage = loginpage.ClickSubmitButton();
    	logger.info("button is pressed");
    	
    	String loginuserfailed = secureareapage.GetSuccessLoginText();
        Assert.assertTrue(loginuserfailed.contains("Your username is invalid!"));
        logger.info("Check login is failed");

    	logger.debug("***************** end of testcase :"+Thread.currentThread().getStackTrace()[1].getMethodName()+"*******************");

    }
    @Test
    public void FailedPasswordLogin()
    {
    	username = "tomsmith";
    	password = "SuperSecretPassword";
    	
    	logger.debug("***************** start of testcase :"+Thread.currentThread().getStackTrace()[1].getMethodName()+"*******************");
    	logger.info("Enter Loginpage");
        loginpage = homepage.EnterLoginPage();
        
        logger.info("set username :"+username);
        loginpage.SetUsername(username);
        
    	logger.info("set password :"+password);
        loginpage.SetPassword(password);
        
        logger.info("press submit");
    	secureareapage = loginpage.ClickSubmitButton();
    	logger.info("button is pressed");
    	
        String loginpassfailed = secureareapage.GetSuccessLoginText();
        Assert.assertTrue(loginpassfailed.contains("Your password is invalid!")); 
        logger.info("Check login is failed");

    	logger.debug("***************** end of testcase :"+Thread.currentThread().getStackTrace()[1].getMethodName()+"*******************");

    }
}
