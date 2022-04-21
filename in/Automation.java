package com.maven.in;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation {
public static void main(String[] args) throws IOException  {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	WebElement clk = driver.findElement(By.id("Skills"));
	
	
	Select select = new Select(clk);
	List<WebElement> options = select.getOptions();

	for (int i = 0; i < options.size(); i++) {
		WebElement ele = options.get(i);
		
		
		String text = ele.getText();
		System.out.println(text);
	
		
	
	
	
	File F = new File("C:\\Users\\Thiva\\eclipse-workspace\\MavenProject\\excel\\detail.xlsx");
	FileInputStream fin = new FileInputStream(F);
	Workbook w = new XSSFWorkbook(fin);
	
	Sheet sheet = w.getSheet("Automation");
	
	Row row = sheet.createRow(0);
	Cell Cell = row.createCell(78);
	
	

	FileOutputStream out = new FileOutputStream(F);
	w.write(out);
	System.out.println("Done......");
}}	
}
