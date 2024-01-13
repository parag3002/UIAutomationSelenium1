package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForField.Read;

public class ExcelUtility 
{

//	public static void readExcel() throws Exception
//	{
//		FileInputStream excelFile = new FileInputStream(".\\src\\test\\resources\\Userdata.xlsx");
//		XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
//		XSSFSheet sheet = workbook.getSheet("data1");
//		
//		String s = sheet.getRow(1).getCell(1).getStringCellValue();
//		System.out.println(s);
	
//	}

//	
//	// for debug ---
	public static void main(String args[]) throws Exception
	{
		ExcelUtility readExcel = new ExcelUtility(".\\src\\test\\resources\\testdata\\Userdata.xlsx");
		int i = readExcel.getRowCount("Token");
		System.out.println("rowCount--->"+i);
		
		i = readExcel.getCellCount("Token", 0);
		System.out.println("cellCount--->"+i);
		
		String data1 = readExcel.getCellData("Token", 0, 0);
		System.out.println("Cell Data-->"+data1);
	}
	
	
	
	
	//////////////////////////////////////EXCEL Utility //////////////////////////////
	
	
	public FileInputStream fi ;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public CellStyle style;
	String path;
	
	public ExcelUtility(String path) 
	{
		this.path = path;
	}
	
	public int getRowCount(String sheetName) throws Exception
	{
		fi =new FileInputStream(this.path);
		workbook = new XSSFWorkbook(fi);
		sheet = workbook.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		workbook.close();
		return rowCount;
	}
	
	public int getCellCount(String sheetName, int rownum) throws Exception
	{
		fi =new FileInputStream(this.path);
		workbook = new XSSFWorkbook(fi);
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(rownum);
		int cellCount = row.getLastCellNum();
		workbook.close();
		return cellCount;
	}
	
	
	String data;
	public String getCellData(String sheetName,int rownum,int colnum)
	{
		try {
			fi=new FileInputStream(path);
		
			workbook=new XSSFWorkbook(fi);
			sheet=workbook.getSheet(sheetName);
			row=sheet.getRow(rownum);
			cell=row.getCell(colnum);
			DataFormatter formatter = new DataFormatter();
			
			data = formatter.formatCellValue(cell); //Returns the formatted value of a cell as a String regardless of the cell type.
			workbook.close();
			fi.close();
		}catch(IOException e) {}
		
		return data;
	}
	
	
}
