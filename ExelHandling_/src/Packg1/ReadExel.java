	package Packg1;
	
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	
	import org.apache.poi.hssf.usermodel.HSSFCell;
	import org.apache.poi.hssf.usermodel.HSSFRow;
	import org.apache.poi.hssf.usermodel.HSSFSheet;
	import org.apache.poi.hssf.usermodel.HSSFWorkbook;
	
	public class ReadExel {
	
		public static void main(String[] args) throws IOException {
			
			String Filepath="TestData/DataSheet.xls";
			File f=new File(Filepath);
			
			FileInputStream fis=new FileInputStream(f);
			
			HSSFWorkbook book=new HSSFWorkbook(fis);
			
			HSSFSheet sheet=book.getSheet("Sheet1");
			
			HSSFRow row=sheet.getRow(0);
			
			HSSFCell cell=row.getCell(0);
			
			String cellvalue=cell.getStringCellValue();
			
			System.out.println(cellvalue);
				
		}
	
	}
