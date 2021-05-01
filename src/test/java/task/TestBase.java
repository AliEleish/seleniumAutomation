package task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import configurations.GlobalSeleniumWebdriver;
import configurations.Preconditions;
import pageFagctoryPages.CheckoutPage;
import pageFagctoryPages.LoginPage;

public class TestBase {
	
	
	public static LoginPage loginPageObj;
	public static CheckoutPage checkoutPageObj;

	@BeforeClass
	public static void preconditions()
	{

		Preconditions.settingWebDriverAndNavigateToURL("chrome" , "http://automationpractice.com/index.php");
	}
	
	@AfterClass
	public static void closeDriver()
	{
		Preconditions.closeTheDriver();
	}
}
