package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxPage {
    private final WebDriver driver;

    //set locators in the page
    private By checkbox1 = By.cssSelector("#checkboxes>:nth-child(1)");
    private By checkbox2 = By.cssSelector("#checkboxes>:nth-child(3)");

    public CheckBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean Ischeckbox1_Displayed()
    {
        return driver.findElement(checkbox1).isDisplayed();
    }
    public boolean Ischeckbox2_Displayed()
    {
        return driver.findElement(checkbox2).isDisplayed();
    }
    public void SetCheckBox1()
    {
        if(!IsselectedCheckBox1())
            driver.findElement(checkbox1).click();
        else;
    }
    public void ClearCheckBox1()
    {
        if(IsselectedCheckBox1())
            driver.findElement(checkbox1).click();
        else;
    }
    public void SetCheckBox2()
    {
        if(!IsselectedCheckBox2())
            driver.findElement(checkbox2).click();
        else;
    }
    public void ClearCheckBox2()
    {
        if(IsselectedCheckBox2())
            driver.findElement(checkbox2).click();
        else;
    }

    public boolean IsselectedCheckBox1()
    {
        boolean flag = true;
        if(driver.findElement(checkbox1).getAttribute("Checked")!=null)
            flag = true;
        else
            flag = false;
        return flag;
    }

    public boolean IsselectedCheckBox2()
    {
        boolean flag = true;
        if(driver.findElement(checkbox2).getAttribute("Checked")!=null)
            flag = true;
        else
            flag = false;
        return flag;
    }

}
