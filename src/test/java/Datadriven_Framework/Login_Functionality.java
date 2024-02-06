package Datadriven_Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Login_Functionality {

	public static void main(String[] args) throws Exception {
		FileInputStream file=new FileInputStream("C:\\Users\\dell\\Desktop\\Usercredentails.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		int totalrow=sheet.getLastRowNum();
		int totalcell=sheet.getRow(0).getLastCellNum();
		System.out.println("Number of rows:"+totalrow);
		System.out.println("Numbe rof cells:"+totalcell);
	}

}
