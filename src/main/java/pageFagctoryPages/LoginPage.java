package pageFagctoryPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import configurations.GlobalSeleniumWebdriver;


public class LoginPage {
	
	//public WebDriver driver;
     public static WebDriverWait wait;
     
	public LoginPage(WebDriver driver)
	{
		//this.driver = driver;
		PageFactory.initElements( driver, this);
	}
	
	@FindBy(how = How.CLASS_NAME, using = "login")
	private WebElement signInButton;
	
	@FindBy(how = How.ID , using = "email")
	private WebElement usernameTxtField;
	
	@FindBy(how = How.XPATH , using ="//input[@name='passwd']")
	private WebElement passwordTxtField;

	@FindBy(how = How.CSS , using ="button[type='submit'][name='SubmitLogin']")
	private WebElement submitLoginButton;
	
	@FindBy(how = How.CLASS_NAME , using = "page-heading")
	private WebElement landingPageHeader;
	
	
	private void clickOnSignInButton()
	{
		waitWebElement(signInButton);
		signInButton.click();
	}
	private void setUserName(String username)
	{
		waitWebElement(usernameTxtField);
		usernameTxtField.sendKeys(username);	
	}
	private void setPassword(String password)
	{
		waitWebElement(passwordTxtField);
		passwordTxtField.sendKeys(password);	
	}
	
	public void clickOnSubmitButton()
	{
		waitWebElement(submitLoginButton);
		submitLoginButton.click();
	}
	
	public String getLandingPageHeader()
	{
		waitWebElement(landingPageHeader);
		//System.out.println(landingPageHeader.getText());
	  return landingPageHeader.getText();
		
	}
	
	public void LoginToTheWebSite(String username , String password)
	{
		clickOnSignInButton();
		setUserName(username);
		setPassword(password);
		clickOnSubmitButton();
		
	}
	
	public void waitWebElement(WebElement element)
	{
		wait = new WebDriverWait(GlobalSeleniumWebdriver.driver, 100);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	
}
