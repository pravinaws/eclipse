package sparsh.tests;

import java.io.IOException;
import java.util.List;

import sparsh.abstractComponents.ExcelReader;

import java.util.ArrayList;

public class Test
{	
	public static void main(String[] args) throws IOException
	{
		ExcelReader excel = new ExcelReader();
		List<String> value=excel.setExcelFile(System.getProperty("user.dir")+"\\src\\test\\java\\sparsh\\data\\interactionChannel.xlsx", "interactionChn");
//		System.out.println(value);
		
		List<String> value2=new ArrayList<>();
		value2.add("DLMS");
		value2.add("Digital - VCIP");
		value2.add("Branch");
//		value2.add("Digital - VCIP");
//		value2.add("Test");
//		System.out.println(value2);
		
		boolean boolval = value.equals(value2);
		System.out.println(boolval);
	}
}