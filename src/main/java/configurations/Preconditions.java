package configurations;

import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Preconditions {
	
//public static WebDriver driver;
	
//	public Preconditions(WebDriver driver)
//	{
//		this.driver = driver;
//	}
	
	public static void  settingWebDriverAndNavigateToURL(String browsername , String url)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			String chromeDriverPath = System.getProperty("user.dir")+ "\\src\\main\\java\\resources\\chromedriver.exe";
		    System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		    GlobalSeleniumWebdriver.driver = new ChromeDriver();
		    GlobalSeleniumWebdriver.driver.navigate().to(url);
		}
		else if (browsername.equalsIgnoreCase("firefox"))
		{
			String fireFoxDriverPath = System.getProperty("user.dir"+ "\\src\\main\\java\\resources\\geckodriver.exe");
		    System.setProperty("webdriver.gecko.driver", fireFoxDriverPath);
		    GlobalSeleniumWebdriver.driver = new FirefoxDriver();
		    GlobalSeleniumWebdriver.driver.navigate().to(url);
		}
	}

	public static void closeTheDriver() {
		GlobalSeleniumWebdriver.driver.quit();
		
	}
	/*
	public static void main(String  args[])
	{
		System.out.println(System.getProperty("user.dir"));
	}*/
	

}
