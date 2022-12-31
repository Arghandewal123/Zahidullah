package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
 
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id ="accountLink")
	public WebElement accountBtn;
	
	@FindBy(id ="nameInput")
	public WebElement nameField;
	
	@FindBy(id ="PesonalPhoneInput")
	public WebElement PhoneInputField;
	
	@FindBy(id ="emailInpute")
	public WebElement emailInputField;
	
	@FindBy(xpath ="//button[text()='Update']")
	public WebElement updateButton;
	
	@FindBy(xpath ="//[text]()='Personal Information Updated Successfully']")
	public WebElement personalInformationUpdateMessage;
	
	@FindBy(id ="previousPasswordInput")
	public WebElement previousPasswordInput;
	
	@FindBy(id ="newPasswordInput")
	public WebElement newPasswordInput;
	
	@FindBy(id ="confirmPasswordInput")
	public WebElement confirmPasswordInput;
	
	@FindBy(id ="credentialsSubmitBtn")
	public WebElement changePasswordButton;
	
	@FindBy(xpath ="//div[text()='password Updated Successfully']")
	public WebElement passwordUpdatedSuccessfullyMessage;
	
}

