package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	public static WebDriver driver;

	
	@BeforeMethod
	public static WebDriver setup()
	{
		driver = DriverFactory.getFactoryDriver();
		
		return driver;
	}
	
	@AfterMethod
	public static void tearDownDriver()
	{
		
		if(driver!=null)
		{
		driver.quit();
		}
		DriverFactory.nullifyDriver();
		
	}
	
}
