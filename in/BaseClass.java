
package com.maven.in;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Table.Cell;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	static WebDriver driver;
	static Actions action;

	public static void browserConfigChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void Openurl(String url) {
		driver.get(url);
	}

	public static void Maximizewindow() {
		driver.manage().window().maximize();
	}

	public static void Quit() {
		driver.quit();
	}

	public static void Close() {
		driver.close();
	}

	public static WebElement LocatedById(String id) {
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;
	}

	public static WebElement LocatedByName(String name) {
		WebElement findElement = driver.findElement(By.name(name));
		return findElement;
	}

	public WebElement LocatedByClassName(String classname) {
		WebElement findElement = driver.findElement(By.className(classname));
		return findElement;
	}

	public static WebElement LocatedByxpath(String xpath) {
		WebElement findElement = driver.findElement(By.xpath(xpath));
		return findElement;
	}

	public static void Inputname(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void Click(WebElement element) {
		element.click();
	}

	public static void Gettext(WebElement element) {
		element.getText();
	}

	public static void text(String txt, WebElement text) {
		String attribute = text.getAttribute("value");
		System.out.println(txt + attribute);

	}

	public void mouseAction(WebElement element) {
		action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	public static void Alert() {
		org.openqa.selenium.Alert al = driver.switchTo().alert();
		al.accept();
	}

	public static void DragandDrop(WebElement element, WebElement element2) {
		action = new Actions(driver);
		action.dragAndDrop(element, element2).perform();
	}

	public void ContextClick(WebElement element) {
		action = new Actions(driver);
		action.contextClick(element).perform();
	}

	public static void wait(int value) throws InterruptedException {
		Thread.sleep(value);
	}

	public static void Takescreenshot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f = new File(path);
		FileUtils.copyFile(screenshotAs, f);
	}

	public static void DropDownValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
		System.out.println(value);
	}

	public static void DropDownIndex(WebElement element, int value) {
		Select select = new Select(element);
		select.selectByIndex(value);
		System.out.println(value);
	}

	public static void DropDownByvisibleText(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
		System.out.println(value);
	}

	public static String excelRead(String path, String sheet, int rowIndex, int cellIndex) throws IOException {
		String value = null;
		File file = new File(path);
		FileInputStream fin = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fin);
		org.apache.poi.ss.usermodel.Sheet s = workbook.getSheet(sheet);
		Row row = s.getRow(rowIndex);
		org.apache.poi.ss.usermodel.Cell cell = row.getCell(cellIndex);
		CellType celltype = cell.getCellType();
		System.out.println("CellTpe:" + celltype);
		switch (celltype) {
		case STRING:
			value = cell.getStringCellValue();
			System.out.println(value);

			break;

		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {

				java.util.Date date = cell.getDateCellValue();
				SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyy");
				value = dateformat.format(date);
				System.out.println(value);

			} else {
				double d = cell.getNumericCellValue();
				long l = (long) d;
				value = String.valueOf(l);
				System.out.println(value);
				break;

			}

		default:
			break;

		}

		return value;
	}

	public static void excelWrite(String path, String sheet, int row, int cell, String value) throws IOException {
		File f = new File(path);

		FileInputStream fin = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fin);

		Sheet s = w.getSheet(sheet);

		Row r = s.getRow(row);

		org.apache.poi.ss.usermodel.Cell c = r.getCell(cell);

		c.setCellValue(value);
		FileOutputStream fout = new FileOutputStream(f);
		w.write(fout);
	}

}
