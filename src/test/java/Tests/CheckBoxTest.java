package Tests;

import Base.TestBase;
import Pages.CheckBoxPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest extends TestBase {
    HomePage homepage ;
    CheckBoxPage checkboxpage;

    @Test(priority = 5)
    public void SetCheckbox1()
    {
        homepage = new HomePage(driver);
        homepage.EnterCheckboxPage();
        checkboxpage = new CheckBoxPage(driver);
        Assert.assertFalse(checkboxpage.IsselectedCheckBox1());
        checkboxpage.SetCheckBox1();
        Assert.assertTrue(checkboxpage.IsselectedCheckBox1());
    }
    @Test(priority = 6)
    public void ClearCheckbox1()
    {
        homepage = new HomePage(driver);
        homepage.EnterCheckboxPage();
        checkboxpage = new CheckBoxPage(driver);
        Assert.assertFalse(checkboxpage.IsselectedCheckBox1());
        checkboxpage.SetCheckBox1();
        Assert.assertTrue(checkboxpage.IsselectedCheckBox1());
        checkboxpage.ClearCheckBox1();
        Assert.assertFalse(checkboxpage.IsselectedCheckBox1());
    }
    @Test(priority = 7)
    public void SetCheckbox2()
    {
        homepage = new HomePage(driver);
        homepage.EnterCheckboxPage();
        checkboxpage = new CheckBoxPage(driver);
        Assert.assertTrue(checkboxpage.IsselectedCheckBox2());
        checkboxpage.ClearCheckBox2();
        Assert.assertFalse(checkboxpage.IsselectedCheckBox2());
        checkboxpage.SetCheckBox2();
        Assert.assertTrue(checkboxpage.IsselectedCheckBox2());
    }
    @Test(priority = 8)
    public void ClearCheckbox2()
    {
        homepage = new HomePage(driver);
        homepage.EnterCheckboxPage();
        checkboxpage = new CheckBoxPage(driver);
        Assert.assertTrue(checkboxpage.IsselectedCheckBox2());
        checkboxpage.ClearCheckBox2();
        Assert.assertFalse(checkboxpage.IsselectedCheckBox2());
    }


}
