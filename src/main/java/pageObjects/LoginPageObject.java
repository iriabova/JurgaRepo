package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LoginPageObject extends Base {

	public LoginPageObject() {
		PageFactory.initElements(driver, this);

	}

	// @findBY this annotation is part of Page Factory class which helps us to
	// initialize the element
	@FindBy(how = How.XPATH, using = "//a[text() = 'Test Environment']")
	private WebElement testEnvironmentLink;

	@FindBy(how = How.XPATH, using = "//a[text() = 'Login to Class']")
	private WebElement loginToClassLink;
	
	/**
	 * This method will click on Test environment link on TekSchool Page
	 */

	@FindBy(how = How.ID, using = "mc4wp-form-1")
	private WebElement subsEmailField;
	
	/**
	 * This method will click on Login to ClassLink on TekSchool page
	 */

	public void clickOnTestEnvironmentLink() {
		testEnvironmentLink.sendKeys(Keys.ENTER);;

	}
	/**
	 * 
	 */
	public void clickOnloginToClassLink() {
		loginToClassLink.sendKeys(Keys.ENTER);;
	}
/**
 * This method will enter email value in Subscribe email field in TekSchool
 * @param emailValue
 */
	public void sendValueTosubsEmailField(String emailValue) {
		subsEmailField.sendKeys(emailValue);
	}
	
	/**
	 * This method will return TekSchool Page title
	 * @return
	 */

	public String pageTitle() {
		String TekSchoolPageTitle = driver.getTitle();
		return TekSchoolPageTitle;
	}
	
	
}
