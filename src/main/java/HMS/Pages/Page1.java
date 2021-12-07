package HMS.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import HMS.Base.testbase;


public class Page1 extends testbase{
	
	@FindBy(xpath="//a[text()='Generate a new access key']")WebElement WebService;
	@FindBy(xpath="//input[@name='APP_TITLE']")WebElement textbox;
	@FindBy(xpath="//input[@name='user_tabs' and @value='Y']")WebElement yes;
	@FindBy(xpath="//input[@name='lookup_mode' and @value='STANDARD']")WebElement LookUp;
	@FindBy(xpath="//select[@name='currency_preset']")WebElement dropdownCurrency;
	@FindBy(xpath="//select[@name='country']")WebElement dropdowncountry;
	
	public Page1()
	{
		PageFactory.initElements(driver, this);
	}

	public void ClickGenerateKey()//CLICK GENERATE KEY
	{
		WebService.click();
	}
	public void SwitchtoAlert()//SWITCH TO THE ALERT
	{
		Alert alt=driver.switchTo().alert();
		System.out.println("THE ALERT TEXT IS: "+alt.getText());
		alt.dismiss();
	}
	public void EnterSiteTitle()//ENTER THE SITE TITLE NAME
	{
		textbox.clear();
		textbox.sendKeys("FREECRM");
	}
	public boolean CheckUserTab()//CHECK THE YES BUTTON IS SELECTED OR NOT
	{
		return yes.isSelected();
	}
	public void ClickYes()//CLICK THE YES BUTTON
	{
		yes.click();
	}
	public boolean  LookupMode()//CHECK THE LOOK UP MODE IS SELECTED OR NOT
	{
		return LookUp.isSelected();
	}
	public void ClickStandardLookup()//CLICK THE LOOKUP
	{
		LookUp.click();
	}
	public void DropDownCurrency()//SELECT TEH CURRNCY AND COUNTRY
	{
		Select sl=new Select(dropdownCurrency);
		sl.selectByVisibleText("€ EUR");
		Select sl1=new Select(dropdowncountry);
		sl1.selectByVisibleText("Åland");
	}
	
	
}
