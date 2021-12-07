package HMS.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import HMS.Base.testbase;

public class ExportPage extends testbase{
	
	@FindBy(xpath="//table/tbody/tr/td[text()='Export']")WebElement export; 
	@FindBy(xpath="//div[@id='id_page_3']/table/tbody")WebElement checkexportpage; 
	@FindBy(css="select[name='EXPORT_SPEC']")WebElement drpdwn; 
	
	public ExportPage()
	{
		PageFactory.initElements(driver, this);
	}

	public void ClickExport()//CLICK EPORT
	{
		export.click();
	}
	public boolean CheckExportPage()//CHECK THE EXPORT PAGE
	{
		return checkexportpage.isDisplayed();
	}
	public void SelectDropDown()//SELECT THE DROPDOWN
	{
		Select sl=new Select(drpdwn);
		sl.selectByVisibleText("Mac");
	}
	
}
