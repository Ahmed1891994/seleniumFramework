package Base;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestBase {
    protected WebDriver driver;
    public HomePage homepage;
    @BeforeSuite
    public void SetUp()
    {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
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
