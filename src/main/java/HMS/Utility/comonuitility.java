package HMS.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import HMS.Base.testbase;

public class comonuitility extends testbase{

	
	public static void actionclick(WebElement ele) {
		
		Actions actn=new Actions(driver);
		
		actn.click(ele).build().perform();
	}
}
