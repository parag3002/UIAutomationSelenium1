package api.endpoint;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.http.ContentType;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.github.javafaker.Faker;
import com.github.javafaker.IdNumber;
import com.google.gson.JsonObject;

import dev.failsafe.internal.util.Assert;
import groovyjarjarpicocli.CommandLine.IExitCodeExceptionMapper;

import io.restassured.internal.ResponseSpecificationImpl.HamcrestAssertionClosure;
import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.xml.XmlPath;


import java.io.FileReader;
import jdk.internal.net.http.common.Log;
import net.sf.saxon.exslt.Math;


import api.*;
import utility.*;

public class GorestApiEndpoint 
{

	public static Response gorestGetUsersEndPoint()
	{
		Response response =
				given()
					.contentType(ContentType.JSON)
				.when()
					//.get("https://gorest.co.in/public/v2/users");
					.get(PropertyReader.apiEndpoints("gorestBaseUrl")+PropertyReader.apiEndpoints("gorestListusersEndPoint"));
		return response;
	}
	
	
	public static Response gorestCreateUser(String payload)
	{
		ExcelUtility token = new ExcelUtility(".\\src\\test\\resources\\testdata\\Userdata.xlsx");
		String bearerToken = token.getCellData("Token", 0, 0);
		Response response =
				given()
					.contentType(ContentType.JSON)
					.header("Authorization",bearerToken)
					.body(payload)
				.when()
					.post(PropertyReader.apiEndpoints("gorestBaseUrl")+PropertyReader.apiEndpoints("gorestCreateUserEndPoint"));
		return response;
	}
}
