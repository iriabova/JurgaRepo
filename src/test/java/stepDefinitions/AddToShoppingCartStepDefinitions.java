package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AddToShoppingCartPageObjects;
import utilities.Utility;

public class AddToShoppingCartStepDefinitions extends Base {
	
	AddToShoppingCartPageObjects addToShoppingCart = new AddToShoppingCartPageObjects();
	
	@When("^User clicks on Phones & PDAs label$")
	public void user_clicks_on_Phones_PDAs_label() throws Throwable {
		addToShoppingCart.clickOnPhonesAndPDAs();
	   
	}

	@And("^User clicks on a product$")
	public void user_clicks_on_a_product() throws Throwable {
		addToShoppingCart.clickOnProductName();
	    
	}
	 


	@When("^user clicks on AddToCartButton$")
	public void user_clicks_on_AddToCartButton() throws Throwable {
		addToShoppingCart.clickonaddToCart();
	   
	}

	@Then("^user should see a message Success: You have added NameOfProduct to your shopping cart!$")
	public void user_should_see_a_message_Success_You_have_added_NameOfProduct_to_your_shopping_cart() throws Throwable {
		Assert.assertEquals(addToShoppingCart.sucessMessage(), true);
		
	}

	@When("^user clicks on shopping cart$")
	public void user_clicks_on_shopping_cart() throws Throwable {
		addToShoppingCart.clickOnCart();
	    
	}

	@Then("^user should see a list of shopping items$")
	public void user_should_see_a_list_of_shopping_items() throws Throwable {
		//Utility.screenshot(driver);
	    
	}

	@When("^user clicks on the same product again$")
	public void user_clicks_on_the_same_product() throws Throwable {
		addToShoppingCart.clickOnProductNameAgain();
	   
	}

	@And("^clicks on AddToCartButton again$")
	public void clicks_on_AddToCartButton() throws Throwable {
		addToShoppingCart.clickOnCart();
	   
	}

	@Then("^quantity of products should be increased$")
	public void quantity_of_products_should_be_increased() throws Throwable {
		//Utility.screenshot(driver);
	   
	}
	//////////////////////////////////////////////////////////////////////////////
	@When("^user clicks on Shopping Cart menu on the top of the page$")
	public void user_clicks_on_Shopping_Cart_menu_on_the_top_of_the_page() throws Throwable {
		addToShoppingCart.clickonShoppingCart();
		Utility.screenshot(driver);
	}
	@When("^clicks on x button$")
	public void clicks_on_x_button() throws Throwable {
		addToShoppingCart.clickOnXButton();
	    
	}

	@Then("^items are removed from shopping cart$")
	public void items_are_removed_from_shopping_cart() throws Throwable {
	//Utility.screenshot(driver);
	   
	}

///////////////AddToWishList////////////////
	
	AddToShoppingCartPageObjects addToWishList = new AddToShoppingCartPageObjects();
	
	@When("^user clicks on HeartIcon$")
	public void user_clicks_on_HeartIcon() throws Throwable {
		addToWishList.clickheartIconOutsideProductPage();
	   
	}

	@Then("^user should see Success: You have added to you’re your Wish List!$")
	public void user_should_see_Success_You_have_added_Name_of_Product_to_you_re_your_Wish_List() throws Throwable {
		Assert.assertEquals(addToWishList.sucessMessage1(), true);
		
	   
	}

	@Then("^Verify item was added on “Wish Iist” on the top of the menu$")
	public void verify_item_was_added_on_Wish_Iist_on_the_top_of_the_menu() throws Throwable {
		Utility.screenshot(driver);
	    
	}

	@Then("^User clicks on HeartIcon again on the side of the page$")
	public void user_clicks_on_HeartIcon_again_on_the_side_of_the_page() throws Throwable {
		addToWishList.clickOnheartIconInsideProductPage();
	    
	}

	@When("^click on “Wish Iist” on the top of the menu$")
	public void click_on_Wish_Iist_on_the_top_of_the_menu() throws Throwable {
		addToWishList.clickaddToWishListTopPageButton();
	    
	}

	@Then("^wish list page is displayed$")
	public void wish_list_page_is_displayed() throws Throwable {
		System.out.println(driver.getTitle());
		Utility.screenshot(driver);
	   
	}

	@Then("^user clicks on RedXButton$")
	public void user_clicks_on_RedXButton() throws Throwable {
		addToWishList.clickRedXButton();
	}

	@Then("^the item should be removed and user should see Success: You have modified your wish list!$")
	public void the_item_should_be_removed_and_user_should_see_Success_You_have_modified_your_wish_list() throws Throwable {
		Assert.assertEquals(addToWishList.sucessMessage3(), true);
	}


}
