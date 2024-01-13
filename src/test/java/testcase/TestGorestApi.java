package testcase;

import org.testng.annotations.Test;
import api.*;
import api.endpoint.GorestApiEndpoint;
import io.restassured.response.Response;
import utility.FileReaderUtility;


public class TestGorestApi 
{

	@Test(priority=1)
	public void testGorestListUsers()
	{
		Response response = GorestApiEndpoint.gorestGetUsersEndPoint();
		response.then().log().all();
		
	}
	
	
	@Test(priority=2, description = "create user gorest api", groups = "functional")
	public void testGorestCreateUser()
	{
		String payload;
		payload = FileReaderUtility.readJsonFile(".\\src\\test\\resources\\testdata\\gorestPayload.json");
		Response response = GorestApiEndpoint.gorestCreateUser(payload);
		response.then().log().all();
	}
	
}
