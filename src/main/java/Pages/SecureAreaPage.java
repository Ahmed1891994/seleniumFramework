package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecureAreaPage {
    private final WebDriver driver;

    //Set locators in page
    private By loginsuccesstext = By.id("flash");

    public SecureAreaPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public String GetSuccessLoginText()
    {
        return driver.findElement(loginsuccesstext).getText();
    }
}
