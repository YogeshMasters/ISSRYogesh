package Com.Utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ExcelDataProvider {

	public static String getExcelData(int row, int cell) throws Exception {
		String data;
		FileInputStream excel = new FileInputStream("D:\\eclipse_yogesh\\Eclipse_23\\Yogesh_Workspace\\ISSR\\TestData\\CSBC_ExcelData.xlsx");
		Sheet sheet1 = WorkbookFactory.create(excel).getSheet("Sheet1");
		
		try {
		
		
		data = sheet1.getRow(row).getCell(cell).getStringCellValue();
		}
		catch(Exception e) {
		long intdata = (long) sheet1.getRow(row).getCell(cell).getNumericCellValue();
		data = ""+intdata;
		}
		return data;
		
	}
	
	public static void getScreenShot(WebDriver driver) throws Exception {
		
		File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File d = new File("D:\\eclipse_yogesh\\Eclipse_23\\Yogesh_Workspace\\ISSR\\Screenshot\\ss.png");
		FileUtils.copyFile(s, d);
		
	}
	
}
