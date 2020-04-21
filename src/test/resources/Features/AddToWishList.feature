@AddToWishList
Feature: AddToWishList

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
    
    @AddToWishList_007
    Scenario: AddToWishList_007
    When User clicks on Phones & PDAs label
    And user clicks on HeartIcon
    Then user should see Success: You have added to you’re your Wish List!
    Then Verify item was added on “Wish Iist” on the top of the menu
    When User clicks on a product
    Then User clicks on HeartIcon again on the side of the page
    Then user should see Success: You have added to you’re your Wish List!
    When click on “Wish Iist” on the top of the menu
    Then wish list page is displayed
    And user clicks on RedXButton
    Then the item should be removed and user should see Success: You have modified your wish list!
    
    
    