package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyEdgeDriver implements DriverParentInterface
{

	@Override
	public WebDriver getDriver()
	{
		WebDriver edgeDriver = new EdgeDriver();
		WebDriverManager.edgedriver().setup();
		edgeDriver.manage().window().maximize();
		return edgeDriver;
	}
	
}
