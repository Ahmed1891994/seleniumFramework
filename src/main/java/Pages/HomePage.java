package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    //Webdriver Variable
    private final WebDriver driver;

    //Set Links in the page
    private By Form_Authenticationlink = By.linkText("Form Authentication");
    private By Checkboxeslink = By.linkText("Checkboxes");

    //Constructor to instantiate the driver
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    //Click on Form_Auth link
    public void EnterLoginPage()
    {
        driver.findElement(Form_Authenticationlink).click();
    }
    //Click on checkbox
    public void EnterCheckboxPage()
    {
        driver.findElement(Checkboxeslink).click();
    }
}
