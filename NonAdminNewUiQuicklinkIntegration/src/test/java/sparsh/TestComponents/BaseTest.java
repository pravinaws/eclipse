package sparsh.TestComponents;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import com.amazonaws.encryptionsdk.AwsCrypto;
import com.amazonaws.encryptionsdk.CommitmentPolicy;
import com.amazonaws.encryptionsdk.kms.KmsMasterKeyProvider;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.config.HttpClientConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;
import io.restassured.path.json.JsonPath;
import sparsh.abstractComponents.AbstractComponent;
import sparsh.api.AutoLogin;
import sparsh.api.Base;
import sparsh.api.GetappAuth;
import sparsh.config.HeaderConfigs;
import sparsh.pageObjects.HomePage;

	
public class BaseTest extends Base {
	public WebDriver driver;
	
	public HomePage HPage;
	public Properties prop;

	static GetappAuth gci = new GetappAuth();
	public static final String requestTime = String.valueOf(new Date().getTime());
	public static final  String key = gci.generateKeyfromRequestTime(requestTime);
	public static final  String rTime = key.substring(0, 32);

	public WebDriver initializeDriver() throws Exception {
		// KMS related values
		// String keyArn =
		// "arn:aws:kms:ap-south-1:792227409305:key/2c606643-65d7-498a-b21b-28447b255cfc";
		String keyArn = null;

		// properties class
//		prop=new Properties();
		// FileInputStream fis=new
		// FileInputStream("C:\\Users\\NQE00371\\eclipse-workspace\\SeleniumFrameworkDesign\\src\\main\\java\\rahulshettyacademy\\resources\\GlobalData.properties");
		// System.out.println(System.getProperty("user.dir"));

//		FileInputStream fisqa = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\sparsh\\resources\\application.properties");
//		prop.load(fisqa);
//		
//		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\sparsh\\resources\\"+prop.get("spring.profiles.active")+".properties");
////		prop.load(fisqa1);
//		prop.load(fis);
		prop = new Properties();
		AbstractComponent abc = new AbstractComponent(driver);
		prop.load(abc.readProperty());

		String browserName = System.getProperty("browser") != null ? System.getProperty("browser")
				: prop.getProperty("browser");
		// String browserName=prop.getProperty("browser");

		String custID = System.getProperty("custID");
		keyArn = prop.getProperty("kmsKeyVal");
		final AwsCrypto crypto = AwsCrypto.builder().withCommitmentPolicy(CommitmentPolicy.RequireEncryptRequireDecrypt)
				.build();
		KmsMasterKeyProvider keyProvider = KmsMasterKeyProvider.builder().buildStrict(keyArn);

		if (browserName.contains("chrome")) {
			/*Local Setup 
			WebDriverManager.chromedriver().setup();
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\nqe00505\\NewUiKaliedoscope\\NonAdminNewUiQuicklinkIntegration\\Drivers\\Chrome driver\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			options.setAcceptInsecureCerts(true);
			
//		*/

//			String chromePath="C:\\Program Files\\chromedriver\\chromedriver.exe";
//			System.setProperty("webdriver.chrome.driver",chromePath);
//			if (browserName.contains("headless"))
//			{
//				options.addArguments("headless");
//			}
		/*Local Set Up
			driver = new ChromeDriver(options);
//			driver = new ChromeDriver();
			driver.manage().window().setSize(new Dimension(1440, 900));
			options.addArguments("--disable-dev-shm-usage");// helps to run in full screen
	*/
//		/*
//		 * /usr/local/bin/chromedriver -- JENKINS SETUP
//			 System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chrome-linux64");
			 
			 DesiredCapabilities dc = new DesiredCapabilities(); 
			  dc.setAcceptInsecureCerts(true); 
			  ChromeOptions options = new ChromeOptions();
			  options.setAcceptInsecureCerts(true); // driver = new
//			  ChromeDriver(handlingSSL);
			  options.addArguments("headless"); //
			  options.merge(dc); driver = new ChromeDriver(options); //
//	 */

		}
		// else if (browserName.equalsIgnoreCase("firefox"))
		// {
		// System.setProperty("webdriver.gecko.driver", "C:\\Program
		// Files\\geckodriver\\geckodriver.exe");
		//// FirefoxOptions firefoxOptions = new FirefoxOptions();
		//// firefoxOptions.setCapability("marionette", true);
		// driver = new FirefoxDriver();
		//// WebDriverManager.firefoxdriver().setup();
		//// driver=new FirefoxDriver();
		// }
		else if (browserName.equalsIgnoreCase("edge")) {
			String edgePath = "C:\\Program Files\\edgedriver\\msedgedriver.exe";
			System.setProperty("webdriver.edge.driver", edgePath);
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.setAcceptInsecureCerts(true);
//			String edgePath="C:\\Program Files\\edgedriver\\msedgedriver.exe";
//			System.setProperty("webdriver.edge.driver",edgePath);
			driver = new FirefoxDriver();
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
	}

	public List<HashMap<String, String>> getJsonDataToMap(String filePath) throws IOException // this function reads the
																								// data from json file
	{
		// read json to string
		String jsoncontents = FileUtils.readFileToString(new File(filePath), StandardCharsets.UTF_8);

		// string to HashMap through "Jackson Databind" dependency
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, String>> data = mapper.readValue(jsoncontents,
				new TypeReference<List<HashMap<String, String>>>() {
				});
		return data;
	}

	// Below is getscreenshot method
	public String getScreenshot(String testcaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "//reports//" + testcaseName + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir") + "//reports//" + testcaseName + ".png";
	}

	@BeforeMethod(alwaysRun = true)
	public HomePage launchApplication() throws Exception {
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver = initializeDriver();
//		lPage = new Login(driver);
		HPage = new HomePage(driver);
		AutoLogin autoDetails = generateAutoLogin();
		
		HPage.goTo(autoDetails.getAuthKey(),autoDetails.getData(),autoDetails.getSession());
		return HPage; // returning the landing page object so that we can call the launch application
						// from main test scriptset
	}

	private AutoLogin generateAutoLogin() {
		AutoLogin login = new AutoLogin();
		try {
		String val1 = gci.appAuth();
		
//		RestAssured.baseURI = "https://192.168.1.232:8000/appauth";
		RestAssured.useRelaxedHTTPSValidation();
		
//	/* working 	
		RestAssuredConfig config = RestAssured.config()
			    .sslConfig(SSLConfig.sslConfig().relaxedHTTPSValidation());
//*/
		
		RestAssured.config = RestAssured.config().httpClient(HttpClientConfig.httpClientConfig()
			    .setParam("http.connection.timeout", 5000)
			    .setParam("http.socket.timeout", 5000));
		
//		String response = RestAssured.given().when().headers(HeaderConfigs.defaultHeaders()).body(val1).when()
//				.post("https://192.168.1.232:8000/appauth").asString();
	
		String response = RestAssured.given().config(config).log().all()
			    .when().headers("Content-Type","application/json")
			    .body(val1)
			    .post("https://192.168.1.211:443/appauth")
			    .then().log().all()
			    .extract().asString();
	
			  //  Block of code to try
			
		System.out.println("test ng kaleidoscope :" + response);
		
		JsonPath js = new JsonPath(response);
		String publicKey = js.getString("key");
		System.out.println("publicKey "+publicKey);

		String uniqueId = js.getString("uniqueId");
		System.out.println("uniqueId "+uniqueId);

		String session = "session=" + (uniqueId + requestTime);
		System.out.println("session "+session);

		String data = "&data=" + (gci.jsonData(uniqueId));
		System.out.println("data "+data );

		String authKey = "&authKey=" + (gci.encryptAesGenerateKey(key, publicKey));
		login.setData(data);
		login.setSession(session);
		login.setAuthKey(authKey);
		}
		catch(Exception e) {
//			log.error(ExceptionUtils.getRootCauseMessage(e));
			e.printStackTrace();
			}
		return login;
		
	}

	private AutoLogin generateAutoLogin2() {
		AutoLogin login = new AutoLogin();
		
		
		String val1 = gci.appAuth();
		
//		RestAssured.baseURI = "https://192.168.1.232:8000/appauth";
		RestAssured.useRelaxedHTTPSValidation();
		
//	/* working 	
		RestAssuredConfig config = RestAssured.config()
			    .sslConfig(SSLConfig.sslConfig().relaxedHTTPSValidation());
//*/
		RestAssured.config = RestAssured.config().httpClient(HttpClientConfig.httpClientConfig()
			    .setParam("http.connection.timeout", 5000)
			    .setParam("http.socket.timeout", 5000));
		
//		String response = RestAssured.given().when().headers(HeaderConfigs.defaultHeaders()).body(val1).when()
//				.post("https://192.168.1.232:8000/appauth").asString();
	
		String response = RestAssured.given().config(config).log().all()
			    .when().headers(HeaderConfigs.defaultHeaders())
			    .body(val1)
			    .post("https://192.168.1.211:443/appauth")
			    .then().log().all()
			    .extract().asString();
	
			  //  Block of code to try
			
		System.out.println("test ng kaleidoscope :" + response);
		JsonPath js = new JsonPath(response);
		String publicKey = js.getString("key");

		String uniqueId = js.getString("uniqueId");

		String session = "session=" + (uniqueId + requestTime);

		String data = "&data=" + (gci.jsonData(uniqueId));

		String authKey = "&authKey=" + (gci.encryptAesGenerateKey(key, publicKey));
		login.setData(data);
		login.setSession(session);
		login.setAuthKey(authKey);
		return login;

	}
	
}
