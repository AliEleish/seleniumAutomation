package task;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import configurations.GlobalSeleniumWebdriver;
import pageFagctoryPages.CheckoutPage;
import pageFagctoryPages.LoginPage;

public class LoginAndCheckout extends TestBase {
	
	@Test(priority = 0)
	public static void Step1_loginToWebSite()
	{
	    loginPageObj = new LoginPage(GlobalSeleniumWebdriver.driver);
		loginPageObj.LoginToTheWebSite("alyalash98@gmail.com", "Vodafone@11");
	}
	
	@Test(priority = 1)
    public static void Step2_verifySuccessLogin()
    {
		assertTrue(loginPageObj.getLandingPageHeader().contains("MY ACCOUNT"));
    }
	
	@Test(priority = 2)
	public static void Step3_addItemToCart()
	{
		checkoutPageObj = new CheckoutPage(GlobalSeleniumWebdriver.driver);
		checkoutPageObj.addAnItemToCart();
	}
	
	@Test(priority = 3)
	public void Step4_checkout()
	{
		checkoutPageObj.clickOnButtonOrderButtonFromCartTab();
	}
	
	@Test(priority = 5)
	public void Step6_verifyShoppingCartContainsOneProduct()
	{
		assertEquals(checkoutPageObj.getNumberOfProducts() , "1 Product");
	}
}
