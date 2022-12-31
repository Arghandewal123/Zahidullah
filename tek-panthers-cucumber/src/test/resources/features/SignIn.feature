Feature: Sign In Feature

  #this is comment
  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Zabijab@tekschool.us' and password 'Kabul2346!'
    And User click on login button
    Then User should be logged in into Account

  Scenario: Verify user can sign in into Retail Application
    And User enter email 'Zabijab@tekschool.us' and password 'Kabul2346!'
    And User click on login button
    Then User should be logged in into Account

  @signUpTestA
  Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name     | email                   | password  | confirmPassword |
      | Zabi Jan | panthertek@tekschool.us | Tek@12345 | Tek@12345       |
    And User click on SignUp button
    Then User should be logged into account page

  @signUpTestB
  Scenario Outline: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name   | email   | password   | confirmPassword   |
      | <name> | <email> | <password> | <confirmPassword> |
    And User click on SignUp button
    Then User should be logged into account page

    Examples: 
      | name      | email                   | password  | confirmPassword |
      | panthersA | panthersA@tekschool.us  | Tek@12345 | Tek@12345       |
      | panthersB | panthersxB@tekschool.us | Tek@85236 | Tek@85236       |
      | panthersC | panthersxC@tekschool.us | Ket@8899  | Ket@8899        |
      | panthersD | panthersxD@tekschool.us | Tek@12345 | Tek@12345       |

  @Update
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Sohail' and Phone '5301234567'
    And User click on Update button
    Then user profile information should be updated

  @UpdatPassword
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Kabul2345!       | Kabul2346!  | Kabul2346!      |
    And User click on Change Password button
    Then a message should be displayed  ’Password Updated Successfully’

  @PaymentMethod
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1234567891234567 | Zahid      |              12 |           2024 |          123 |
    And User click on Add your card button
    Then a message should be displayed  ’payment method added saccessfully’

  @EditDebitCard
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 3235767291334569 | Shoil      |              12 |           2028 |          345 |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully’

  @RemoveDebitCArd
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on remove option of card section
    Then payment details should be removed

  @VerfiyAddress
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country       | fullName | phoneNumber | streetAddress | apt | city           | state      | zipCode |
      | United States | Sohil    |  9168821010 | 123 Home st   |  12 | Rancho Cordova | California |   95670 |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully’

  @EditAddress
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user fill new address form with below informations
      | country       | fullName   | phoneNumber | streetAddress | apt | city        | state    | zipCode |
      | United States | Zahidullah |  5711234567 | 321 Home st   |  10 | Springfield | Virginia |   22150 |
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully’

  @RemoveAddress
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
