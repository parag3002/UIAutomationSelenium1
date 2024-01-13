package pages;

import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BaseClass;
import utility.PropertyReader;

public class ReqresHomePage extends BaseClass
{
	
	public static void reqresHomePage()
	{
		driver.get(PropertyReader.readProperties("reqresHomePage"));
	}
	
	public static By listUser = By.xpath("//a[normalize-space()='List users']");
	public static By listUserUrl = By.xpath("//span[@class='url']");
	
	public static String fetchListUsersUrl()
	{
		driver.findElement(listUser).click();
		WebElement w = driver.findElement(listUserUrl);
		String listUserUrl = w.getText();
		return listUserUrl;
	}
	
}
