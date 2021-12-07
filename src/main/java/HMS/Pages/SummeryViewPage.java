package HMS.Pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import HMS.Base.testbase;

public class SummeryViewPage extends testbase{
	
	@FindBy(xpath="//table/tbody/tr/td[text()='Summary Views']")WebElement summeryview;
	@FindBy(css="div[id='id_page_5']>table>tbody>tr:nth-child(1)")WebElement checksummeryview;
	@FindBy(css="select[name='available_views']")WebElement getlists;
	@FindBy(xpath="//option[text()='vClientContacts']")WebElement RBTclk1;
	@FindBy(xpath="//option[text()='vDeals']")WebElement RBTclk2;
	@FindBy(xpath="//option[text()='vNotes']")WebElement RBTclk3;
	@FindBy(xpath="//option[text()='vTasks']")WebElement RBTclk4;
	
	public SummeryViewPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickSummeryView()
	{
		summeryview.click();
	}

	public boolean CheckSVPage()
	{
		return checksummeryview.isDisplayed();
	}
	public void Lists()
	{
		Select sl=new Select(getlists);
		List<WebElement>lst=sl.getOptions();
		for(WebElement ele:lst) {
			System.out.println(ele.getText());
		}
//SELECT THE ELEMENT BY USING ROBOT CLASSS		
		Actions actn=new Actions(driver);
		actn.keyDown(Keys.CONTROL).click(RBTclk1).keyUp(Keys.CONTROL).build().perform();
		actn.keyDown(Keys.CONTROL).click(RBTclk2).keyUp(Keys.CONTROL).build().perform();
		actn.keyDown(Keys.CONTROL).click(RBTclk3).keyUp(Keys.CONTROL).build().perform();
		actn.keyDown(Keys.CONTROL).click(RBTclk4).keyUp(Keys.CONTROL).build().perform();
		System.out.println("-------ALL SELECTED OPTIONS ARE---------");
		
		List<WebElement>list=sl.getAllSelectedOptions();
		for(WebElement element:list) {
			
			System.err.println(element.getText());
		}
//DESELECT THE ELEMENT BY USING ROBOT CLASSS	
		actn.keyDown(Keys.CONTROL).click(RBTclk1).keyUp(Keys.CONTROL).build().perform();
		actn.keyDown(Keys.CONTROL).click(RBTclk2).keyUp(Keys.CONTROL).build().perform();
		actn.keyDown(Keys.CONTROL).click(RBTclk3).keyUp(Keys.CONTROL).build().perform();
		actn.keyDown(Keys.CONTROL).click(RBTclk4).keyUp(Keys.CONTROL).build().perform();
		System.err.println("---------ALL THE OPTIONS ARE DESELECTED---------------");
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
