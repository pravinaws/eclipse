package sparsh.abstractComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.sound.sampled.TargetDataLine;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

public class ExcelReader
{	
	private FileInputStream fis;
	private FileOutputStream fileout;
	//private Workbook wb;
	private XSSFWorkbook wb;
	private Sheet sh;
	private Cell cell,cell1;
	private Row row;
	private CellStyle cellstyle;
	private Color mycolor;
	private String excelFilePath;
	private Map<String, Integer> columns = new HashMap<>();
	private List<String> ic;
	private List<String> ic1;
	public Properties prop;
	
	
	public List<String> setExcelFile(String ExcelPath, String SheetName) throws IOException
	{
		prop=new Properties();
		FileInputStream fisqa = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\sparsh\\resources\\application.properties");
		prop.load(fisqa);
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\sparsh\\resources\\"+prop.get("spring.profiles.active")+".properties");
//		prop.load(fisqa1);

		prop.load(fis);	
		String custID = prop.getProperty("custID");

		System.out.println("Customer ID: " + custID);
		
			fis = new FileInputStream(ExcelPath);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			sh = wb.getSheet(SheetName);
			ic=new ArrayList<>();
			ic1=new ArrayList<>();
			
			Iterator<Row> iterator = sh.iterator();
			Row nextRow = iterator.next();
			int rowCount = sh.getLastRowNum();
			int columnCount = nextRow.getLastCellNum();
//			System.out.println("row are: "+rowCount+" ,column count: "+ columnCount);
//			for (int i=1;i<=rowCount;i++)
//			{
//				if (sh.getRow(i).getCell(0).equals("10000001"))
//				{
//					System.out.println(sh.getRow(i).getCell(0));
//				}
//			}
		
//			for (int i=1;i<=rowCount;i++)
//			{
////				System.out.println("i val is: "+i);
//				cell = sh.getRow(i).getCell(0);
//		
//				System.out.println(String.valueOf((long)cell.getNumericCellValue()));
//				for (int j=i+1;j < rowCount;j++)
//				{
//					cell = sh.getRow(j).getCell(0);
//
//					System.out.println(String.valueOf((long)cell.getNumericCellValue()));
////					System.out.println(array[j]);
//					if (array[i]==array[j])
//						count=count+1;
//				}
//			}
			int count=0;
			for (int i=1;i<=rowCount;i++)
			{	
//				for (int j=0;j<columnCount;j++)
//				{
					cell = sh.getRow(i).getCell(0);
					cell1 = sh.getRow(i).getCell(1);
					
					String CellData = null;
					String CellData1 = null;
					switch(cell.getCellType())
					{
						case STRING: 
							CellData = cell.getStringCellValue();
							if (CellData.equals(custID))
							{
								CellData1 = cell1.getStringCellValue();
								count=count+1;
								ic1.add(CellData1);
							}
//							System.out.println(CellData);
							ic.add(CellData);
							break;
						case NUMERIC:
							if(DateUtil.isCellDateFormatted(cell))
							{
								CellData = String.valueOf(cell.getDateCellValue());
								if (CellData.equals(custID))
								{
									CellData1 = cell1.getStringCellValue();
									count=count+1;
									ic1.add(CellData1);
								}
//								System.out.println(CellData);
								ic.add(CellData);
							}
							else
							{
								CellData = String.valueOf((long)cell.getNumericCellValue());
								if (CellData.equals(custID))
								{
									CellData1 = cell1.getStringCellValue();
									count=count+1;
									ic1.add(CellData1);
								}
//								System.out.println(CellData);
								ic.add(CellData);
							}
							break;
						case BOOLEAN:
							CellData = Boolean.toString(cell.getBooleanCellValue());
//							System.out.println(CellData);
							ic.add(CellData);
							break;
						case BLANK:
							CellData = "";
//							System.out.println(CellData);
							ic.add(CellData);
							break;	
					}
//				}
			}
			System.out.println(ic1);
			System.out.println("COUNT IS: ====== "+count);
			return ic1;
	}
	
//	public static void main(String[] args) throws IOException
//	{
//		ExcelReader excel = new ExcelReader();
////		List<String> value=excel.setExcelFile(System.getProperty("user.dir")+"\\src\\test\\java\\sparsh\\data\\interactionChannel.xlsx", "interactionChannel");
////		System.out.println(value);
//		
//		List<String> value2=new ArrayList<>();
//		value2.add("DLMS");
//		value2.add("Digital - VCIP");
//		value2.add("Branch");
//		value2.add("Digital - VCIP");
//		value2.add("Test");
//		System.out.println(value2);
//		
////		boolean boolval = value.equals(value2);
////		System.out.println(boolval);
//	}	
}