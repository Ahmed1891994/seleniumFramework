package Tests;
import Base.TestBase;

import Pages.ProfilePage;
import Pages.hoverPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HoverTest extends TestBase {

    hoverPage hoverpage;
    ProfilePage profilepage;
    @Test(dataProvider = "numberofimages")
    public void HoverImg(int index)
    {
    	logger.debug("***************** start of testcase:"+Thread.currentThread().getStackTrace()[1].getMethodName()+"*******************");

    	logger.info("Enter hoverpage");
        hoverpage = homepage.EnterHovers();
        
        try {
        	logger.info("Hover on element" + index);
            hoverpage.HoverImgIndex(index);
            
            logger.info("Check profile");
            profilepage = hoverpage.ViewProfile(index);
            Assert.assertEquals(profilepage.GetProfileText(), "Not Found");
            logger.info("profile not found");
        }
        catch (org.openqa.selenium.NoSuchElementException e)
        {
            logger.error("at index "+index+" error is :"+e);
            Assert.assertTrue(index>3||index<1);
        }
    	logger.debug("***************** end of testcase :"+Thread.currentThread().getStackTrace()[1].getMethodName()+"*******************");
    }
    @DataProvider(name="numberofimages")
    public static Object[][] Numberofimages()
    {
        return new Object[][] {
                {0},{1},{2},{3},{4}
        };
    }

}
