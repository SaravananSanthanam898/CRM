package TestScript;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import HMS.Base.testbase;
import HMS.Pages.LoginPage;

public class LoginTest extends testbase{
	
	LoginPage logobj;
	
	
	public LoginTest()
	{
		super();
	}
	@BeforeClass
	public void setup()
	{
		initialization();
		logobj=new LoginPage();
	}
	
	@Test
	public void LoginTestScript() 
	{
		String expectedwebtitle="CRMPRO - CRM software for customer relationship management, sales, and support.";
		Assert.assertEquals(logobj.WebsiteTitle(), expectedwebtitle);
		Assert.assertTrue(logobj.CheckPageName());
		String exepectedtext="Power up your sales, customer service, and marketing";
		Assert.assertEquals(logobj.CheckPageText(), exepectedtext);
		logobj.ClickSignUpButton();
		logobj.SwitchToChildWindow();
		Assert.assertFalse(logobj.CheckBox());
		logobj.scrollintoRequiredElement();
		Assert.assertFalse(logobj.SubmitButton());
		logobj.switchtomainTab();
		logobj.LoginProcess();
		
	}
	@AfterClass
	public void teardown()
	{
		//driver.quit();
	}

}
