package HybridExcelTestNGPOM;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenFrame {
	
	public static String data;
	
	public static String excel(String sheet, int r, int c)
	{
		try
		{
		//stepI: Specify the path of the excel file
			FileInputStream fInput= new FileInputStream("./Excel/FBLoginCredentials.xlsx");
			
		//stepII: Open the excel file(book)
			Workbook book = WorkbookFactory.create(fInput);
			
		//stepIII: Specify the Sheet
			Sheet sheet1 = book.getSheet(sheet);
			
		//stepIV: Specify the row
			Row row1 = sheet1.getRow(r);
		//stepIV: Specify the cell
			Row cell1 = sheet1.getRow(c);
			
		//stepV: Fetch the data from row and cell
			data = cell1.toString();
			
		}
		catch(Exception e)
		{
			
		}
		return data;
	}
	
	
}
