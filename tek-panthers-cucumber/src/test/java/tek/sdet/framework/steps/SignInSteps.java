package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signIn);
		logger.info("user clicked on Sign In option");
	}

	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
		sendText(factory.signInPage().emailField, email);
		sendText(factory.signInPage().passwordField, password);
		logger.info("user entered email " + email + " and password " + password);
		// slowDown();

	}

	@And("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().loginButton);
		logger.info("user clicked on login button");
	}

	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().account));
		logger.info("user logged in into account");
		slowDown();

	}

	@And("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.signInPage().newAccountButton);
		logger.info("user clicked on Create New Account button");

	}

	@And("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable data) {
		List<Map<String, String>> signUpData = data.asMaps(String.class, String.class);
		sendText(factory.signInPage().nameInput, signUpData.get(0).get("name"));
		sendText(factory.signInPage().emailInput, signUpData.get(0).get("email"));
		sendText(factory.signInPage().passwordInput, signUpData.get(0).get("password"));
		sendText(factory.signInPage().confirmPasswordInput, signUpData.get(0).get("confirmPassword"));
		logger.info("user entered required information into sign up form");

		List<List<String>> signup = data.asLists(String.class);
		System.out.println(signup.get(1).get(0) + " This value is from list +++++++++++++++");

		slowDown();
	}

	@And("User click on SignUp button")
	public void userClickOnSignUpButton() {
		click(factory.signInPage().signUpButton);
		logger.info("user clicked on Sign up Button");

	}

	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().profileImage));
		Assert.assertTrue(isElementDisplayed(factory.homePage().account));
		logger.info("Account was created");
		slowDown();
	}

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.signInPage().accountBtn);
		logger.info("User click on account option");
	}

	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameSohailAndPhone(String Name, String Phone) {
		click(factory.signInPage().nameInput);
		slowDown();
		clearTextUsingSendKeys(factory.signInPage().nameInput);
		sendText(factory.signInPage().nameInput, Name);

		click(factory.signInPage().phoneInput);
		sendText(factory.signInPage().phoneInput, Phone);
		logger.info("User update phone and name");
		slowDown();
	}

	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.signInPage().Updatebtn);
		logger.info("User click on updat butten");

	}

	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		logger.info("User name and phone should be update");
	}

	@When("User enter below information")
	public void userEnterBelowInformation(DataTable changepassword) {
		List<Map<String, String>> password = changepassword.asMaps(String.class, String.class);
		sendText(factory.signInPage().PriviosPasswordInput, password.get(0).get("previousPassword"));
		sendText(factory.signInPage().newPasswordInput, password.get(0).get("newPassword"));
		sendText(factory.signInPage().confirmPasswordInput, password.get(0).get("confirmPassword"));
		logger.info("User change password");
	}

	@When("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
		click(factory.signInPage().credentialsSubmitBtn);
		logger.info("User click on Update Button");
		slowDown();

	}

	@Then("a message should be displayed  ’Password Updated Successfully’")
	public void aMessageShouldBeDisplayedPasswordUpdatedSuccessfully() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.signInPage().PasswordApdateSeccessfully));
		logger.info("User password upadted");

	}

	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.signInPage().Addapaymentmethod);
		logger.info("User click on add payment methode");

	}

	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable DebitCardInfo) {
		List<Map<String, String>> DebitCard = DebitCardInfo.asMaps(String.class, String.class);
		sendText(factory.signInPage().cardNumberInput, DebitCard.get(0).get("cardNumber"));
		sendText(factory.signInPage().nameOnCardInput, DebitCard.get(0).get("nameOnCard"));
		// selectByVisibleText(factory.signInPage().expirationMonthInput,
		// DebitCard.get(0).get("expirationMonth"));
		sendText(factory.signInPage().expirationMonthInput, DebitCard.get(0).get("expirationMonth"));
		sendText(factory.signInPage().expirationYearInput, DebitCard.get(0).get("expirationYear"));
		sendText(factory.signInPage().securityCodeInput, DebitCard.get(0).get("securityCode"));
		logger.info("User add card information");
		slowDown();

	}

	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.signInPage().paymentSubmitBtn);
		logger.info("User click on submit button");

	}

	@Then("a message should be displayed  ’payment method added saccessfully’")
	public void aMessageShouldBeDisplayedPaymentMethodAddedSaccessfully() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.signInPage().PaymentMethodaddedsucessfully));
		logger.info("User added the card Sucessfully");

	}

	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.signInPage().ClickOnTheCard);
		click(factory.signInPage().editButn);
		logger.info("User click on edit card button");

	}

	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable editCard) {
		List<Map<String, String>> EditCard = editCard.asMaps(String.class, String.class);

		clearTextUsingSendKeys(factory.signInPage().cardNumberInput);
		sendText(factory.signInPage().cardNumberInput, EditCard.get(0).get("cardNumber"));
		slowDown();
		clearTextUsingSendKeys(factory.signInPage().nameOnCardInput);
		sendText(factory.signInPage().nameOnCardInput, EditCard.get(0).get("nameOnCard"));
		slowDown();
		selectByVisibleText(factory.signInPage().expirationMonthInput, EditCard.get(0).get("expirationMonth"));
		slowDown();
		selectByVisibleText(factory.signInPage().expirationYearInput, EditCard.get(0).get("expirationYear"));
		slowDown();
		clearTextUsingSendKeys(factory.signInPage().securityCodeInput);
		sendText(factory.signInPage().securityCodeInput, EditCard.get(0).get("securityCode"));
		slowDown();
		logger.info("user entered required card information");

	}

	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.signInPage().paymentSubmitBtn);
		logger.info("User fill out the new infomation");
		slowDown();
	}

	@Then("a message should be displayed ‘Payment Method updated Successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().UpdatePaymentMethodaddedsucessfully));
		logger.info("User Update the card Sucessfully");
	}
	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.signInPage().ClickOnTheCard);
	slowDown();
	click(factory.signInPage().removecard);
	slowDown();
	}
	
	
	
	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		logger.info("The card should be removed");
	}
	
	
	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.signInPage().addAddressBtn);
		logger.info("User click on address Butten");
		
		
	}
	@When("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable AddNewAddress) {
		List<Map<String, String>> Address = AddNewAddress.asMaps(String.class, String.class);
		selectByVisibleText(factory.signInPage().countryDropdown,Address.get(0).get("country"));
		click(factory.signInPage().countryDropdown);
	slowDown();	
	
		
		sendText(factory.signInPage().fullNameInput, Address.get(0).get("fullName"));
		slowDown();
		sendText(factory.signInPage().phoneNumberInput, Address.get(0).get("phoneNumber"));
		slowDown();
		sendText(factory.signInPage().streetInput, Address.get(0).get("streetAddress"));
		slowDown();
		sendText(factory.signInPage().apartmentInput, Address.get(0).get("apt"));
		slowDown();
		sendText(factory.signInPage().cityInput, Address.get(0).get("city"));
		slowDown();
		selectByVisibleText(factory.signInPage().stateInput,Address.get(0).get("state"));
		click(factory.signInPage().stateInput);
		slowDown();
		sendText(factory.signInPage().zipCodeInput, Address.get(0).get("zipCode"));
		slowDown();
		logger.info("User fill out the information ");
		
		
		
	}
	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.signInPage().addressBtn);
		logger.info("User fill out the address information");
	}
	@Then("a message should be displayed ‘Address Added Successfully’")
	public void aMessageShouldBeDisplayedAddressAddedSuccessfully() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.signInPage().AddressAddedSuccessfully));
		logger.info("User add the address Successfully");
		
		
		
	}
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.signInPage().AccountAddressbtn);
		logger.info("User click on Account Butten");
		slowDown();
	}
	@And ("user fill new address form with below informations")
	public void userFillNewAddressFromWithBelowInformations(DataTable editAddress) {
		List<Map<String, String>> EditAddress = editAddress.asMaps(String.class, String.class);
		selectByVisibleText(factory.signInPage().countryDropdown,EditAddress.get(0).get("country"));
		click(factory.signInPage().countryDropdown);
		clearTextUsingSendKeys(factory.signInPage().fullNameInput);
		sendText(factory.signInPage().fullNameInput, EditAddress.get(0).get("fullName"));
		slowDown();
		clearTextUsingSendKeys(factory.signInPage().phoneNumberInput);
		sendText(factory.signInPage().phoneNumberInput, EditAddress.get(0).get("phoneNumber"));
		slowDown();
		clearTextUsingSendKeys(factory.signInPage().streetInput);
		sendText(factory.signInPage().streetInput, EditAddress.get(0).get("streetAddress"));
		slowDown();
		clearTextUsingSendKeys(factory.signInPage().apartmentInput);
		sendText(factory.signInPage().apartmentInput, EditAddress.get(0).get("apt"));
		slowDown();
		clearTextUsingSendKeys(factory.signInPage().cityInput);
		sendText(factory.signInPage().cityInput, EditAddress.get(0).get("city"));
		slowDown();
		selectByVisibleText(factory.signInPage().stateInput,EditAddress.get(0).get("state"));
		click(factory.signInPage().stateInput);
		slowDown();
		clearTextUsingSendKeys(factory.signInPage().zipCodeInput);
		sendText(factory.signInPage().zipCodeInput, EditAddress.get(0).get("zipCode"));
		slowDown();
		
	}
	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.signInPage().addressBtnUpdate);
		logger.info("USer click on update button");
		
		
		
	}
	@Then("a message should be displayed ‘Address Updated Successfully’")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
		logger.info("‘Address Updated Successfully’");
		
		
		
	}
	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.signInPage().RemoveAccountButten);
		logger.info("RemoveAccountButten");
	}
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		logger.info("‘Address Remove Successfully’");
	}
	
	
//	
//	@Then("below options are present in Shop by Department sidebar")
//	public void belowOptionsArePresentInShopByDepartmentSidebar(io.cucumber.datatable.DataTable dataTable) {
//		
//	}
	
	
	
	
	
}
