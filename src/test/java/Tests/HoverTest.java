package Tests;
import Base.TestBase;

import Pages.ProfilePage;
import Pages.hoverPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;

public class HoverTest extends TestBase {

    hoverPage hoverpage;
    ProfilePage profilepage;
    @Test(dataProvider = "numberofimages")
    public void HoverImg(int index)
    {
        hoverpage = homepage.EnterHovers();
        try {
            hoverpage.HoverImgIndex(index);
            profilepage = hoverpage.ViewProfile(index);
            Assert.assertEquals(profilepage.GetProfileText(), "Not Found");
        }
        catch (org.openqa.selenium.NoSuchElementException e)
        {
            System.out.println("at index "+index+" error is :"+e);
            Assert.assertTrue(index>3||index<1);
        }
    }
    @DataProvider(name="numberofimages")
    public static Object[][] Numberofimages()
    {
        return new Object[][] {
                {0},{1},{2},{3},{4}
        };
    }



}
