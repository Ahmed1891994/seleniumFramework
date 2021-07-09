package Base;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestBase {
    public static WebDriver driver;
    public static HomePage homepage;
    @BeforeSuite
    public void SetUp()
    {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        homepage = new HomePage(driver);
    }
    @AfterMethod
    public void ReturnToHome()
    {
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterSuite
    public void Quit()
    {
        driver.quit();
    }
}
