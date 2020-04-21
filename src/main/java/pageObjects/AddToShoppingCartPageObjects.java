package pageObjects;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class AddToShoppingCartPageObjects extends Base {
	
	public AddToShoppingCartPageObjects() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//ul[@class='nav navbar-nav']//li//a[text()='Phones & PDAs']")
	private WebElement phonesAndPDAsWebElement;
	
	@FindBy(how = How.XPATH, using = "//img[@title = 'HTC Touch HD']")
	private WebElement productNameWebElement;
	
	@FindBy(how = How.XPATH, using = "//button[@id = 'button-cart']")
	private WebElement addCartButtonWebElement;
	
	@FindBy(how = How.XPATH, using = "//div[@class = 'alert alert-success alert-dismissible']")
	private WebElement successMessageWebElement;
	
	@FindBy(how = How.XPATH, using = "//span[@id = 'cart-total']")
	private WebElement cartButtonWebElement;
	
	@FindBy(how = How.XPATH, using = "//span[text() = 'Shopping Cart']")
	private WebElement shoppingCartWebElement;
	
	@FindBy(how = How.XPATH, using = "//i[@class = 'fa fa-times-circle']")
	private WebElement xButtonWebElement;
	
	public void clickOnPhonesAndPDAs() {
		try {
			phonesAndPDAsWebElement.click();
		} catch (ElementNotInteractableException e) {
			phonesAndPDAsWebElement.sendKeys(Keys.ENTER);
		}
	}
	public void clickOnProductName() {
		productNameWebElement.click();
	}
	
	public void clickOnProductNameAgain() {
		productNameWebElement.click();
	}
	
	public void clickonaddToCart() {
		addCartButtonWebElement.click();
	}
	
	public void clickonaddToCartAgain() {
		addCartButtonWebElement.click();
	}
	
	public boolean sucessMessage() {
		boolean verification = successMessageWebElement.isDisplayed();
		return verification;
	}
	public void clickOnCart() {
		cartButtonWebElement.click();
	}
	
	public void clickonShoppingCart() {
		shoppingCartWebElement.click();
	}
	
	public void clickOnXButton() {
		xButtonWebElement.click();
	}
	
	///////AddToWishList//////
	
		
	@FindBy(how = How.XPATH, using = "//div[@class = 'btn-group']//button[@class = 'btn btn-default']//i[@class = 'fa fa-heart']")
	private WebElement heartIconInsideProductPage;
			
	@FindBy(how = How.XPATH, using = "//div[@class ='alert alert-success alert-dismissible']")
	private WebElement wishListSuccessMessageInsideProductPage;
			
	@FindBy(how = How.XPATH, using = "//div[@class='button-group']//button[@data-original-title=\"Add to Wish List\" and@onclick=\"wishlist.add('28');\"]//i[@class='fa fa-heart']")
	private WebElement heartIconOutsideProductPage;
	
	@FindBy(how = How.XPATH, using = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement wishListSuccessMessageOutsideProductPage;
	
	@FindBy(how = How.XPATH, using = "//span[text() = 'Wish List (1)']")
	private WebElement addToWishListTopPageButton;
	
	@FindBy(how = How.XPATH, using = "//a[@class = 'btn btn-danger']")
	private WebElement redXButton;
	
	@FindBy(how = How.XPATH, using = "//div[@class = 'alert alert-success alert-dismissible']")
	private WebElement successMessageDeletedFromWishList;
	
	public void clickOnheartIconInsideProductPage() {
		heartIconInsideProductPage.click();
	}
	public void clickheartIconOutsideProductPage() {
		heartIconOutsideProductPage.click();
	}
	public void clickaddToWishListTopPageButton() {
		 addToWishListTopPageButton.click();
	}
	public boolean sucessMessage1() {
		boolean verification = wishListSuccessMessageInsideProductPage.isDisplayed();
		return verification;
	}
	public boolean sucessMessage2() {
		boolean verification = wishListSuccessMessageOutsideProductPage.isDisplayed();
		return verification;
	}	
	
	public void clickRedXButton() {
		redXButton.click();
	}
	
	public boolean sucessMessage3() {
		boolean verification = successMessageDeletedFromWishList.isDisplayed();
		return verification;
	}
}
