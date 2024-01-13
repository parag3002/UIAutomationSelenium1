package utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONObject;
import org.json.JSONTokener;

import com.fasterxml.jackson.core.JsonToken;


public class FileReaderUtility 
{

	static String jsonFileData;
	static File file;
	static FileReader reader;
	static JSONTokener jsonTokener;
	static JSONObject jsonObject;
	
	public static String readJsonFile(String path) 
	{
		try
		{
			
		file = new File(path);
		reader = new FileReader(file);
		jsonTokener = new JSONTokener(reader);
		jsonObject = new JSONObject(jsonTokener);
		jsonFileData = jsonObject.toString();
		
		
		}
		catch(IOException e) {System.out.println(e);}
		
		return jsonFileData;
	}
	
//	public static void main(String args[])
//	{
//		String s = readJsonFile(Routes.createTokenJsonFilePath);
//		System.out.println(s);
//	}
}
