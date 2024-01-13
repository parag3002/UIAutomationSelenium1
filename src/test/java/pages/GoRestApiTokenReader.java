package pages;

import base.BaseClass;
import utility.PropertyReader;

public class GoRestApiTokenReader extends BaseClass
{

	public static void gorestGetToken()
	{
		driver.get(PropertyReader.readProperties("goRestApiTokenUrl"));
		
	}
	
}
