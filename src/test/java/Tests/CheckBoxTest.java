package Tests;

import Base.TestBase;
import Pages.CheckBoxPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest extends TestBase {
	CheckBoxPage checkboxpage;

	@Test
	public void CheckCheckbox1position()
	{
		logger.debug("***************** start of testcase:"+Thread.currentThread().getStackTrace()[1].getMethodName()+"*******************");
		
    	logger.info("Enter Checkbox page");
		checkboxpage = homepage.EnterCheckboxPage();
		
		Assert.assertTrue(checkboxpage.Ischeckbox1_Displayed());
		logger.info("Check Checkbox1 position");
		
		logger.debug("***************** end of testcase :"+Thread.currentThread().getStackTrace()[1].getMethodName()+"*******************");
	}
	@Test
	public void CheckCheckbox2position()
	{
		logger.debug("***************** start of testcase:"+Thread.currentThread().getStackTrace()[1].getMethodName()+"*******************");

    	logger.info("Enter Checkbox page");
		checkboxpage = homepage.EnterCheckboxPage();
		
		Assert.assertTrue(checkboxpage.Ischeckbox2_Displayed());
		logger.info("Check Checkbox2 position");
		
		logger.debug("***************** end of testcase :"+Thread.currentThread().getStackTrace()[1].getMethodName()+"*******************");

	}
	@Test
	public void CheckDefaultCheckbox1()
	{
		logger.debug("***************** start of testcase:"+Thread.currentThread().getStackTrace()[1].getMethodName()+"*******************");

    	logger.info("Enter Checkbox page");
		checkboxpage = homepage.EnterCheckboxPage();
		
		Assert.assertFalse(checkboxpage.IsselectedCheckBox1());
		logger.info("Check Checkbox1 Default");
		
		logger.debug("***************** end of testcase :"+Thread.currentThread().getStackTrace()[1].getMethodName()+"*******************");

	}

	@Test
	public void SetCheckbox1()
	{
		logger.debug("***************** start of testcase:"+Thread.currentThread().getStackTrace()[1].getMethodName()+"*******************");

		logger.info("Enter Checkbox page");
		checkboxpage = homepage.EnterCheckboxPage();
		
		Assert.assertFalse(checkboxpage.IsselectedCheckBox1());
		logger.info("Check Checkbox1 Default");

		logger.info("Set Checkbox1");
		checkboxpage.SetCheckBox1();
		Assert.assertTrue(checkboxpage.IsselectedCheckBox1());
		logger.info("Check Checkbox1 is Set");

		logger.debug("***************** end of testcase :"+Thread.currentThread().getStackTrace()[1].getMethodName()+"*******************");

	}
	@Test
	public void ClearCheckbox1()
	{
		logger.debug("***************** start of testcase:"+Thread.currentThread().getStackTrace()[1].getMethodName()+"*******************");

		logger.info("Enter Checkbox page");
		checkboxpage = homepage.EnterCheckboxPage();

		logger.info("Check Checkbox1 Default");
		Assert.assertFalse(checkboxpage.IsselectedCheckBox1());
		
		logger.info("Set Checkbox1");
		checkboxpage.SetCheckBox1();
		Assert.assertTrue(checkboxpage.IsselectedCheckBox1());
		logger.info("Check Checkbox1 is Set");

		logger.info("clear Checkbox1");
		checkboxpage.ClearCheckBox1();
		Assert.assertFalse(checkboxpage.IsselectedCheckBox1());
		logger.info("Check Checkbox1 is cleared");

		logger.debug("***************** end of testcase :"+Thread.currentThread().getStackTrace()[1].getMethodName()+"*******************");

	}

	@Test
	public void CheckDefaultCheckbox2()
	{
		logger.debug("***************** start of testcase:"+Thread.currentThread().getStackTrace()[1].getMethodName()+"*******************");

    	logger.info("Enter Checkbox page");
		checkboxpage = homepage.EnterCheckboxPage();
		
		Assert.assertTrue(checkboxpage.IsselectedCheckBox2());
		logger.info("Check Checkbox2 Default");

		logger.debug("***************** end of testcase :"+Thread.currentThread().getStackTrace()[1].getMethodName()+"*******************");

	}
	@Test
	public void SetCheckbox2()
	{
		logger.debug("***************** start of testcase:"+Thread.currentThread().getStackTrace()[1].getMethodName()+"*******************");

		logger.info("Enter Checkbox page");
		checkboxpage = homepage.EnterCheckboxPage();
		
		logger.info("Check Checkbox2 Default");
		Assert.assertTrue(checkboxpage.IsselectedCheckBox2());
		
		logger.info("clear Checkbox2");
		checkboxpage.ClearCheckBox2();
		Assert.assertFalse(checkboxpage.IsselectedCheckBox2());
		logger.info("Check Checkbox2 is cleared");

		logger.info("Set Checkbox2");
		checkboxpage.SetCheckBox2();
		Assert.assertTrue(checkboxpage.IsselectedCheckBox2());
		logger.info("Check Checkbox2 is Set");

		logger.debug("***************** end of testcase :"+Thread.currentThread().getStackTrace()[1].getMethodName()+"*******************");

	}
	@Test
	public void ClearCheckbox2()
	{
		logger.debug("***************** start of testcase:"+Thread.currentThread().getStackTrace()[1].getMethodName()+"*******************");

		logger.info("Enter Checkbox page");
		checkboxpage = homepage.EnterCheckboxPage();
		
		logger.info("Check Checkbox2 Default");
		Assert.assertTrue(checkboxpage.IsselectedCheckBox2());
		
		logger.info("clear Checkbox2");
		checkboxpage.ClearCheckBox2();
		Assert.assertFalse(checkboxpage.IsselectedCheckBox2());
		logger.info("Check Checkbox2 is cleared");

		logger.debug("***************** end of testcase :"+Thread.currentThread().getStackTrace()[1].getMethodName()+"*******************");

	}


}
