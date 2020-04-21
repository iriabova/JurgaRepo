package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPageObject;

public class LoginStepDefinitions extends Base {
	
	//Declare LoginPageObject obj
	
	LoginPageObject loginpage;
	
	
	@Given("^User is on Tekschool page$")
	public void user_is_on_Tekschool_page() throws Throwable {
	Base.initializeDriver();
	
	//check for title
	loginpage = new LoginPageObject();
	String expectedTitle = "TEK School – Knowledge is power";
	//verify title of the TeckSchool page
	//this is hard Assertion and if expected does not meet actual result it will fail the execution
	Assert.assertEquals(expectedTitle, loginpage.pageTitle());
	   
	}

	@When("^User click on Test Environment link$")
	public void user_click_on_Test_Environment_link() throws Throwable {
		loginpage = new LoginPageObject();
		loginpage.clickOnTestEnvironmentLink();
	  
	}

	@Then("^User should see test environment page$")
	public void user_should_see_test_environment_page() throws Throwable {
		Assert.assertEquals("TEK SCHOOL", driver.getTitle());
	   
	}


}
