package pages;


import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BaseClass;
import utility.PropertyReader;



public class W3schoolJavaPage extends BaseClass
{

	public static By homeCta = By.xpath("//div[@class='w3-clear nextprev']//a[@class='w3-left w3-btn'][contains(text(),'❮ Home')]");
	
	
	public static void clickHomeCta()
	{
		driver.findElement(homeCta).click();;
	}
	
}
