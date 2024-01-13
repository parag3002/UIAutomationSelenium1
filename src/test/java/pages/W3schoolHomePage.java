package pages;

import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BaseClass;
import utility.PropertyReader;


public class W3schoolHomePage extends BaseClass
{

	public static void getUrl()
	{
		driver.get(PropertyReader.readProperties("w3schoolUrl"));
		
	}
	
	
	private static By javaTab = By.xpath("//a[normalize-space()='JAVA']");
	private static By tutorialsLink = By.xpath("//a[@id='navbtn_tutorials']");
	private static By learnJava = By.xpath("//h2[normalize-space()='Learn Java']");
	
	
	public static void clickJavaTab()
	{
		driver.findElement(javaTab).click();
		
	}
	
	
	public static void ClickTutorialLink()
	{
		driver.findElement(tutorialsLink).click();
	}
	
	
	public static void assertLearnJava()
	{
		WebElement el = driver.findElement(learnJava);
		assertNotNull(el);
		System.out.println("----->>>> Test Case Pass <<<<<----");
	}
	
	
}
