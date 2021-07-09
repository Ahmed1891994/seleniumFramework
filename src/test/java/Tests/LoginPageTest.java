package Tests;

import Base.TestBase;
import Pages.LoginPage;
import Pages.SecureAreaPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginpage;
    SecureAreaPage secureareapage;
    @Test
    public void SuccessfullLogin()
    {
        loginpage = homepage.EnterLoginPage();
    	loginpage.SetUsername("tomsmith");
    	loginpage.SetPassword("SuperSecretPassword!");
    	secureareapage = loginpage.ClickSubmitButton();
        String loginsuccess = secureareapage.GetSuccessLoginText();
        Assert.assertTrue(loginsuccess.contains("You logged into a secure area!"));
    }
    @Test
    public void FailedUserLogin()
    {
        loginpage = homepage.EnterLoginPage();
        loginpage.SetUsername("ttomsmith");
        loginpage.SetPassword("SuperSecretPassword!");
        secureareapage = loginpage.ClickSubmitButton();
        String loginuserfailed = secureareapage.GetSuccessLoginText();
        Assert.assertTrue(loginuserfailed.contains("Your username is invalid!"));
    }
    @Test
    public void FailedPasswordLogin()
    {
        loginpage = homepage.EnterLoginPage();
        loginpage.SetUsername("tomsmith");
        loginpage.SetPassword("SuperSecretPassword");
        secureareapage = loginpage.ClickSubmitButton();
        String loginpassfailed = secureareapage.GetSuccessLoginText();
        Assert.assertTrue(loginpassfailed.contains("Your password is invalid!"));
    }
}
