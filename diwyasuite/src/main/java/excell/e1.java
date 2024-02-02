package excell;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class e1 {
	@Test
	public void t1() throws IOException
	{
		//apache poi, apache poi ooxml, apache poi ooxml schema
		File f= new File("C:\\Users\\hp\\Desktop\\My Contact Form - Copy 2.xlsx");
		FileInputStream fis= new FileInputStream(f);
		
		//workbook
		XSSFWorkbook x= new XSSFWorkbook(fis);
		XSSFSheet sheet = x.getSheetAt(0);
		
		// numbr of rows
		int row=sheet.getLastRowNum();
		System.out.println("Total number of rows "+ row);
	
		// number of columns : specific about the row index
		int col=sheet.getRow(0).getLastCellNum();
		System.out.println("Number of columns in first row "+col );
		
		//reading 
		//6,2
		XSSFCell data = sheet.getRow(6).getCell(2);
		System.out.println(data);
		
		//37,5
		sheet.getRow(37).createCell(5).setCellValue("DIWYA");
		FileOutputStream fos= new FileOutputStream(f);
		x.write(fos);
		
		
		
	}

}
