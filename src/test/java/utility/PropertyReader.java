package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader 
{

	static String filedata;
	static String apiEndpoint;
	
	public static String readProperties(String keyValue)
	{
		
		try {
		FileInputStream file = new FileInputStream(".\\src\\test\\resources\\properties\\attributes.properties");
		Properties property = new Properties();
		property.load(file);
		filedata = property.getProperty(keyValue).toString();
		}catch(IOException e) {System.out.println("File not found");}
		return filedata;
	}
	
	public static String apiEndpoints(String keyValue)
	{
		
		try {
		FileInputStream file = new FileInputStream(".\\src\\test\\resources\\properties\\endpoints.properties");
		Properties property = new Properties();
		property.load(file);
		filedata = property.getProperty(keyValue).toString();
		}catch(IOException e) {System.out.println("File not found");}
		return filedata;
	}
	
}
