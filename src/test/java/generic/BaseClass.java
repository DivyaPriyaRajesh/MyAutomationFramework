package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public abstract class BaseClass {
	
	public void readExcel() {
		
		String currentPath = System.getProperty("user.dir");
		
		currentPath = currentPath + "\\src\\test\\java\\data\\";
		
		File file = new File(currentPath+"xyz.xls");
		
		try {
			FileInputStream fis = new FileInputStream(file);
			
			HSSFWorkbook hb = new HSSFWorkbook(fis);
			HSSFSheet sheet = hb.getSheet("sample");
			HSSFRow row = sheet.getRow(2); 
			HSSFCell cell = row.getCell(0);
			System.out.println(cell.getStringCellValue());
			
			hb.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void writeExcel(String sheetName, String fileName) {
		
		
		HSSFWorkbook hb = new HSSFWorkbook(); 
		HSSFSheet sheet = hb.createSheet(sheetName);
		
		for(int i=0;i<=10;i++) {
			
		
		HSSFRow row = sheet.createRow(i); 
		HSSFCell cell = row.createCell(0);
		cell.setCellValue("DIVYA");
	}
		
		String currentPath = System.getProperty("user.dir");
		
		currentPath = currentPath + "\\src\\test\\java\\data\\";
		
		File file = new File(currentPath+"xyz.xls");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			hb.write(fos);
			hb.close();
		} catch (FileNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
