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
import HMS.Pages.SummeryViewPage;

public class SummeryViewTest extends testbase{
	
	LoginPage logobj;
	CRMDashboardPage dashobj;
	Page1 pg1obj;
	ExportPage expobj;
	SummeryViewPage svobj;
	
	public SummeryViewTest() {
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
		svobj=new SummeryViewPage();
		
	}
	@Test
	public void SummeryViewTestScript()
	{
		svobj.ClickSummeryView();
		Assert.assertTrue(svobj.CheckSVPage());
		svobj.Lists();
	}
	@AfterClass
	public void teardown()
	{
		//driver.quit();
	}
	
	
	
	
}
