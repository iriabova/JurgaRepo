package stepDefinitions;

import org.testng.Assert;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPageObject;
import utilities.Utility;

public class CanvasLoginPageStepDefinitions extends Base {
	
	@Given("^User is on Tek School Page$")
	public void user_is_on_Tek_School_Page() throws Throwable {
		System.out.println("This is Canvas Login Page Test");
   
	}
	
	LoginPageObject loginpage;

	@When("^User clicks on Login button$")
	public void user_clicks_on_Login_button() throws Throwable {
		System.out.println("This is Canvas Login Page Test");
		loginpage = new LoginPageObject();
		loginpage.clickOnloginToClassLink();
	   
	}

	@Then("^user should see Canvas Login Page$")
	public void user_should_see_Canvas_Login_Page() throws Throwable {
		loginpage = new LoginPageObject();
		Assert.assertEquals(driver.getTitle(), "Log In to Canvas");
		Utility.screenshot(driver);
	}



}
