	package Tests;

import Base.TestBase;
import Pages.DropDownPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DropDownTests extends TestBase {
    DropDownPage dropdownpage;
    @Test(dataProvider = "numberofelementsDropDown")
    public void SelectElementbyindex(int itemnumber)
    {
        dropdownpage = homepage.EnterDropdown();

        try {
            dropdownpage.ChooseItem(itemnumber);
            Assert.assertEquals(dropdownpage.GetSelectedItem(), dropdownpage.GetComparableText(itemnumber));
        }
        catch (org.openqa.selenium.NoSuchElementException e)
        {
            System.out.println("at itemnumber "+itemnumber+" error is :"+e);
            Assert.assertTrue(itemnumber>2||itemnumber<1);
        }
    }

    @Test(dataProvider = "numberofelementsDropDown")
    public void SelectElementbytext(int itemnumber)
    {
        dropdownpage = homepage.EnterDropdown();

        try {
            dropdownpage.ChooseItem(dropdownpage.GetComparableText(itemnumber));
            Assert.assertEquals(dropdownpage.GetSelectedItem(), dropdownpage.GetComparableText(itemnumber));
        }
        catch (org.openqa.selenium.NoSuchElementException e)
        {
            System.out.println("at string "+dropdownpage.GetComparableText(itemnumber)+" error is :"+e);
        }
    }

    @Test(dataProvider = "numberofelementsDropDown")
    public void CheckDefautAfterrefresh_Index(int itemnumber)
    {
        dropdownpage = homepage.EnterDropdown();

        try {
            dropdownpage.ChooseItem(itemnumber);
            Assert.assertEquals(dropdownpage.GetSelectedItem(), dropdownpage.GetComparableText(itemnumber));
            driver.navigate().refresh();
            Assert.assertEquals(dropdownpage.GetSelectedItem(),"Please select an option");
        }
        catch (org.openqa.selenium.NoSuchElementException e)
        {
            System.out.println("at itemnumber "+itemnumber+" error is :"+e);
            Assert.assertTrue(itemnumber>2||itemnumber<1);
        }
    }

    @Test(dataProvider = "numberofelementsDropDown")
    public void CheckDefautAfterrefresh_Text(int itemnumber)
    {
        dropdownpage = homepage.EnterDropdown();

        try {
            dropdownpage.ChooseItem(dropdownpage.GetComparableText(itemnumber));
            Assert.assertEquals(dropdownpage.GetSelectedItem(), dropdownpage.GetComparableText(itemnumber));
            driver.navigate().refresh();
            Assert.assertEquals(dropdownpage.GetSelectedItem(),"Please select an option");
        }
        catch (org.openqa.selenium.NoSuchElementException e)
        {
            System.out.println("at string "+dropdownpage.GetComparableText(itemnumber)+" error is :"+e);
        }
    }






    // array with number of elements in Dropdown
    @DataProvider(name="numberofelementsDropDown")
    public static Object[][] elementsDropDow()
    {
        return new Object[][] {
                {0},{1},{2},{3}
        };
    }
}


