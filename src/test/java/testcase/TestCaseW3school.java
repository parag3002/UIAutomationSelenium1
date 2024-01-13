package testcase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoRestApiTokenReader;
import pages.W3schoolHomePage;
import pages.W3schoolJavaPage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.*;
import base.*;

public class TestCaseW3school extends BaseClass
{

	
	@Test(groups = "regression" , priority =1)
	public void testLaunchHomePage()
	{
		W3schoolHomePage.getUrl();
	}
	
	
	@Test(groups = "regression" , priority = 2)
	public void testClickJavaTab()
	{
		W3schoolHomePage.getUrl();
		
		try{Thread.sleep(1000);} catch(InterruptedException e) {}
		W3schoolHomePage.clickJavaTab();
		try{Thread.sleep(1000);} catch(InterruptedException e) {}
		W3schoolHomePage.assertLearnJava();
	}
	
	
	@Test(groups="regression", priority =3)
	public void testClickTutorialLink()
	{
		W3schoolHomePage.getUrl();
		try{Thread.sleep(1000);} catch(InterruptedException e) {}
		W3schoolHomePage.ClickTutorialLink();
		try{Thread.sleep(1000);} catch(InterruptedException e) {}
	}
	
	@Test(priority=4)
	public void testCLickHomeCtaOnJavaPage()
	{
		W3schoolHomePage.getUrl();
		W3schoolHomePage.clickJavaTab();
		try{Thread.sleep(1000);} catch(InterruptedException e) {}
		W3schoolJavaPage.clickHomeCta();
		try{Thread.sleep(1000);} catch(InterruptedException e) {}
	}
	
	
	@Test(priority =5)
	public void gorestApiGetToken()
	{
		GoRestApiTokenReader.gorestGetToken();
	}
	
	
}
