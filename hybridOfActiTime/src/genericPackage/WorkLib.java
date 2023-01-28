package genericPackage;

import org.openqa.selenium.WebElement;

public class WorkLib extends BaseTest {
	
	public void handleFrameIndex(int index)
	{
		driver.switchTo().frame(index);
	}
	
	public void handleFrameByFrameElement(WebElement frameElement)
	{
		
	}

}
