package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class HomePage {
    //Webdriver Variable
    private final WebDriver driver;

    //Set Links in the page
    private By Form_Authenticationlink = By.linkText("Form Authentication");
    private By Checkboxeslink = By.linkText("Checkboxes");
    private By Hoverslink = By.linkText("Hovers");
    private By Inputslink = By.linkText("Inputs");
    private By Dropdownlink = By.linkText("Dropdown");

    //Constructor to instantiate the driver
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    //Click on Form_Auth link
    public LoginPage EnterLoginPage()
    {
        driver.findElement(Form_Authenticationlink).click();
        return new LoginPage(driver);
    }
    //Click on checkbox link
    public CheckBoxPage EnterCheckboxPage()
    {
        driver.findElement(Checkboxeslink).click();
        return new CheckBoxPage(driver);
    }
   //Click on Hover link
    public hoverPage EnterHovers()
    {
        driver.findElement(Hoverslink).click();
        return new hoverPage(driver);
    }
   //Click on Inputs link
    public InputsPage EnterInputs()
    {
        driver.findElement(Inputslink).click();
        return new InputsPage(driver);
    }

    //Click on Inputs link
    public DropDownPage EnterDropdown()
    {


        try{
            driver.findElement(Dropdownlink).click();
        }
        catch(org.openqa.selenium.WebDriverException e)
        {
            System.out.println("page down");
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return new DropDownPage(driver);
    }
}
