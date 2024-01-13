package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import api.*;
import api.endpoint.GorestApiEndpoint;
import api.endpoint.ReqresApiEndpoint;
import base.BaseClass;
import io.restassured.response.Response;
import pages.ReqresHomePage;
import utility.FileReaderUtility;


public class TestReqresApi extends BaseClass
{

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
	
}
