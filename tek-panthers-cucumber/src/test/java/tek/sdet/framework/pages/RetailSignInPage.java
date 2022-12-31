package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {
	
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id = "email")
	public WebElement emailField;
	
	@FindBy(id="password")
	public WebElement passwordField;
	
	@FindBy(xpath ="//button[@type='submit']")
	public WebElement loginButton;

	@FindBy(id ="newAccountBtn")
	public WebElement newAccountButton;
	
	@FindBy(id="nameInput")
	public WebElement nameInput;
	
	@FindBy(id ="personalPhoneInput")
	public WebElement phoneInput;
	
	@FindBy (id ="personalUpdateBtn")
	public WebElement Updatebtn;
	
	@FindBy(id="emailInput")
	public WebElement emailInput;
	
	@FindBy(id="passwordInput")
	public WebElement passwordInput;
	
	@FindBy(id="confirmPasswordInput")
	public WebElement confirmPasswordInput;
	
	@FindBy(id="signupBtn")
	public WebElement signUpButton;
	
	@FindBy(id="profileImage")
	public WebElement profileImage;
	
	@FindBy(id ="accountLink")
	public WebElement accountBtn;
	
	@FindBy(id = "previousPasswordInput")
	public WebElement PriviosPasswordInput;
	
	@FindBy(id = "newPasswordInput")
	public WebElement newPasswordInput;
	
	@FindBy(id = "credentialsSubmitBtn")
	public WebElement credentialsSubmitBtn;
	
	@FindBy(className = "Toastify")
	public WebElement PasswordApdateSeccessfully;
	
	@FindBy(xpath = "//p[text() = 'Add a payment method']")
	public WebElement Addapaymentmethod;
	
	@FindBy(id = "cardNumberInput")
	public WebElement cardNumberInput;
	
	@FindBy(id = "nameOnCardInput")
	public WebElement nameOnCardInput;
	
	@FindBy(id = "expirationMonthInput")
	public WebElement expirationMonthInput;
	
	@FindBy(id = "expirationYearInput")
	public WebElement expirationYearInput;
	
	@FindBy(id = "securityCodeInput")
	public WebElement securityCodeInput;
	
	@FindBy(id = "paymentSubmitBtn")
	public WebElement paymentSubmitBtn;
	
	@FindBy(xpath = "//div[text()='Payment Method added sucessfully']")
    public WebElement PaymentMethodaddedsucessfully;
	
	@FindBy (xpath="//p[text() ='Master Card']")
	public WebElement ClickOnTheCard;
	
	@FindBy(xpath= "//div//button[text()='Edit']")
	public WebElement editButn;
	

	@FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
    public WebElement UpdatePaymentMethodaddedsucessfully;
	
	@FindBy(xpath = "//button[text()= 'remove']")
	public WebElement removecard;
	
	@FindBy(className ="account__address-new")
	public WebElement addAddressBtn;
	
	@FindBy(id = "countryDropdown")
	public WebElement countryDropdown;
	
	@FindBy(id = "fullNameInput")
	public WebElement fullNameInput;
	
	@FindBy(id = "phoneNumberInput")
	public WebElement phoneNumberInput;
	
	@FindBy(id = "streetInput")
	public WebElement streetInput;
	
	@FindBy(id = "apartmentInput")
	public WebElement apartmentInput;
	
	@FindBy(id = "cityInput")
	public WebElement cityInput;
	
	@FindBy(xpath = "//select[@name='state']//self::select")
	public WebElement stateInput;
	@FindBy(xpath = "//div[text()='Address Added Successfully']")
    public WebElement AddressAddedSuccessfully;
	
	@FindBy(id = "zipCodeInput")
	public WebElement zipCodeInput;
	
	@FindBy(id = "addressBtn")
	public WebElement addressBtn;
	
	
	
	
	@FindBy(id = "accountLink")
	public WebElement accountLink;
	
	@FindBy(className = "account__address-btn")
	public WebElement AccountAddressbtn;
	
	@FindBy(id = "countryDropdown")
	public WebElement countryDropdownbtn;
	
	@FindBy(id = "fullNameInput")
	public WebElement fullNameInputbtn;
	
	@FindBy(id = "phoneNumberInput")
	public WebElement phoneNumberInputbtn;
	
	@FindBy(id = "streetInput")
	public WebElement streetInputbtn;
	
	@FindBy(id = "apartmentInput")
	public WebElement apartmentInputbtn;
	
	@FindBy(id = "cityInput")
	public WebElement cityInputbtn;
	
	@FindBy(className = "account__address-new-dropdown")
	public WebElement AccountAddressNewDropDown;
	
	@FindBy(id = "zipCodeInput")
	public WebElement zipCodeInputbtn;
	
	@FindBy(id = "addressBtn")
	public WebElement addressBtnUpdate;
	
	
	
	@FindBy(id = "accountLink")
	public WebElement accountLink1;
	
	@FindBy(xpath="//div//button[text()='Remove']")
	public WebElement RemoveAccountButten;
	
	

	
	
	
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
