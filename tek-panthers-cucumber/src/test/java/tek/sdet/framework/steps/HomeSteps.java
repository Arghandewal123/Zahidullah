
package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;


public class HomeSteps extends CommonUtility{
	// all your step definitions classes will extends 
	// CommonUtility class
	// we need to create object of POMFactory class
	// PomFactory instance should be on top of the class 
	POMFactory factory = new POMFactory();
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
	String expectedTitle = "React App";
	String actualTitle = getTitle();// wrote this one in CommonUtility
	Assert.assertEquals(expectedTitle, actualTitle);
	logger.info(actualTitle +" is equal to "+ expectedTitle);
	}
	@Then("below options are present in Shop by Department sidebar")
    public void belowoptionsarepresentinShopbyDepartmentsidebar(DataTable DataTable) {
        List<Map<String, String>> Visable = DataTable.asMaps(String.class, String.class);
        Assert.assertTrue(isElementDisplayed(factory.homePage().Electronics));
        Assert.assertTrue(isElementDisplayed(factory.homePage().Computers));
        Assert.assertTrue(isElementDisplayed(factory.homePage().smartHome));
        Assert.assertTrue(isElementDisplayed(factory.homePage().sports));
        Assert.assertTrue(isElementDisplayed(factory.homePage().automative));
        logger.info("user should see all the element");
	}
	@When("User change the category to {string}")

	 

    public void userChangeTheCategoryTo(String value) {

 

        selectByVisibleText(factory.homePage().allDepartments, value);

 

        logger.info(value + " was selected from the drop down");
        slowDown();
    }

 

    @And("User search for an item {string}")
    public void Usersearchforanitemkasaoutdoorsmartplug(String value) {
        sendText(factory.homePage().searchInputField, value);
        logger.info("User should write the item they need");
        slowDown();
    }

 

    @And("User click on Search icon")
    public void UserclickonSearchicon() {
        click(factory.homePage().searchButton);
        logger.info("user should see the item");
        slowDown();
    }

 

    @And("User click on item")
    public void Userclickonitem() {
        click(factory.homePage().itemkassaoutdoor);
        logger.info("User should click on the item");
        slowDown();
    }

 

    @And("User select quantity ‘2’")
    public void Userselectquantity() {
        click(factory.homePage().qtyTwo);
        logger.info("User should change quintidy to two");
        slowDown();
    }

 

    @And("User click add to Cart button")
    public void UserclickaddtoCartbutton() {
        click(factory.homePage().addToTheCard);
        logger.info("user Should see that the it add to the card");
        slowDown();
    }

 

    @Then("the cart icon quantity should change to ‘2’")
    public void thecartconquantityshouldchangeto() {
        Assert.assertTrue(isElementDisplayed(factory.homePage().cart));
        logger.info("User should it added");
        slowDown();
    }


		@When("User on Electronics")
		public void userOnElectronics() {
			
		}
		@When("User on Computers")
		public void userOnComputers() {
			
		}
		@When("User on Smart Home")
		public void userOnSmartHome() {
			
		}
		@When("User on Sports")
		public void userOnSports() {
			
		}
		@When("User on Automotive")
		public void userOnAutomotive() {
			
		}
	
	@Then("below options are present in Departments")
    public void belowOptionsArePresentInDepartments(DataTable dataTable) {
        List<List<String>> department = dataTable.asLists();
        switch (department.toString()) {
        case "Electronics":
            click(factory.homePage().Electronics);
            String video = getText(factory.homePage().videoGames);
            String TVAndVideo = getText(factory.homePage().TVAndVideo);
            Assert.assertEquals(TVAndVideo, department.get(0).get(0));
            Assert.assertEquals(video, department.get(0).get(1));
            logger.info(video + " options are present in department" + TVAndVideo);
            slowDown();
            break;
		case "Computers":
            click(factory.homePage().Computers);
            String Accessories = getText(factory.homePage().Accessiries);
            String Networking = getText(factory.homePage().Networking);
            Assert.assertEquals(Accessories, department.get(0).get(0));
            Assert.assertEquals(Networking, department.get(0).get(1));
            logger.info(Accessories + " options are present in department" + Networking);
            slowDown();
            break;
        case "Sports":
            click(factory.homePage().sports);
            String AthleticClothing = getText(factory.homePage().AtheticClothing);
            String ExerciseFitness = getText(factory.homePage().ExerciseFitness);
            Assert.assertEquals(AthleticClothing, department.get(0).get(0));
            Assert.assertEquals(ExerciseFitness, department.get(0).get(1));
            logger.info(AthleticClothing + " options are present in department" + ExerciseFitness);
            slowDown();
            break;
        case "Automotive":
            click(factory.homePage().automative);
            String AutomativePartsAccessories = getText(factory.homePage().AutomativePartsAccessoriecs);
            String MotorCyclePowersports = getText(factory.homePage().MotorCyclePowerSports);
            Assert.assertEquals(AutomativePartsAccessories, department.get(0).get(0));
            Assert.assertEquals(MotorCyclePowersports, department.get(0).get(1));
            logger.info(MotorCyclePowersports + " options are present in department" + AutomativePartsAccessories);
            slowDown();
            
            break;
        }
        }
        
        @Then("User click on Cart option")
        public void userClickOnCartOption() {
            waitTillPresence(factory.homePage().cart);
            click(factory.homePage().cart);
            logger.info("User should be able to click on cart option");
            slowDown();
        }

     

        @Then("User click on Proceed to Checkout button")
        public void userClickOnProceedToCheckoutButton() {
            waitTillPresence(factory.homePage().proccedBtn);
            click(factory.homePage().proccedBtn);
            logger.info("User click on Proceed to Checkout button");
            slowDown();
        }

     

        @Then("User click Add a new address link for shipping address")
        public void userClickAddANewAddressLinkForShippingAddress() {
            waitTillPresence(factory.homePage().addAddressBtn);
            slowDown();
            click(factory.homePage().addAddressBtn);
            logger.info("User should be able to click on add a new address button");
        }

     

        @Then("User fill new address form with below information")
        public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
            List<Map<String, String>> Addaddress = dataTable.asMaps(String.class, String.class);
            selectByVisibleText(factory.homePage().country, Addaddress.get(0).get("country"));
            click(factory.homePage().country);
            sendText(factory.signInPage().fullNameInput, Addaddress.get(0).get("fullName"));
            sendText(factory.signInPage().phoneNumberInput, Addaddress.get(0).get("phoneNumber"));
            sendText(factory.signInPage().streetInput, Addaddress.get(0).get("streetAddress"));
            sendText(factory.signInPage().apartmentInput, Addaddress.get(0).get("apt"));
            sendText(factory.homePage().cityInput, Addaddress.get(0).get("city"));
            selectByVisibleText(factory.homePage().state, Addaddress.get(0).get("state"));
            click(factory.homePage().state);
            sendText(factory.homePage().zipCodeInput, Addaddress.get(0).get("zipCode"));
            logger.info("User should see all the information they fill out");
            slowDown();
        }

     

//        @Then("User click Add Your Address button")
//        public void userClickAddYourAddressButton() {
//        click(factory.signInPage().addaddressbtn);
//        logger.info("User click on Add Your Address Buttn");
//        }

     

        @Then("User click Add a credit card or Debit Card for Payment method")
        public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
            slowDown();
            click(factory.homePage().addPaymentBtn);
            slowDown();
            logger.info("User should be able to click on Add Your payment Buttn");
            slowDown();
            click(factory.signInPage().paymentSubmitBtn);
        }

     

        @Then("User click on Place Your Order")
        public void userClickOnPlaceYourOrder() {
            click(factory.homePage().placeOrderBtn);
            logger.info("User click on Add Your Address Buttn");
            slowDown();
        }

     

        @Then("a message should be displayed ‘Order Placed, Thanks’")
        public void amessageshouldbedisplayed() {
            Assert.assertTrue(isElementDisplayed(factory.homePage().orderPlacedSuccessfull));
      logger.info("User should see the conformation");
        
      
      
        
    }
        
        @When("User select quantity ‘5’")
        public void userSelectQuantity() {
        	click(factory.homePage().qty5);
            logger.info("user should select 5");
            slowDown();
        	
        }
        @Then("the cart icon quantity should change to ‘5’")
        public void theCartIconQuantityShouldChangeTo() {
        	Assert.assertTrue(isElementDisplayed(factory.homePage().qtyFive));
            logger.info("User should see the card icon is 5");
            slowDown();
        }
        
        @When("User click on Orders section")
        public void userClickOnOrdersSection() {
        	 click(factory.homePage().orderLink);
        	 logger.info("User click on Add Your order Buttn");
             slowDown();
        	
        }
        @When("User click on first order in list")
        public void userClickOnFirstOrderInList() {
        	 //click(factory.homePage().cancelBtn);
        	 logger.info("User click on cancel your order");
        	 slowDown(); 
        }
        @When("User click on Cancel The Order button")
        public void userClickOnCancelTheOrderButton() {
        	click(factory.homePage().cancelBtn);
       	 logger.info("User click on cancel your order");
       	 slowDown(); 
        }
        @When("User select the cancelation Reason ‘Bought wrong item’")
        public void userSelectTheCancelationReasonBoughtWrongItem() {
        	click(factory.homePage().reasonforreturn);
        	logger.info("User click on resone cancel order");
        	
        }
        @When("User click on Cancel Order button")
        public void userClickOnCancelOrderButton() {
        	click(factory.homePage().orderSubmitBtn);
          	 logger.info("User click on cancel your order");
          	 slowDown();
        }
        @Then("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
        public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled() {
        	 Assert.assertTrue(isElementDisplayed(factory.homePage().YourOrderHasBeenCancelled));
        	logger.info("User click on cancel your order ");
        }
        
        @When("User click on Return Items button")
        public void userClickOnReturnItemsButton() {
        	click(factory.homePage().returnBtn);
        	logger.info("User click on return butten");
        	slowDown();
        }
        @When("User select the Return Reason ‘Item damaged’")
        public void userSelectTheReturnReasonItemDamaged() {
        	click(factory.homePage().itemDamage);
        	logger.info("User click on resone cancel order");
        	slowDown();
        }
        @When("User select the drop off service ‘FedEx’")
        public void userSelectTheDropOffServiceFedEx() {
        	click(factory.homePage().dropFedEx);
        	logger.info("User select the drop off service FedEx");
        	slowDown();
        	
        }
        @When("User click on Return Order button")
        public void userClickOnReturnOrderButton() {
        	click(factory.homePage().orderSubmitBtn);
        	logger.info("User click on return butten");
        	slowDown();
        }
        @Then("a cancelation message should be displayed ‘Return was successful’")
        public void aCancelationMessageShouldBeDisplayedReturnWasSuccessful() {
        	 //Assert.assertTrue(isElementDisplayed(factory.homePage().YourOrderHasBeenCancelled));
         	logger.info("Return was successfull ");
         	slowDown();
        }
        
        @When("User click on Review button")
        public void userClickOnReviewButton() {
        	click(factory.homePage().reviwBtn);
        	logger.info("User click on review butten");
        	slowDown();
        }
        @When("User write Review headline {string} and {string}")
        public void userWriteReviewHeadlineHeadlineValueAndReviewText(String headline, String review) {
        	sendText(factory.homePage().addaHeadline, headline);

        	sendText(factory.homePage().reiewDescription, review);

        	logger.info("User submit a review message");

        	slowDown();
        }
        @When("User click Add your Review button")
        public void userClickAddYourReviewButton() {
        	click(factory.homePage().reviewSubmitBtn);
        	logger.info("User click on review submit butten");
        	slowDown();
        }
        @Then("a review message should be displayed ‘Your review was added successfully’")
        public void aReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully() {
        	Assert.assertTrue(isElementDisplayed(factory.homePage().yourReviewMesg));

        	logger.info("Review message should be displayed ‘Return was successful’");
        }
        
	}
	




