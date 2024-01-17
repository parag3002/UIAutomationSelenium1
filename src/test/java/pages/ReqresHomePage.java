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
	public static By createUserCta = By.xpath("//a[normalize-space()='Create']");
	public static By createUserUrl = By.xpath("//span[@class='url']");
	public static By createUserPayload = By.xpath("//pre[@data-key='output-request']");
	
	
	
	
	public static String fetchListUsersUrl()
	{
		driver.findElement(listUser).click();
		WebElement w = driver.findElement(listUserUrl);
		String listUserUrl = w.getText();
		return listUserUrl;
	}
	
	public static String fetchCreateUserUrl()
	{
		driver.findElement(createUserCta).click();
		WebElement w = driver.findElement(createUserUrl);
		String createUserUrlString = w.getText();
		return createUserUrlString;
	}
	
	public static String fetchCreateUserPayload()
	{
		String payload;
		WebElement w = driver.findElement(createUserPayload);
		payload = w.getText();
		return payload;
	}
	
	//==========================
	
	
	
	
	
	public ReqresHomePage reqresHomePage1()
	{
		driver.get(PropertyReader.readProperties("reqresHomePage"));
		return this;
	}
	
	
	
	public  By listUser1 = By.xpath("//a[normalize-space()='List users']");
	public  By listUserUrl1 = By.xpath("//span[@class='url']");
	public  By createUserCta1 = By.xpath("//a[normalize-space()='Create']");
	public  By createUserUrl1 = By.xpath("//span[@class='url']");
	public  By createUserPayload1 = By.xpath("//pre[@data-key='output-request']");
	
	
	
	
	public  String fetchListUsersUrl1()
	{
		driver.findElement(listUser1).click();
		WebElement w = driver.findElement(listUserUrl1);
		String listUserUrl11 = w.getText();
		return listUserUrl11;
	}
	
	public  String fetchCreateUserUrl1()
	{
		driver.findElement(createUserCta1).click();
		WebElement w = driver.findElement(createUserUrl1);
		String createUserUrlString1 = w.getText();
		return createUserUrlString1;
	}
	
	public  String fetchCreateUserPayload1()
	{
		String payload;
		WebElement w = driver.findElement(createUserPayload1);
		payload = w.getText();
		return payload;
	}
	
	
	
	
}
