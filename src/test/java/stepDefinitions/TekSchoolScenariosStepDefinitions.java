package stepDefinitions;

import java.util.List;

import org.junit.Assert;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.TekSchoolScenariosPageObject;
import utilities.DBUtilities;
import utilities.Utility;

public class TekSchoolScenariosStepDefinitions extends Base {
	
	TekSchoolScenariosPageObject tekSchoolScenariosPageObject = new TekSchoolScenariosPageObject();
	
	@When("^User clicks on My Account Menu on top of the page$")
	public void user_clicks_on_My_Account_Menu_on_top_of_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Utility.screenshot(driver);
		tekSchoolScenariosPageObject.clickOnMyAccount();
//		tekSchoolScenariosPageObject.clickOnLogin();
	 
	}
//replace 'username' and 'password' with (.+)
	@And("^User enters username '(.+)' and password '(.+)' in returning menu$")
	public void user_enters_username_username_and_password_password_in_returning_menu(String userName, String passWord) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		tekSchoolScenariosPageObject.enterEmailAddress(userName);
		tekSchoolScenariosPageObject.enterPasswrod(passWord);
	}

	@And("^User clicks on login buttin$")
	public void user_clicks_on_login_buttin() throws Throwable {
	    // Write code here that turns the phrase above into concrete action
		Utility.screenshot(driver);
		tekSchoolScenariosPageObject.clickOnLoginButton();
	 
	}

	@Then("^User should be logged in$")
	public void user_should_be_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(true, tekSchoolScenariosPageObject.verifyLoginToMyAccount());
		Utility.screenshot(driver);
		  
	}

@And("^User click on space login on myAccount menu")
public void user_click_on_login_on_myAccount_menu() {
	tekSchoolScenariosPageObject.clickOnLogin();
	
}

@When("^User clicks on Register on MyAccount Menu$")
public void user_clicks_on_Register_on_MyAccount_Menu() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	tekSchoolScenariosPageObject.clickOnRegister();
   
}

@And("^User fills Register form with below information$")
public void user_fills_Register_form_with_below_information(DataTable personalInfo) throws Throwable {
   
	
	List<List<String>> dataValues = personalInfo.raw();     
	
 //Open TekSchoolScenariosPageObject and store webelements of register form
	
	tekSchoolScenariosPageObject.fillFirstName(dataValues.get(0).get(0));
	tekSchoolScenariosPageObject.fillLastName(dataValues.get(0).get(1));
	tekSchoolScenariosPageObject.fillEmail(dataValues.get(0).get(2));
	tekSchoolScenariosPageObject.fillPhone(dataValues.get(0).get(3));
	tekSchoolScenariosPageObject.fillPassword(dataValues.get(0).get(4));
	tekSchoolScenariosPageObject.fillPasswordConf(dataValues.get(0).get(4));
		
}

@And("^User clicks on '(.+)' radio button for subscribe$")
public void user_clicks_on_yes_radio_button_for_subscribe(String radioButtonValue) throws Throwable {
	tekSchoolScenariosPageObject.subscribeRadioButon(radioButtonValue);
	Utility.screenshot(driver);

}

@And("^User clicks on continue button$")
public void user_clicks_on_continue_button() throws Throwable {
	tekSchoolScenariosPageObject.clickOnContinue();
  
}

@Then("^User should see 'Your Account Has Been Created!'$")
public void user_should_see_Your_Account_Has_Been_Created() throws Throwable {
	Assert.assertEquals(tekSchoolScenariosPageObject.confirmationMessage(), true);
    
}

@When("^User connects to Database$")
public void user_connects_to_Database() throws Throwable {
	DBUtilities.setupConnection();
   
	
}

@When("^User sends query '(.+)'$")
public void user_sends_query(String query) throws Throwable {
	DBUtilities.runQuery(query);
	
}

@Then("^user verify account is created with email'(.+)'$")
public void user_verify_account_is_created_with_email(String emailValidation) throws Throwable {
  
  }
	
}




