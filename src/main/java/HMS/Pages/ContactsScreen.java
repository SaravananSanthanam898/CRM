package HMS.Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import HMS.Base.testbase;

public class ContactsScreen extends testbase{

	@FindBy(css="ul[class='mlddm']>li:nth-child(4)")WebElement contacts;
	@FindBy(css="input[value='Export']")WebElement export;
	@FindBy(xpath="//frame[@name='mainpanel']")WebElement frame;
	@FindBy(css="input[value='Show Full Form']")WebElement showfullform;
	@FindBy(css="select[name='cs_title']")WebElement drpdwntitle;
	@FindBy(css="input[name='cs_first_name']")WebElement enterfirstname;
	@FindBy(css="img[id='f_trigger_c_cs_created_at_from']")WebElement calender;
	@FindBy(xpath="/html/body/div[7]/table/tbody/tr[4]/td[5]")WebElement pick24th;
	
	public ContactsScreen()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickContacts()//CLICK THE CONTACTS
	{
		contacts.click();
	}
	public void ClickExport()//CLICK EXPORTS
	{
		export.click();
	}
	public void WindowHandle()//WINDOW HANDLE
	{
		
		String wh=driver.getWindowHandle();
		Set<String>st=driver.getWindowHandles();
		List<String>lst=new ArrayList<String>(st);
		driver.switchTo().window(lst.get(1));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void ClickShowFullform()//CLICK SHOWFULLFORM
	{
	
		String parentwindow=driver.getWindowHandle();
		Set<String>win=driver.getWindowHandles();
		List<String>lst=new ArrayList<String>(win);
		driver.switchTo().window(lst.get(0));
		System.out.println(lst);
		driver.switchTo().frame(frame);
		waitforvisibility(showfullform);
		showfullform.click();
		
	}
	public void EnterDetails()//ENTER ALL THE DETAILS IN SHOW FULL FORM
	{
		Select sl=new Select(drpdwntitle);
		sl.selectByVisibleText("Mr.");
		enterfirstname.sendKeys("saravanan");
		calender.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('f_trigger_c_cs_created_at_from').value='24-Nov-2021'");
	}
	
}
