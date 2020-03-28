package corejavapackage;

//public class readingexcel {
//	static int rowcount = 0;
//
//	public static void main(String[] args) throws IOException, InvalidFormatException {
//		FileInputStream fis = new FileInputStream("C:\\My\\P\\Study\\javaselenium\\ExportExcel.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet("Input");
//		Row row = sh.getRow(2);
//		Cell cell = row.getCell(1);
//		System.out.println(cell);
//		String cellval = cell.getStringCellValue();
//		System.out.println(cellval);
//	}
//}
//======================================
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readingexcel {

	public void readExcel(String filePath, String fileName, String sheetName) throws IOException {

		// Create an object of File class to open xlsx file

		File file = new File(filePath + "\\" + fileName);

		// Create an object of FileInputStream class to read excel file

		FileInputStream inputStream = new FileInputStream(file);

		Workbook guru99Workbook = null;

		// Find the file extension by splitting file name in substring and getting only
		// extension name

		String fileExtensionName = fileName.substring(fileName.indexOf("."));

		// Check condition if the file is xlsx file

		if (fileExtensionName.equals(".xlsx")) {

			// If it is xlsx file then create object of XSSFWorkbook class

			guru99Workbook = new XSSFWorkbook(inputStream);

		}

		// Check condition if the file is xls file

		else if (fileExtensionName.equals(".xls")) {

			// If it is xls file then create object of XSSFWorkbook class

			guru99Workbook = new HSSFWorkbook(inputStream);

		}

		// Read sheet inside the workbook by its name

		Sheet guru99Sheet = guru99Workbook.getSheet(sheetName);

		// Find number of rows in excel file

		int rowCount = guru99Sheet.getLastRowNum() - guru99Sheet.getFirstRowNum();

		// Create a loop over all the rows of excel file to read it

		for (int i = 0; i < rowCount + 1; i++) {

			Row row = guru99Sheet.getRow(i);

			// Create a loop to print cell values in a row

			for (int j = 0; j < row.getLastCellNum(); j++) {

				// Print Excel data in console

				System.out.print(row.getCell(j).getStringCellValue() + "|| ");

			}

			System.out.println();

		}

	}

	// Main function is calling readExcel function to read data from excel file
	public static void main(String... strings) throws IOException {

		// Create an object of ReadGuru99ExcelFile class

		readingexcel objExcelFile = new readingexcel();

		// Prepare the path of excel file

		// String filePath = System.getProperty("user.dir") +
		// "\\src\\excelExportAndFileIO";
		String filePath = "C:\\My\\P\\Study\\javaselenium\\";
		// Call read file method of the class to read data

		objExcelFile.readExcel(filePath, "ExportExcel.xlsx", "Input");

	}

}