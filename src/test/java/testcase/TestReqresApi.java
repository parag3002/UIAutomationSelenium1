package testcase;

import java.io.FileWriter;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import api.*;
import api.endpoint.GorestApiEndpoint;
import api.endpoint.ReqresApiEndpoint;
import base.BaseClass;
import io.restassured.response.Response;
import pages.ReqresHomePage;
import utility.FileReaderUtility;
import utility.FileWriterUtility;


public class TestReqresApi extends BaseClass
{
	
	int i=1;
	
	@BeforeMethod
	public void beforeEachMethod()
	{
		System.out.println("\u001b[1mExecution Starts for Test---------> \u001b[0m" +(i++));
		
	}
	@AfterMethod
	public void afterEachMethod()
	{
		System.out.println("============End============");
	}
	
	

	@Test(priority=1)
	public void requresHomePage()
	{
		ReqresHomePage.reqresHomePage();

	}
	
	
	String listUsersUrl;
	
	@Test(priority=2)
	public void fetchListUsersUrl()
	{
		ReqresHomePage.reqresHomePage();
		listUsersUrl = ReqresHomePage.fetchListUsersUrl();
		System.out.println(listUsersUrl);
	}
	
	
	@Test(priority=3)
	public void testReqresListUsers()
	{
		Response response = ReqresApiEndpoint.reqresListUsers(listUsersUrl);
		response.then().log().all();
	}
	
	@Test(priority = 4)
	public void testCreateUser()
	{
		ReqresHomePage.reqresHomePage();
		String createUserUrl = ReqresHomePage.fetchCreateUserUrl();
		System.out.println("Create Usr URL ====>> "+createUserUrl);
		String createUserPayload = ReqresHomePage.fetchCreateUserPayload();
		System.out.println(createUserPayload);
		
		FileWriterUtility.writeFile(createUserPayload);
		
		Response response = ReqresApiEndpoint.createUser(FileReaderUtility.readJsonFile("C:\\E\\workspaces\\workSpace_RestAssured_P1\\UIAutomationSelenium1\\src\\test\\resources\\testdata\\jsonData.json"),"https://reqres.in/api/users"+createUserUrl);
		response.then().log().all();
	}
	
	
	
}







