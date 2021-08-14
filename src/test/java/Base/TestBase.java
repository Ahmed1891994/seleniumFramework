package Base;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.apache.log4j.Logger;


public class TestBase {
    public static WebDriver driver;
    public static HomePage homepage;
    public static Logger logger;
    @BeforeSuite
    public void SetUp()
    {
    	logger = Logger.getLogger(TestBase.class);
    	logger.debug("Logger instance Created"); 
    	
        logger.error("Setting system property");
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        logger.debug("Setting system property Applied Successfully");
        
        logger.debug("Creating ChromeDriver session");
        driver = new ChromeDriver();
        logger.debug("Creating ChromeDriver Applied Successfully");
        
        logger.debug("Navigate to URL https://the-internet.herokuapp.com/");
        driver.get("https://the-internet.herokuapp.com/");
        
        logger.debug("Maximize window");
        driver.manage().window().maximize();
        
        logger.info("Create HomePage");
        homepage = new HomePage(driver);
    }
    @AfterMethod
    public void ReturnToHome()
    {
    	logger.info("return to HomePage https://the-internet.herokuapp.com/");
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterSuite
    public void Quit()
    {
    	logger.info("Driver session Ended");
        driver.quit();
    }
}
