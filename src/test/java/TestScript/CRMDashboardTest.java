package TestScript;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import HMS.Base.testbase;
import HMS.Pages.CRMDashboardPage;
import HMS.Pages.LoginPage;

public class CRMDashboardTest extends testbase{
	
	LoginPage logobj;
	CRMDashboardPage dashobj;
	
	public CRMDashboardTest()
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initialization();
		logobj=new LoginPage();
		dashobj=logobj.LoginProcess();
		
	}

	@Test
	public void CRMDashboardTestScript()
	{
		dashobj.switchtoframe();
		dashobj.ClickSetUp();
		String expectedtext="Global Account Administration";
		Assert.assertEquals(dashobj.CheckAdministtrationText(), expectedtext);
		dashobj.ClickProfileSettings();
		Assert.assertTrue(dashobj.CheckProfileSettingPage());
	}
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
}
