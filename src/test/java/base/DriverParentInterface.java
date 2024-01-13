package base;

import org.openqa.selenium.WebDriver;

public interface DriverParentInterface 
{

	public abstract WebDriver getDriver();
	
	default public void display()
	{
		System.out.println("This is default method");
	}
}
