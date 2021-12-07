package HMS.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HMS.Base.testbase;

public class CRMDashboardPage extends testbase{

	@FindBy(xpath="//frame[@name='mainpanel']")WebElement frame;
	@FindBy(css="td[valign='bottom']>a.topnavlink>i.fa.fa-gears.icon-2x")WebElement setup;
	@FindBy(css="table[align='center']>tbody>tr>td>table>tbody>tr:nth-child(1)")WebElement checkAdministration;
	@FindBy(xpath="//a[text()='Profile Settings']")WebElement profilesettings;
	@FindBy(xpath="//td[@style=\"border:1px solid black;\"]")WebElement checkprofilesettings;
	
	public CRMDashboardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public Page1 switchtoframe()//SWITCH TO FRAME
	{
		driver.switchTo().frame(frame);
		return new Page1();
	}
	public Page1  ClickSetUp()//CLICK THE SETUP
	{
		waitforvisibility(setup);
		setup.click();
		return new Page1();
		
	}
	public String CheckAdministtrationText()//CHECK THE GOBAL ACCOUNT ADMINISTRATION 
	{
		return checkAdministration.getText();
	}
	public Page1  ClickProfileSettings()//CLICK PRROFILE SETTING BUTTON
	{
		waitforvisibility(profilesettings);
		profilesettings.click();
		return new Page1();
		
	}
	public boolean CheckProfileSettingPage()//CHECK THE PROFILE SETTING PAGE 
	{
		return checkprofilesettings.isDisplayed();
	}
	
}
