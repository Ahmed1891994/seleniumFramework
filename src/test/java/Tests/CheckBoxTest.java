package Tests;

import Base.TestBase;
import Pages.CheckBoxPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest extends TestBase {
    CheckBoxPage checkboxpage;

    @Test
    public void SetCheckbox1()
    {
        checkboxpage = homepage.EnterCheckboxPage();
        Assert.assertFalse(checkboxpage.IsselectedCheckBox1());
        checkboxpage.SetCheckBox1();
        Assert.assertTrue(checkboxpage.IsselectedCheckBox1());
    }
    @Test
    public void ClearCheckbox1()
    {
        checkboxpage = homepage.EnterCheckboxPage();
        checkboxpage = new CheckBoxPage(driver);
        Assert.assertFalse(checkboxpage.IsselectedCheckBox1());
        checkboxpage.SetCheckBox1();
        Assert.assertTrue(checkboxpage.IsselectedCheckBox1());
        checkboxpage.ClearCheckBox1();
        Assert.assertFalse(checkboxpage.IsselectedCheckBox1());
    }
    @Test
    public void SetCheckbox2()
    {
        checkboxpage = homepage.EnterCheckboxPage();
        checkboxpage = new CheckBoxPage(driver);
        Assert.assertTrue(checkboxpage.IsselectedCheckBox2());
        checkboxpage.ClearCheckBox2();
        Assert.assertFalse(checkboxpage.IsselectedCheckBox2());
        checkboxpage.SetCheckBox2();
        Assert.assertTrue(checkboxpage.IsselectedCheckBox2());
    }
    @Test
    public void ClearCheckbox2()
    {
        checkboxpage = homepage.EnterCheckboxPage();
        checkboxpage = new CheckBoxPage(driver);
        Assert.assertTrue(checkboxpage.IsselectedCheckBox2());
        checkboxpage.ClearCheckBox2();
        Assert.assertFalse(checkboxpage.IsselectedCheckBox2());
    }


}
