package utility;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONObject;
import org.json.JSONTokener;

import com.fasterxml.jackson.core.JsonToken;


public class FileWriterUtility 
{


	
	public static void  writeFile(String data) 
	{
		
		 // Specify the file path
       String filePath = ".\\src\\test\\resources\\testdata\\jsonData.json";

       try {
           // Create a FileWriter object with the specified file path
           FileWriter fileWriter = new FileWriter(filePath);

           // Write characters to the file
           fileWriter.write(data);

           // Close the FileWriter to release resources
           fileWriter.close();

           System.out.println(data);

       } catch (IOException e) {
           // Handle any potential IOException that may occur during file operations
           e.printStackTrace();
       }
		
	}
	
//	public static void main(String args[])
//	{
//		FileWriterUtility.writeFile("Ho gaya...");
//
//	}
}






       

