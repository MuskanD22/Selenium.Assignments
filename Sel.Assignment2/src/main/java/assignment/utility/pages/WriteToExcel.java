package assignment.utility.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class WriteToExcel {
         
	
	public void writeInExcel(WebDriver driver,String URL,String path) throws IOException {
		//Create an object of File class to open xlsx file
	  File file =    new File(path);
	        
	  //Create an object of FileInputStream class to read excel file
	  FileInputStream inputStream = new FileInputStream(file);
	        
	  //creating workbook instance that refers to .xlsx file
	  XSSFWorkbook wb=new XSSFWorkbook(inputStream);
	        
	  //creating a Sheet object
	  XSSFSheet sheet=wb.getSheet("Muskan");
	       
	  WebElement ele=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/h1"));
	  
			
	 int row_count= wb.getSheetAt(0).getLastRowNum()+1;
	  for(int i=1;i<row_count;i++) {
	  XSSFCell cell=sheet.getRow(i).createCell(2);
		if(ele.getText().contains("dashboard")) {
			cell.setCellValue("Pass");
		}
		else {
			cell.setCellValue("Fail");
		}
	  }
        // Write the data back in the Excel file
        FileOutputStream outputStream = new FileOutputStream(file);
        wb.write(outputStream);
        
      //Close the workbook
        wb.close();
        
	}
	
	
}
