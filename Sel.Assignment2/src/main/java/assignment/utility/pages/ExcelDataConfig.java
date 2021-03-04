package assignment.utility.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
	XSSFWorkbook wb;
	
	XSSFSheet sheet;
	public ExcelDataConfig(String excelPath) {
		File src=new File(excelPath);
		
		try {

	        //Create an object of FileInputStream class to read excel file
			FileInputStream fis=new FileInputStream(src);
			// Now get the workBook 
			wb=new XSSFWorkbook(fis);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
	
	public String getData(int sheetNumber, int row,int column) {
		
		sheet=wb.getSheetAt(sheetNumber);
		String data=sheet.getRow(row).getCell(column).getStringCellValue();
		
		return data;
	}
	
	public int getRowCount(int sheetNumber) {
		
		return (wb.getSheetAt(sheetNumber).getLastRowNum()+1);
	}
	
}
