@Currency
Feature: Currency

Background: 
    Given User is on Tekschool page
    And User click on Test Environment link
    And User should see test environment page

 # @SDET_003
 # Scenario: SDET2019AUG_SDET_003_Execution
    When User clicks on My Account Menu on top of the page
    And User click on space login on myAccount menu
    And User enters username 'teststudent@gmail.com' and password 'Tek@Test.com' in returning menu
    And User clicks on login buttin
    Then User should be logged in
    
    @Curreny_009
    Scenario: Currency_009
    
    
When user clicks on Currency tab on the left top of the page
Then Verify 3 currencies  US Dollar, Euro and Pound are displayed 
Then user clicks on on different currency
Then Verify the chosen currency is displayed under Product’s description in the product item in the product list 
Then user click on a specific product and product details page appeared.  
Then Verify the chosen currency is displayed On the product details page.  
Then User clicks on Add to cart button
And Verify the chosen currency is displayed in the “Shopping cart"for each individual product. 
And User clicks on MyAccount button
And User clicks on LogOutButton
Then User clicks on Log out of the account button
And User click on space login on myAccount menu
And User enters username 'teststudent@gmail.com' and password 'Tek@Test.com' in returning menu
And User clicks on login buttin
And Verify the chosen currency is saved when the user logs back in the account
    