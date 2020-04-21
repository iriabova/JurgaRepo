
Feature: My Scenarios

  Background: 
    Given User is on Tekschool page
    And User click on Test Environment link
    And User should see test environment page
    
    @AddToShoppingCart_005
    Scenario: AddToShoppingCart_005
    
    When User clicks on Phones & PDAs label
    And User clicks on a product  
    Then user clicks on AddToCartButton
    Then user should see a message Success: You have added NameOfProduct to your shopping cart!
    When user clicks on shopping cart
    Then user should see a list of shopping items
    When user clicks on the same product again
    And clicks on AddToCartButton again
    Then quantity of products should be increased
       
    When user clicks on Shopping Cart menu on the top of the page
    And clicks on x button
    Then items are removed from shopping cart
    
    
    
    