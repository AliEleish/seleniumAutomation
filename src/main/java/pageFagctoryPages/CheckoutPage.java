package pageFagctoryPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configurations.GlobalSeleniumWebdriver;

import org.openqa.selenium.support.How;
public class CheckoutPage {
	
	public CheckoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	private Actions actions;
	LoginPage loginPageObj = new LoginPage(GlobalSeleniumWebdriver.driver);
	
	@FindBy(how = How.XPATH, using = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[3]/a[@title='T-shirts']")
	private WebElement TshirtsTab;
	
	@FindBy(how = How.CLASS_NAME , using = "icon-th-list")
	private WebElement listIcon;
	
	@FindBy(how = How.XPATH , using = "//a[@rel='nofollow'][@title='Add to cart']")
	private WebElement addToCartButton;
	
	@FindBy(how = How.XPATH, using = "//a[@title='Proceed to checkout']")
	private WebElement proceedToCheckoutButton;
	
	@FindBy(how = How.XPATH, using ="//a[@title='View my shopping cart']")
	private WebElement cartTab;
	
	@FindBy(how = How.ID , using = "button_order_cart")
	private WebElement button_order_cart; 
	
	@FindBy(how = How.XPATH , using = "//ul[@id='order_step']/li[1]")
	private WebElement SummaryTab;
	
	
	@FindBy(how = How.ID , using = "summary_products_quantity")
	private WebElement productsNumber;
	
	
	
	public void clickOnTshirtsTab()
	{
		loginPageObj.waitWebElement(TshirtsTab);
		clickOnWebElement(TshirtsTab);
	}
	
	public void clickOnListIcon()
	{
		loginPageObj.waitWebElement(listIcon);
		clickOnWebElement(listIcon);
	}
	public void clickOnAddToCartButton()
	{
		loginPageObj.waitWebElement(addToCartButton);
		clickOnWebElement(addToCartButton);
	}
	
	public void clickOnProceedToCheckoutButton()
	{
		loginPageObj.waitWebElement(proceedToCheckoutButton);
		clickOnWebElement(proceedToCheckoutButton);
	}
	
	
	
	public void addAnItemToCart()
	{
		clickOnTshirtsTab();
		clickOnListIcon();
		clickOnAddToCartButton();
		clickOnProceedToCheckoutButton();
		
	}
	public void clickOnButtonOrderButtonFromCartTab()
	{
		movetheMouseToCartElement();
		loginPageObj.waitWebElement(button_order_cart);
		clickOnWebElement(button_order_cart);
	}
	
	public String getNumberOfProducts()
	{
		return productsNumber.getText();
	}
	private void movetheMouseToCartElement()
	{
		actions = new Actions(GlobalSeleniumWebdriver.driver);
        loginPageObj.waitWebElement(cartTab);
		actions.moveToElement(cartTab).perform();
	}
	
	
	
	private void clickOnWebElement(WebElement element)
	{
		element.click();
		}

}
