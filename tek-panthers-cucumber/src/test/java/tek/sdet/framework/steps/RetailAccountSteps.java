//package tek.sdet.framework.steps;
//
//import org.junit.Assert;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import tek.sdet.framework.pages.POMFactory;
//import tek.sdet.framework.utilities.CommonUtility;
//
//public class RetailAccountSteps extends commonUtility {
//	
//	POMFactory factory = new POMFactory();
	
// @When("User click on Account option")
// public void userClickOnAccountOption() {
//	click(factory.homePage().account);
//	logger.info("user click on account option");
//	
// }
// @When ("User update Name {string} and phon {string}")
// public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
//	 clearTextUsingSendKeys(factory.AccountPage().nameField);
//	 sentText(factory.AccountPage().nameField,nameValue);
//	 clearTextUsingSendKeys(factory.AccountPage().phoneInputField);
//	 sentText(factory.AccountPage().phoneInputField,phoneValue);
//	 logger.info("user update name and phone");
//	 
// }
// @When("User click on Update button")
// public void userClickOnUpdateButton() {
//	click(factory.AccountPage().updateButton);
//	logger.info("user click on Update Button");
//	
// }
// @Then("User click on Update button")
// public void userprofileInformationShouldBeUpdated() {
//	 waitTillpresence(factory.AccountPage().personalInformationUpdateMessage);
//	 Assert.assertTrue(isElementDisplayed(factory.AccountPage().personalInformationUpdateMessage));
//	 String artualMessage = factory.AccountPage().personalInformationUpdateMessage.getText();
//	 String expectedMessage = "personal Information Updated Successfuly";
//	 Assert.asssertEquals(expectedMessage,actualMessage);
//	 logger.info("user profile information is updated"); 
//	 
// }
// 
// @when("User enter below information")
// public void userEnterbelowInformation(Datatable dataTable) {
//	
//	 
//	list<Map<String, String>>passwordInformation = dataTable.asMaps(String.class,String.class);
//	sendTaxt(factory.AccountPage().previousPasswordInput,passwordInformation.get(0).get("previousPssword"));
//	sendTaxt(factory.AccountPage().newPasswordInput,passwordInformation.get(0).get("newPassword"));
//	sendTaxt(factory.AccountPage().confirmPasswordInput,passwordInformation.get(0).get("conformPassword"));
//	logger.info("user entered password information");
// }
// @when("User click on change Password button")
// public void userClickOnChangePasswordButton() {
//	 click(factory.AccountPage().changePasswordButton);
//	 logger.info("user click on change password button");
//	 
//	 
// }
// @then("a message should be displayed {string}")
// public void aMessageaShouldDisplayed(String expectedMessage) {
//	 Assert.assertEquals(expectedMessage, factory.AccountPage()).passwordUpdatedSuccessfullyMessag.getText());
//	 
// }
//}
