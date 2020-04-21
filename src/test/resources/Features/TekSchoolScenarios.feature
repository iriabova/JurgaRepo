
Feature: TEK Scenarios

  Background: 
    Given User is on Tekschool page
    And User click on Test Environment link
    And User should see test environment page

  @SDET_003
  Scenario: SDET2019AUG_SDET_003_Execution
    When User clicks on My Account Menu on top of the page
    And User click on space login on myAccount menu
    And User enters username 'teststudent@gmail.com' and password 'Tek@Test.com' in returning menu
    And User clicks on login buttin
    Then User should be logged in
    
    
  @SDET_003_SO
  Scenario Outline: SDET2019AUG_SDET_003_Execution with multiple user and password
    When User clicks on My Account Menu on top of the page
    And User enters username '<username>' and password '<password>' in returning menu
    And User clicks on login buttin
    Then User should be logged in

    Examples: 
    |username|password|
    |teststudent@gmail.com|Tek@Test.com|
    |tekschool001@gmail.com|testtest|
    |testdata@gmail.com|testdata|
    
    @SDET_RegisterForm
    
    Scenario: SDET2019AUG_SDET_Register_Form_Test
    
     When User clicks on My Account Menu on top of the page
     And User clicks on Register on MyAccount Menu
     And User fills Register form with below information
     #|firstName|lastName|email|phone|password|
     |Shaiq|Darwish|jurgab@gmail.com|2021234455|Test123|
     And User clicks on 'no' radio button for subscribe
     And User clicks on continue button
     Then User should see 'Your Account Has Been Created!'
     
     @SDET_RF_SO
    Scenario Outline: SDET2019AUG_SDET_Register_Form_Test
    When User clicks on My Account Menu on top of the page
    And User clicks on Register on MyAccount Menu
    And User fills Register form with below information
   #firstname|lastName|email|phone|password|
    |Shaiq|Darwish|<email>|2021234455| Test123|
    And User clicks on '<radioButton>' radio button for subscribe
    And User clicks on continue button
    Then User should see 'Your Account Has Been Created!'
	Examples:
	|email|radioButton|
	|juagghj@gmail.com|yes|
	|hkjsff@gmail.com|no|
	
	 @SDET_RegisterForm_DBV
    
    Scenario: SDET2019AUG_SDET_Register_Form_Test
    
     When User clicks on My Account Menu on top of the page
     And User clicks on Register on MyAccount Menu
     And User fills Register form with below information
     #|firstName|lastName|email|phone|password|
     |Shaiq|Darwish|melissa.king@sakilacustomer.org|2021234455|Test123|
     And User clicks on 'no' radio button for subscribe
     And User clicks on continue button
     Then User should see 'Your Account Has Been Created!'
     When User connects to Database
     And User sends query 'select * from public.customer where email='melissa.king@sakilacustomer.org''
     Then user verify account is created with email'melissa.king@sakilacustomer.org'
     
     
   