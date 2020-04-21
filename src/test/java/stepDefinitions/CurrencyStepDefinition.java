package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CurrencyObjects;

public class CurrencyStepDefinition extends Base{
	
	CurrencyObjects currency = new CurrencyObjects();
	
	@When("^user clicks on Currency tab on the left top of the page$")
	public void user_clicks_on_Currency_tab_on_the_left_top_of_the_page() throws Throwable {
		
	    
	}

	@Then("^Verify (\\d+) currencies  US Dollar, Euro and Pound are displayed$")
	public void verify_currencies_US_Dollar_Euro_and_Pound_are_displayed(int arg1) throws Throwable {
	   
	}

	@Then("^user clicks on on different currency$")
	public void user_clicks_on_on_different_currency() throws Throwable {
	    
	}

	@Then("^Verify the chosen currency is displayed under Product’s description in the product item in the product list$")
	public void verify_the_chosen_currency_is_displayed_under_Product_s_description_in_the_product_item_in_the_product_list() throws Throwable {
	    
	}

	@Then("^user click on a specific product and product details page appeared\\.$")
	public void user_click_on_a_specific_product_and_product_details_page_appeared() throws Throwable {
	    
	}

	@Then("^Verify the chosen currency is displayed On the product details page\\.$")
	public void verify_the_chosen_currency_is_displayed_On_the_product_details_page() throws Throwable {
	   
	}

	@Then("^User clicks on Add to cart button$")
	public void user_clicks_on_Add_to_cart_button() throws Throwable {
	    
	}

	@Then("^Verify the chosen currency is displayed in the “Shopping cart\"for each individual product\\.$")
	public void verify_the_chosen_currency_is_displayed_in_the_Shopping_cart_for_each_individual_product() throws Throwable {
		
		
	}
	   

	@Then("^User clicks on Log out of the account button$")
	public void user_clicks_on_Log_out_of_the_account_button() throws Throwable {
	   
	}

	@Then("^Verify the chosen currency is saved when the user logs back in the account$")
	public void verify_the_chosen_currency_is_saved_when_the_user_logs_back_in_the_account() throws Throwable {
	    
	}



}
