package com.Demo.GenericsUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public WebDriverUtility wLib = new WebDriverUtility();
	public ExcelUtility eLib = new ExcelUtility();
	public JSONFileUtility jsLib = new JSONFileUtility();
	public WebDriver driver;
	
	@BeforeClass()
	public void launchBrowser() throws Throwable
	{
		String BROWSER = jsLib.readDataFromJson("browser");
		
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}else if(BROWSER.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else {
			driver = new InternetExplorerDriver();
		}
		
	}
	
	
	@BeforeMethod()
	public void enterMonkeycapUrl() throws Throwable
	{
		String URL = jsLib.readDataFromJson("url");
		wLib.waitForPageToLoad(driver);
		driver.get(URL);
		wLib.maximizeWin(driver);
	}
	
	
    @AfterMethod()
    public void closeMonkeycapUrl()
    {
    	driver.close();
    }
    

}
