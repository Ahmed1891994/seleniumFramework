package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDownPage {
    private final WebDriver driver;

    //set locators in the page
    private By dropdownlist = By.id("DropDown");

    public DropDownPage(WebDriver driver) {
        this.driver = driver;
    }


}
