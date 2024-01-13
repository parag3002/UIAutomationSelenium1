package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirefoxDriver implements DriverParentInterface
{

	@Override
	public WebDriver getDriver()
	{
		WebDriver firefoxDriver = new FirefoxDriver();
		WebDriverManager.firefoxdriver().setup();
		firefoxDriver.manage().window().maximize();
		return firefoxDriver;
	}
	
}
