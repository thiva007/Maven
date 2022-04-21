package com.maven.in;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sheet {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx");
		FileInputStream stream = new FileInputStream (file);
		Workbook workbook = new XSSFWorkbook(stream);
		org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet("details");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				//System.out.println(cell);
	CellType type = cell.getCellType();
	switch (type) {
	case STRING:
	String text = cell.getStringCellValue();
	System.out.println(text);
		
	break;
//	case NUMERIC:
//		double d = cell.getNumericCellValue();
//		BigDecimal b = BigDecimal.valueOf(d);
//		String num = b.toString();
//		System.out.println(num);
//		break;
	case NUMERIC:
	if (DateUtil.isCellDateFormatted(cell)) {
		
		Date date = cell.getDateCellValue();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyy");
		String format = dateformat.format(date);
		System.out.println(format);
		
	}
	else {
		double d = cell.getNumericCellValue();
	BigDecimal b = BigDecimal.valueOf(d);
	String num = b.toString();
	System.out.println(num);
	break;
		
		
	}
	

	default:
		break;
	
			
		} {
			
		}
	}
	
		}
		
	}
}
