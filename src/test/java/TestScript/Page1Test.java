package TestScript;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import HMS.Base.testbase;
import HMS.Pages.CRMDashboardPage;
import HMS.Pages.LoginPage;
import HMS.Pages.Page1;

public class Page1Test extends testbase{
	
	LoginPage logobj;
	CRMDashboardPage dashobj;
	Page1 pg1obj;
	
	
	public Page1Test()
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
	}
	@Test
	public void Page1TestScript()
	{
		pg1obj.ClickGenerateKey();
		pg1obj.SwitchtoAlert();
		pg1obj.EnterSiteTitle();
		Assert.assertFalse(pg1obj.CheckUserTab());
		pg1obj.ClickYes();
		Assert.assertTrue(pg1obj.LookupMode());
		pg1obj.ClickStandardLookup();
		pg1obj.DropDownCurrency();
		
	}
	@AfterClass
	public void teardown()
	{
		//driver.quit();
	}
	

}
