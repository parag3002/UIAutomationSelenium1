package base;

import org.openqa.selenium.WebDriver;

public class DriverFactory 
{
	
	public static WebDriver factoryDriver;
	public static DriverParentInterface driverI;
	public static String browser="FireFox";
	
	public static WebDriver getFactoryDriver()
	{
		if(factoryDriver==null)
		{
			
			if(browser.equalsIgnoreCase("firefox"))
			{
				driverI = new MyFirefoxDriver();
				factoryDriver = driverI.getDriver();
			}
			
			else if(browser.equalsIgnoreCase("edge"))
			{
				driverI = new MyEdgeDriver();
				factoryDriver = driverI.getDriver();
			}
			else
			{
				System.out.println("not a valid browser");
			}
			
		}
		
		
		
		return factoryDriver;
	}
	
	
	public static void nullifyDriver()
	{
		factoryDriver = null;
		
	}
	
}
