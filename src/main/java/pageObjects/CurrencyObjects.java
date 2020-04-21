package pageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class CurrencyObjects extends Base{
	
	public CurrencyObjects() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(how = How.XPATH, using = "//span[text() = 'Currency']")
	private WebElement currency;
	
	@FindBy(how = How.XPATH, using = "//button[text() = '€ Euro']")
	private WebElement euro;
	
	@FindBy(how = How.XPATH, using = "//a[text() = 'HTC Touch HD']")
	private WebElement product;
	
	//button[text() = 'Add to Cart']
	
	@FindBy(how = How.XPATH, using = "//button[text() = 'Add to Cart']")
	private WebElement addToCart;
	
	//span[text() = 'My Account']
	
	@FindBy(how = How.XPATH, using = "//span[text() = 'My Account']")
	private WebElement myAccount;
	
	//a[text() = 'Logout']
	
	@FindBy(how = How.XPATH, using = "//a[text() = 'Logout']")
	private WebElement logOut;
}


