package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage
{

	@FindBy(xpath = "div[@class and(.='Users')]")private WebElement usersTab;
	@FindBy(xpath = "//input[@type='button'and(@value='Create New User')]")private WebElement createNewUserButton;
    @FindBy(name = "username")private WebElement usnTextBox;
    @FindBy(name="passwordText")private WebElement passTextBox;
    @FindBy(name = "firstName")private WebElement fnameTextBox;
    @FindBy(name = "lastName")private WebElement lnameTestBox;
    @FindBy(name = "passwordTextRetype")private WebElement rTypePassTextBox;
    @FindBy(xpath = "//input[@type='submit']")private WebElement createUserButton;
    @FindBy(xpath = "//input[@type='button'and(@value='Cancel')]")private WebElement cancelButton;

    public UsersPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }

    
    
	public WebElement getUsersTab() {
		return usersTab;
	}

	public WebElement getCreateNewUserButton() {
		return createNewUserButton;
	}

	public WebElement getUsnTextBox() {
		return usnTextBox;
	}

	public WebElement getPassTextBox() {
		return passTextBox;
	}

	public WebElement getFnameTextBox() {
		return fnameTextBox;
	}

	public WebElement getLnameTestBox() {
		return lnameTestBox;
	}

	public WebElement getrTypePassTextBox() {
		return rTypePassTextBox;
	}

	public WebElement getCreateUserButton() {
		return createUserButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}
 
	
	
	//OPerational method
	
	public void usersTab()
	{
		usersTab.click();
	}
	
	public void createNewUser()
	{
		createNewUserButton.click();
	}
	
	public void userName(String userName)
	{
		usnTextBox.sendKeys(userName);
	}
	
	public void passWord(String password)
	{
		passTextBox.sendKeys(password);
	}
	
    public void fname(String fname)
    {
	   fnameTextBox.sendKeys(fname);
    }
   
    public void lname(String lname)
    {
    	lnameTestBox.sendKeys(lname);
    }
	public void retypePassword(String rtPass)
	{
		rTypePassTextBox.sendKeys(rtPass);
	}
	
    public void createUser()
    {
    	createUserButton.click();
    }
    
    public void cancelButton()
    {
    	cancelButton.click();
    }
}
