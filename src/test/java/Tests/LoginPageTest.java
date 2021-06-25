package Tests;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SecureAreaPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    HomePage homepage ;
    LoginPage loginpage;
    SecureAreaPage secureareapage;
    @Test(priority = 1)
    public void SuccessfullLogin()
    {
        homepage = new HomePage(driver);
        loginpage = new LoginPage(driver);
        secureareapage = new SecureAreaPage(driver);
        homepage.EnterLoginPage();
        loginpage.SetUsername("tomsmith");
        loginpage.SetPassword("SuperSecretPassword!");
        loginpage.ClickSubmitButton();
        String loginsuccess = secureareapage.GetSuccessLoginText();
        Assert.assertTrue(loginsuccess.contains("You logged into a secure area!"));
    }
    @Test(priority = 2)
    public void FailedUserLogin()
    {
        homepage = new HomePage(driver);
        loginpage = new LoginPage(driver);
        secureareapage = new SecureAreaPage(driver);
        homepage.EnterLoginPage();
        loginpage.SetUsername("ttomsmith");
        loginpage.SetPassword("SuperSecretPassword!");
        loginpage.ClickSubmitButton();
        String loginuserfailed = secureareapage.GetSuccessLoginText();
        Assert.assertTrue(loginuserfailed.contains("Your username is invalid!"));
    }
    @Test(priority = 3)
    public void FailedPasswordLogin()
    {
        homepage = new HomePage(driver);
        loginpage = new LoginPage(driver);
        secureareapage = new SecureAreaPage(driver);
        homepage.EnterLoginPage();
        loginpage.SetUsername("tomsmith");
        loginpage.SetPassword("SuperSecretPassword");
        loginpage.ClickSubmitButton();
        String loginpassfailed = secureareapage.GetSuccessLoginText();
        Assert.assertTrue(loginpassfailed.contains("Your password is invalid!"));
    }
}
