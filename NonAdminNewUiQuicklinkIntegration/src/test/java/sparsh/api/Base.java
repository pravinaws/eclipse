package sparsh.api;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeClass;


import io.restassured.RestAssured;

//@Listeners(ExtentReportListner.class)
public class Base  {

	public static String currDir = System.getProperty("user.dir");
	public static Properties prop = new Properties();
	public FileInputStream fis;
//	public static XLS_Reader excel = new XLS_Reader(System.getProperty("user.dir") + "//testData//data.xlsx");

	//public static kmsTest kms = new kmsTest();
	
	
	protected static String kmsKey;

	@BeforeClass
	public void baseTest() throws IOException
	{
//		For ssl crt handling --------
		RestAssured.useRelaxedHTTPSValidation();
//-------------
		//	RestAssured.baseURI = "http://192.168.1.232";
		//	RestAssured.baseURI = FileAndEnv.envAndFile().get("ServerUrl");
		//	String port = FileAndEnv.envAndFile().get("portNo");
		//	RestAssured.port = Integer.parseInt(port);
/*
		fis = new FileInputStream(currDir + "//resources//qa.properties");
		
		
		System.out.println(fis);
		prop.load(fis);
		FileInputStream fisqa1 = new FileInputStream(System.getProperty("user.dir")+"/resources/"+prop.get("spring.profiles.active")+".properties");
		prop.load(fisqa1);
		
		*/
		FileInputStream fisqa = new FileInputStream(System.getProperty("user.dir")+"/resources/application.properties");
		prop.load(fisqa);
		
		FileInputStream fisqa1 = new FileInputStream(System.getProperty("user.dir")+"/resources/"+prop.get("spring.profiles.active")+".properties");
		prop.load(fisqa1);
		
		
		RestAssured.baseURI = prop.getProperty("ServerUrl");
//		int port = Integer.parseInt(prop.getProperty("portNo"));  
		kmsKey= prop.getProperty("kmsKeyVal");
//		RestAssured.port = port;

	}	
}