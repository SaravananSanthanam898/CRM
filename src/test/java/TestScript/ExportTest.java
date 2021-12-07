package TestScript;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import HMS.Base.testbase;
import HMS.Pages.CRMDashboardPage;
import HMS.Pages.ExportPage;
import HMS.Pages.LoginPage;
import HMS.Pages.Page1;

public class ExportTest extends testbase{
	
	LoginPage logobj;
	CRMDashboardPage dashobj;
	Page1 pg1obj;
	ExportPage expobj;
	
	
	public ExportTest()
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initialization();
		logobj=new LoginPage();
		dashobj=logobj.LoginProcess();
		pg1obj=dashobj.switchtoframe();
		pg1obj=dashobj.ClickSetUp();
		pg1obj=dashobj.ClickProfileSettings();
		expobj=new ExportPage();
		
	}
	@Test
	public void ExportTestScript()
	{
		expobj.ClickExport();
		Assert.assertTrue(expobj.CheckExportPage());
		expobj.SelectDropDown();
	}
    @AfterClass
    public void teardown()
    {
    	//driver.quit();
    }
	
}
