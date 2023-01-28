package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	
	@FindBy(xpath = "//a[.='Logout']")private WebElement logoutLink;
	@FindBy(id = "SubmitTTButton") private WebElement saveLeaveButton;
	@FindBy(xpath = "//div[.='Users']")private WebElement users;
	@FindBy(name="usersSelector.selectedUser")private WebElement enterTimeTrackDropdown;
	
	
	//intialization
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	//utilization
	
	public WebElement getlogoutLink()
	{
		return logoutLink;
	}
	public WebElement getSaveLeaveButton()
	{
		return saveLeaveButton;
	}
	public WebElement getUsers()
	{
		return users;
	}
	public WebElement getEnterTimeTrackDropdown()
	{
		return enterTimeTrackDropdown;
	}
	
	public void logout()
	{
		logoutLink.click();
	}
	public void clickOnUsers()
	{
		users.click();
	}
	
	public void clickOnSaveLeaveTime()
	{
		saveLeaveButton.click();
	}
	
	public void selectUser(int index)
	{
		Select sel = new Select(enterTimeTrackDropdown);
		sel.selectByIndex(index);
	}

}
