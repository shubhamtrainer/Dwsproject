package com.tyss.genericutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String getDataFromExcel(String sheet,int row,int col) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream fis=new FileInputStream("./src/test/resources/testData/exceldata.xlsx");
		
		Workbook wkbook = WorkbookFactory.create(fis);
		
	return	wkbook.getSheet(sheet).getRow(row).getCell(col).getStringCellValue();
		
		
		
	}

}
