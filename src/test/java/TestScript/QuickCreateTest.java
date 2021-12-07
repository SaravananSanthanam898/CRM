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
import HMS.Pages.QuickCreatePage;

public class QuickCreateTest extends testbase{
	
	
	LoginPage logobj;
	CRMDashboardPage dashobj;
	Page1 pg1obj;
	ExportPage expobj;
	QuickCreatePage qcobj;
	
	public QuickCreateTest()
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
		qcobj=new QuickCreatePage();
	}
	@Test
	public void QuickCreateTestScript()
	{
		qcobj.ClickQuickCreate();
		Assert.assertTrue(qcobj.CheckQuickCreatePage());
		qcobj.ListOfDropDown();
		
	}
	@AfterClass
	public void teardown()
	{
		//driver.quit();
	}
	

}
