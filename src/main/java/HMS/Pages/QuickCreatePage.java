package HMS.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import HMS.Base.testbase;

public class QuickCreatePage extends testbase{
	
	@FindBy(xpath="//table/tbody/tr/td[text()='Quick Create']")WebElement quickcreate;
	@FindBy(xpath="//div[@id='id_page_4']/table/tbody/tr[1]/td")WebElement checkquickcreatepage;
	@FindBy(xpath="//select[@name='available_fields']")WebElement lists;
	
	
	public QuickCreatePage()
	{
		PageFactory.initElements(driver, this);
	}

	public void ClickQuickCreate()//CLICK THE QUICK CREATE BUTTON
	{
		quickcreate.click();
	}
	public boolean CheckQuickCreatePage()//CHECK QC PAGE
	{
		return checkquickcreatepage.isDisplayed();
	}
	
	public void ListOfDropDown()//GET THE LISTS,AND SELECT THE ELEMENT
	{
		Select sl=new Select(lists);
		List<WebElement>lst=sl.getOptions();
		for(WebElement ele:lst)
		{
			System.out.println(ele.getText());
			
		}
		sl.selectByIndex(1);//SELECT PHONE
		sl.selectByValue("fax");//SELECT FAX
		sl.selectByVisibleText("Category");//SELECT CATEGORY
		sl.selectByVisibleText("Title");//SELECT TITLE
//WAIT USING THREAD.SLEEP  		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("------------ALL SELECTED OPTIONS ARE----------------");
		List<WebElement>lt=sl.getAllSelectedOptions();
		for(WebElement el:lt)
		{
			System.err.println(el.getText());
		}
		
		sl.deselectByIndex(1);//DESELECT PHONE
		sl.deselectByValue("fax");//DESELECT FAX
		sl.deselectByVisibleText("Category");//DESELECT CATEGORY
		sl.deselectByVisibleText("Title");//DESELECT TITLE
		System.err.println("----------ALL THE OPTIONS ARE DESELECTED------------");
		
		
	}
	
}
