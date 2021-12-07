package TestScript;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import HMS.Base.testbase;
import HMS.Pages.CRMDashboardPage;
import HMS.Pages.ContactsScreen;
import HMS.Pages.LoginPage;
import HMS.Pages.Page1;

public class ContactsScreenTest extends testbase{
	
	LoginPage logobj;
	CRMDashboardPage dashobj;
	Page1 pg1obj;
	ContactsScreen cobj;
	public ContactsScreenTest()
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
		cobj=new ContactsScreen();
	}
	@Test
	public void ContactsScreenTestScript()
	{
		cobj.ClickContacts();
		cobj.ClickExport();
		cobj.WindowHandle();
		cobj.ClickShowFullform();
		cobj.EnterDetails();
	}
	@AfterClass
	public void teardown()
	{
		//driver.quit();
	}
	
}
