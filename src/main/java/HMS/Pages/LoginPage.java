package HMS.Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HMS.Base.testbase;

public class LoginPage extends testbase{

	
	@FindBy(xpath="//a[@class='navbar-brand']")WebElement checkpagename;
	@FindBy(xpath="//h1[text()='Power up your sales, customer service, and marketing']")WebElement checkpagetext;
	@FindBy(css="ul.nav.navbar-nav.navbar-right>li:nth-child(2)")WebElement signupbutton;
	@FindBy(xpath="//form[@id='multipleForm'] /div[11]/div/label/input[@type='checkbox']")WebElement checkbox;
	@FindBy(xpath="//input[@name='username']")WebElement scroll;
	@FindBy(xpath="//button[@disabled='disabled']")WebElement submitbutton;
	@FindBy(xpath="//input[@name='username']")WebElement usernamefield;
	@FindBy(xpath="//input[@name='password']")WebElement passwordfield;
	@FindBy(xpath="//input[@type='submit']")WebElement loginbutton;
	
	public LoginPage()//PAGEGACTORY CREATION
	{
		PageFactory.initElements(driver, this);
	}
	
	public String WebsiteTitle()
	{
		return driver.getTitle();
	}
	
	public boolean CheckPageName()
	{
		return checkpagename.isDisplayed();
	}
	public String CheckPageText()
	{
		return checkpagetext.getText();
	}
	public void ClickSignUpButton()
	{
		signupbutton.click();
	}
	
	public void SwitchToChildWindow()
	{
		String parentwindow=driver.getWindowHandle();
		Set<String>st=driver.getWindowHandles();
		List<String>lst=new ArrayList<String>(st);
		driver.switchTo().window(lst.get(1));
	}
	public boolean CheckBox() //CHECK BOX IS SELECTED OR NOT
	{
		waitforvisibility(checkbox);
		return checkbox.isSelected();
	}
	public  void scrollintoRequiredElement()//SCROLL INTO REQUIRED ELEMENT
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",scroll);
	}
	public boolean SubmitButton()//SUBMIT BUTTON IS ENABLED OR DISABLED
	{
		return submitbutton.isEnabled();
	}
	public void switchtomainTab()//SWITCH TO THE MAIN TAB
	{
		String parentwindow=driver.getWindowHandle();
		Set<String>st=driver.getWindowHandles();
		List<String>lst=new ArrayList<String>(st);
		driver.switchTo().window(lst.get(0));
	}
	public CRMDashboardPage LoginProcess()//ENTER THE USERNAME, PASSWORD AND CLICK LOGIN BUTTON
	{
        usernamefield.sendKeys(prop.getProperty("USERNAME"));
		passwordfield.sendKeys(prop.getProperty("PASSWORD"));
		loginbutton.click();
		return new CRMDashboardPage();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
