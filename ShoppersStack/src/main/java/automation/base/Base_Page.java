package automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/***
 * 
 * @author user
 */
public abstract class Base_Page {
	
	public WebDriver driver;
	public Base_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;	
	
	}
	
	@FindBy(id = "loginBtn")
	private WebElement LoginButton;
	
	
	public WebElement getLoginButton() {
		return LoginButton;
	}
	

	

	@FindBy(id = "Email")
	private WebElement EmailTextBox;
	public WebElement getEmailTextBox() {
		return EmailTextBox;
	}
	

	@FindBy(id = "Password")
	private WebElement PasswordTextBox;
	public WebElement getPasswordTextBox() {
		return PasswordTextBox;
	}

	

	@FindBy(linkText = "Login")
	private WebElement LoginLink;
	public WebElement getLoginLink() {
		return LoginLink;
	}
	
	
	@FindBy(linkText = "electronics")
	private WebElement EctronicsModule;
	public WebElement getEctronicsModule() {
		return EctronicsModule;
	}

	

	@FindBy(linkText = "Cameras")
	private WebElement CameraModule;
	public WebElement getCameraModule() {
		return CameraModule;
	}



	@FindBy(linkText = "//div[text()='S']")
	private WebElement SettingModule;
	public WebElement getSettingModule() {
		return SettingModule;
	}
	
	@FindBy(linkText = "Help Center")
	private WebElement  Helpcenter;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getHeplcenter() {
		return Helpcenter;
	}
	
	
	



	
	
	
	
}
		
	

	
