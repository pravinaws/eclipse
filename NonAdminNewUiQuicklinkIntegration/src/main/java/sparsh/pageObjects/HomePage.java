package sparsh.pageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import sparsh.abstractComponents.AbstractComponent;


public class HomePage {
	WebDriver driver;
	//	public Properties prop;
	public static Properties prop = new Properties();
	//	public Properties prop=new Properties();
	AbstractComponent abc = new AbstractComponent(driver);
	//    prop.load(abc.readProperty());
	/*
    prop.load(abc.readProperty());

	String keyArn= prop.getProperty("kmsKeyVal");

	final AwsCrypto crypto = AwsCrypto.builder().withCommitmentPolicy(CommitmentPolicy.RequireEncryptRequireDecrypt)
			.build();



	KmsMasterKeyProvider keyProvider = KmsMasterKeyProvider.builder().buildStrict(keyArn);
	 */
	//    Constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
	//	Webelemts
	@FindBy(xpath = "//*[@id=\"search-input\"]")
	WebElement searchTextBox;

	@FindBy(xpath = "//span[@class=\"ng-arrow-wrapper\"]")
	private WebElement SelectSearchType;

	@FindBy(xpath = "//div[@role=\"option\"]")
	private List<WebElement> options;

	@FindBy(xpath = "//div[@role=\"option\"]")
	private List<WebElement> SearchTypesList;

	@FindBy(xpath = "//input[@id=\"search-input\"]")
	private WebElement VarifyPlceholder;

	@FindBy(xpath = "//span//button[@type=\"submit\"][1]")
	private WebElement SearchBTn;

	@FindBy(xpath = "//span[@class=\"fonts\"]")
	private WebElement mobilenofielld;

	@FindBy(xpath = "(//*[text()=\"Sparsh Omni\"])[2]")
	private WebElement customerName;

	@FindBy(xpath = "//div[@role=\"alert\"]")
	private WebElement alert;

	@FindBy(xpath = "//span[text()=\"Customer ID\"]")
	private WebElement SelectCustIDOption;

	@FindBy(xpath="//p[@class=\"count\"]")
	private WebElement activities;

	@FindBy(xpath="(//h2[text()=\"Filters\"])[2]")
	private WebElement Filters;

	@FindBy(xpath = "//div[text()=\" You can’t use less than 5 characters \"]")
	private WebElement alertmsg;
	
	@FindBy(xpath = "//div[text()=\" You can’t use more than 35 characters \"]")
	private WebElement alerterror2;
	
	@FindBy(xpath = "//*[@aria-label=\"Customer ID should not be more than 9 digits\"]")
	private WebElement errorMsgForMoreThan9DigitCustId;

//	Webelements by suhas 
	
//	Webelemts
	
	@FindBy(xpath = "//div[@class=\"uer_login\"]")
	private WebElement ProfileLogo;

	@FindBy(xpath = "//div/div[@class=\"uer_login mr-2\"]/following-sibling::h3[1]")
	private WebElement nameofUser;

	@FindBy(xpath = "//span[text()=\"Employee ID:\"][1]")
	private WebElement userEmployeeID;

	@FindBy(xpath = "//span[text()=\"Role:\"][1]")
	private WebElement userRole;

	@FindBy(xpath = "//button[text()=\"Logout\"][1]")
	private WebElement LogoutBtn;
	
	@FindBy(xpath = "//span[text()=\"Mobile Number : ********0100\"]")
	private WebElement CheckMobMask;

	@FindBy(xpath = "(//p[contains(text(),'Activities found for this')])[2]")
	private WebElement ActivitySearchLine;

	@FindBy(xpath = "//div/h1[text()=\"Timeline\"]")
	private WebElement TimelineTag;

	@FindBy(xpath = "//div[@class=\"day_info\"]/span/following-sibling::span")
	private List<WebElement> SevenDays;

	@FindBy(xpath = "//div[@class=\"da_count h-100\"]")
	private List<WebElement> DayActivityCount;

	@FindBy(xpath = "//div[@class='col-auto d-lg-block filter_open']//span[@class='material-icons-outlined'][normalize-space()='arrow_forward_ios']")
	private WebElement FilterArrowBtn;

	@FindBy(xpath = "//div[@class='col-auto d-lg-block filter_open']//input[@id='search-input2']")
	private WebElement productPlaceholder;

	@FindBy(xpath = "(//h2[text()=\"Filters\"])[2]")
	private WebElement FilterHeadline;

	@FindBy(xpath = "(//h3[text()=\"Process Type:\"])[2]")
	private WebElement ProcessTypeTitle;

	@FindBy(xpath = "(//h3[text()=\"Product Type:\"])[2]")
	private WebElement ProductTypeTitle;

	@FindBy(xpath = "//div[@class=\"process_type_fields mb-4\"]//span[@class=\"field_label\"]")
	private List<WebElement> process_type_fields;

	

	@FindBy(xpath = "//h2[@class=\"col-auto d_info\"]")
	private List<WebElement> AllDisplyDates;

	@FindBy(xpath = "//span[@class=\"col-auto activity_time first_clm\"]")
	private List<WebElement> AllTimesDisplay;

//	@FindBy(xpath="(//div[@class=\"process_type_fields mb-4\"]//span[@class=\"field_label\"])[6]")
	@FindBy(xpath = "(//form[1]/div[1]/div[1]/label[1]/span[1])[2]")
	private WebElement SingleProcessType;

	@FindBy(xpath = "(//span[text()=\"Clear Filters\"])[2]")
	private WebElement ClearFilterTab;

	@FindBy(xpath = "(//span[text()=\"Apply Filters\"])[2]")
	private WebElement ApplyFilters;

	@FindBy(xpath = "//div[@class=\"product_type_fields\"]//span[@class=\"field_label\"]")
	private List<WebElement> Product_Type_fields;

	@FindBy(xpath = "(//div[@class=\"product_type_fields\"]//span[@class=\"field_label\"])[7]")
	private WebElement SingleProductType;

	@FindBy(xpath = "//div[@class='col-auto d-lg-block filter_open']//form[@class='filterContent ng-untouched ng-pristine ng-valid']")
	private WebElement Scrollbar;

	@FindBy(xpath = "//span[@class=\"fonts\"][1]")
	private WebElement MobileNoFiled;

	@FindBy(xpath = "(//span[@class=\"fonts\"])[2]")
	private WebElement EmailIDFiled;
	
//	date picker 
	
	@FindBy(xpath = "//*[@placeholder=\"Date Picker\"]")
	private WebElement datePicker;
	
	
	//	Important method using for login 
	public void goTo(String authkey, String data, String session) throws Exception {
		//		driver.get("https://192.168.1.211/sakshamform/saksham-login");
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		FileInputStream fisqa = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\sparsh\\resources\\application.properties");
		prop.load(fisqa);
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\sparsh\\resources\\"+prop.get("spring.profiles.active")+".properties");
		prop.load(fis);
		//		driver.manage().window().maximize();
		String url = prop.getProperty("ServerUrl")+(session+authkey+data);
		System.out.println("final url :"+url);
		driver.get(url);

	}

	// Test cases	
	public void validateApplicationVersion() throws Exception {		
		//			LinkedList<String> totalwindows = new LinkedList<String>(driver.getWindowHandles());
		//			LinkedList<String> tabs = new LinkedList<String>(driver.getWindowHandles());
		//			driver.switchTo().window(tabs.get(1));		
		//			Thread.sleep(2000);
		HomePage hp=new HomePage(driver);
		//			hp.getSearchTextBoxClick();
		String titleOfPage = driver.getTitle();
		System.out.println("titleOfPage"+titleOfPage);
		Thread.sleep(2000);
		searchTextBox.sendKeys("100000");	
	}

	public void ClickSearchType() throws InterruptedException, Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		SelectSearchType.click();
		Thread.sleep(2000);
		String expaected[] = { "Customer ID", "Mobile Number", "Email ID", "Application No.","Bar Code" };
		if (options.size() != expaected.length) {
			System.out.println("incorrct values");
		} else {
			for (int i = 0; i < options.size(); i++) {
				String actaulValues = options.get(i).getText();
				if (actaulValues.equalsIgnoreCase(expaected[i])) {
					Assert.assertTrue(true);

				} else {
					System.out.println("actual values are not match");
					Assert.assertTrue(false);
				}
			}
		}


	}

	public void SearchByCustID() throws InterruptedException, Exception {
		Thread.sleep(2000);
		SelectSearchType.click();
		SearchTypesList.get(0).click();
		Thread.sleep(2000);
		VarifyPlceholder.sendKeys("10000001");
		SearchBTn.click();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(customerName.isDisplayed(), true);
		/*
//			Email Id	
				VarifyPlceholder.sendKeys("");
				SearchBTn.click();
				sa.assertEquals(customerName.isDisplayed(), true);
//				Mobile no 	
					VarifyPlceholder.sendKeys("");
					SearchBTn.click();
					sa.assertEquals(customerName.isDisplayed(), true);		
		 */				
		sa.assertAll();		

	}

	public void VarifyAlertMesaage() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
		SearchBTn.click();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveToElement(alert);
		String alertmsg = alert.getText();
		Assert.assertEquals(alertmsg, "Please select search type and enter search input");

	}

	public void CopyPasteCustID() throws InterruptedException {
		Thread.sleep(2000);
		VarifyPlceholder.sendKeys("10000001");
		Actions act = new Actions(driver);
		act.doubleClick(VarifyPlceholder).build().perform();
		VarifyPlceholder.sendKeys(Keys.CONTROL, "a");
		VarifyPlceholder.sendKeys(Keys.CONTROL, "c");
		VarifyPlceholder.sendKeys(Keys.CONTROL, "v");
	}

	public void CheckByCustID() throws InterruptedException, Exception {
		driver.getCurrentUrl();
		System.out.println("Current url "+driver.getCurrentUrl());
		Thread.sleep(2000);
		SelectSearchType.click();
		SelectCustIDOption.click();
		VarifyPlceholder.sendKeys("10000001");
		SearchBTn.click();
		String status = activities.getText();
		//	boolean activitiesDisplay = status.contains("Activities found for");
		//	Assert.assertTrue(activitiesDisplay);
		boolean isDisplay = Filters.isDisplayed();
		Assert.assertTrue(isDisplay);
	}
	
	public void CheckByMobNo() throws InterruptedException, IOException {	
		SelectSearchType.click();
		Thread.sleep(2000);
		SearchTypesList.get(1).click();
		VarifyPlceholder.sendKeys("7986642220");
		SearchBTn.click();
			String status = activities.getText();
//			boolean activitiesDisplay = status.contains("Activities found for");
//			Assert.assertTrue(activitiesDisplay);
			boolean isDisplay = Filters.isDisplayed();
			Assert.assertTrue(isDisplay);
	}
	
	public void CheckByEmailID() throws InterruptedException, IOException {
			SelectSearchType.click();
			SearchTypesList.get(2).click();
			VarifyPlceholder.sendKeys("jasbavneet@gmail.com");
			Thread.sleep(2000);
			SearchBTn.click();
			Thread.sleep(2000);
			String status = activities.getText();
			boolean isDisplay = Filters.isDisplayed();
			Assert.assertTrue(isDisplay);
	}
	public void CheckByAppID() throws InterruptedException, IOException {
		Thread.sleep(2000);
			SelectSearchType.click();
			SearchTypesList.get(3).click();
			VarifyPlceholder.sendKeys("C1-00000031367545-C1");
			SearchBTn.click();
			String status = activities.getText();
			boolean isDisplay = Filters.isDisplayed();
			Assert.assertTrue(isDisplay);
	}
	
	public void CheckError(String valuelessthanthree) throws InterruptedException {
		Thread.sleep(2000);
		SelectSearchType.click();
		Thread.sleep(1000);
		SelectCustIDOption.click();
		VarifyPlceholder.sendKeys(valuelessthanthree);
		SearchBTn.click();
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.moveToElement(alertmsg);
		String msg = alertmsg.getText();
		Assert.assertEquals(msg, "You can’t use less than 5 characters");
	}
	
	public void CheckError2(String valuemorethanlimit) throws InterruptedException {
		Thread.sleep(2000);
		SelectSearchType.click();
		Thread.sleep(1000);
		SelectCustIDOption.click();
		Thread.sleep(2000);
		VarifyPlceholder.sendKeys("100000000000000000000000000000000000001");
		Thread.sleep(2000);
		SearchBTn.click();
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.moveToElement(errorMsgForMoreThan9DigitCustId);
		String msg = errorMsgForMoreThan9DigitCustId.getText();
		Assert.assertEquals(msg, "Customer ID should not be more than 9 digits");
	}
	
//	Implemnted by Suhas
	
	public void check_Name_ID_Role_logout_Isdisplayed() throws InterruptedException {
		Thread.sleep(2000);
		String CustID = "10000001";
//		String MobileNO = Common_Utility.MobileNO();
//		String EmailID = Common_Utility.EmailID();
//		String ApplicationNo = Common_Utility.ApplicationNo();

		if (CustID != null) {

			SelectSearchType.click();
			SearchTypesList.get(0).click();
			VarifyPlceholder.sendKeys(CustID);
			SearchBTn.click();

//		} else if (MobileNO != null) {
//			SelectSearchType.click();
//			Thread.sleep(2000);
//			SearchTypesList.get(1).click();
//			VarifyPlceholder.sendKeys(MobileNO);
//			SearchBTn.click();
//		} else if (EmailID != null) {
//			SelectSearchType.click();
//			SearchTypesList.get(2).click();
//			VarifyPlceholder.sendKeys(EmailID);
//			SearchBTn.click();
//		} else if (ApplicationNo != null) {
//			SelectSearchType.click();
//			SearchTypesList.get(3).click();
//			VarifyPlceholder.sendKeys(MobileNO);
//			SearchBTn.click();
//		}
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
     	js.executeScript("arguments[0].click();", ProfileLogo);
	//	ProfileLogo.click();
		Thread.sleep(2000);
		boolean nameisdiplayed = nameofUser.isDisplayed();
		Assert.assertTrue(nameisdiplayed);
		boolean EmpIDdiplayed = nameofUser.isDisplayed();
		Assert.assertTrue(EmpIDdiplayed);
		boolean userRolediplayed = userRole.isDisplayed();
		Assert.assertTrue(userRolediplayed);
		boolean LogoutBtndiplayed = LogoutBtn.isDisplayed();
		Assert.assertTrue(LogoutBtndiplayed);

	}
	}
	public void CheckMobileNoMasked() throws InterruptedException{
		Thread.sleep(2000);
		String CustID ="10000001";
//		String MobileNO = Common_Utility.MobileNO();
//		String EmailID = Common_Utility.EmailID();
//		String ApplicationNo = Common_Utility.ApplicationNo();

		if (CustID != null) {
			SelectSearchType.click();
			SearchTypesList.get(0).click();
			VarifyPlceholder.sendKeys(CustID);
			SearchBTn.click();
		}
//		} else if (MobileNO != null) {
//			SelectSearchType.click();
//			Thread.sleep(2000);
//			SearchTypesList.get(1).click();
//			VarifyPlceholder.sendKeys(MobileNO);
//			SearchBTn.click();
//		} else if (EmailID != null) {
//			SelectSearchType.click();
//			SearchTypesList.get(2).click();
//			VarifyPlceholder.sendKeys(EmailID);
//			SearchBTn.click();
//		} else if (ApplicationNo != null) {
//			SelectSearchType.click();
//			SearchTypesList.get(3).click();
//			VarifyPlceholder.sendKeys(ApplicationNo);
//			SearchBTn.click();
//		}
		String mobNo = MobileNoFiled.getText();
		String lastten = mobNo.substring(Math.max(0, mobNo.length() - 10));
		Pattern pat = Pattern.compile("\\*{6}\\d{4}");
		Matcher mat = pat.matcher(lastten);
		if (mat.matches()) {
			System.out.println("mobile number is masked except last four digit");
		} else {
			System.out.println("mobile number is not masked/not available  last four digit");
			Assert.assertTrue(false);
		}
	}
	public void CheckemailMasked() throws InterruptedException{

		Thread.sleep(2000);
		String CustID = "10000001";
//		String MobileNO = Common_Utility.MobileNO();
//		String EmailID = Common_Utility.EmailID();
//		String ApplicationNo = Common_Utility.ApplicationNo();

		if (CustID != null) {
			SelectSearchType.click();
			SearchTypesList.get(0).click();
			VarifyPlceholder.sendKeys(CustID);
			SearchBTn.click();

		} 
//		else if (MobileNO != null) {
//			SelectSearchType.click();
//			Thread.sleep(2000);
//			SearchTypesList.get(1).click();
//			VarifyPlceholder.sendKeys(MobileNO);
//			System.out.println(MobileNO);
//			SearchBTn.click();
//		} else if (EmailID != null) {
//			SelectSearchType.click();
//			SearchTypesList.get(2).click();
//			VarifyPlceholder.sendKeys(EmailID);
//			System.out.println(EmailID);
//			SearchBTn.click();
//		} else if (ApplicationNo != null) {
//			SelectSearchType.click();
//			SearchTypesList.get(3).click();
//			VarifyPlceholder.sendKeys(ApplicationNo);
//			System.out.println(ApplicationNo);
//			SearchBTn.click();
//		}

		String email = EmailIDFiled.getText();
		String lastten = email.substring(Math.max(0, email.length() - 10));
		String Firstfour = lastten.substring(0, 4);
		String lastSix = lastten.substring(lastten.length() - 6);

		if (Firstfour.equals("****") && !lastSix.contains("*")) {
			Assert.assertTrue(true);

		} else {
			System.out.println("email is not available or not match with condition");
		}
	}
	public void ActivitiesAreDisplyed() throws InterruptedException{

		Thread.sleep(2000);
		String CustID = "10000001";
//		String MobileNO = Common_Utility.MobileNO();
//		String EmailID = Common_Utility.EmailID();
//		String ApplicationNo = Common_Utility.ApplicationNo();

		if (CustID != null) {
			SelectSearchType.click();
			SearchTypesList.get(0).click();
			VarifyPlceholder.sendKeys(CustID);
			SearchBTn.click();

		} 
//		else if (MobileNO != null) {
//			SelectSearchType.click();
//			Thread.sleep(2000);
//			SearchTypesList.get(1).click();
//			VarifyPlceholder.sendKeys(MobileNO);
//			SearchBTn.click();
//		} else if (EmailID != null) {
//			SelectSearchType.click();
//			SearchTypesList.get(2).click();
//			VarifyPlceholder.sendKeys(EmailID);
//			SearchBTn.click();
//		} else if (ApplicationNo != null) {
//			SelectSearchType.click();
//			SearchTypesList.get(3).click();
//			VarifyPlceholder.sendKeys(ApplicationNo);
//			SearchBTn.click();
//		}

   Thread.sleep(2000);		
  String ActivityText = ActivitySearchLine.getText();
		boolean status1 = ActivityText.contains("Activities found for");
		Assert.assertTrue(status1);
		boolean status = TimelineTag.isDisplayed();
		if (status == true) {
			System.out.println("activities are display");
		} else {
			System.out.println("no acivities found please check");
			Assert.assertTrue(false);
		}

	}
	public void CheckSevenDayWindow() throws InterruptedException {

		Thread.sleep(2000);
		String CustID = "1000001";
//		String MobileNO = Common_Utility.MobileNO();
//		String EmailID = Common_Utility.EmailID();
//		String ApplicationNo = Common_Utility.ApplicationNo();
		if (CustID != null) {
			SelectSearchType.click();
			SearchTypesList.get(0).click();
			VarifyPlceholder.sendKeys(CustID);
			SearchBTn.click();

		}
//		else if (MobileNO != null) {
//			SelectSearchType.click();
//			Thread.sleep(2000);
//			SearchTypesList.get(1).click();
//			VarifyPlceholder.sendKeys(MobileNO);
//			SearchBTn.click();
//		} else if (EmailID != null) {
//			SelectSearchType.click();
//			SearchTypesList.get(2).click();
//			VarifyPlceholder.sendKeys(EmailID);
//			SearchBTn.click();
//		} else if (ApplicationNo != null) {
//			SelectSearchType.click();
//			SearchTypesList.get(3).click();
//			VarifyPlceholder.sendKeys(ApplicationNo);
//			SearchBTn.click();
//		}

		ArrayList<String> days = new ArrayList<String>();

		for (int i = 0; i < SevenDays.size(); i++) {
			String dates = SevenDays.get(i).getText();
			days.add(dates);
		}
		ArrayList<String> activity = new ArrayList<String>();
		for (int j = 0; j < DayActivityCount.size(); j++) {
			String daywise = DayActivityCount.get(j).getText();
			activity.add(daywise);
		}
		if (days != null && activity != null) {
			System.out.println("dates ,times and activities are diaplyed");

		} else {
			System.out.println("something missing date,time or activity ");

		}
		for (int i = 0; i < days.size(); i++) {
			System.out.println(days.get(i) + " " + activity.get(i));
		}

	}
	public void ClickOnFilterFormArrow() throws InterruptedException {

		String CustID = "10000001";
//		String MobileNO = Common_Utility.MobileNO();
//		String EmailID = Common_Utility.EmailID();
//		String ApplicationNo = Common_Utility.ApplicationNo();

		if (CustID != null) {
			SelectSearchType.click();
			SearchTypesList.get(0).click();
			VarifyPlceholder.sendKeys(CustID);
			SearchBTn.click();

		}
//		else if (MobileNO != null) {
//			SelectSearchType.click();
//			Thread.sleep(2000);
//			SearchTypesList.get(1).click();
//			VarifyPlceholder.sendKeys(MobileNO);
//			SearchBTn.click();
//		} else if (EmailID != null) {
//			SelectSearchType.click();
//			SearchTypesList.get(2).click();
//			VarifyPlceholder.sendKeys(EmailID);
//			SearchBTn.click();
//		} else if (ApplicationNo != null) {
//			SelectSearchType.click();
//			SearchTypesList.get(3).click();
//			VarifyPlceholder.sendKeys(ApplicationNo);
//			SearchBTn.click();
//		}
		Thread.sleep(2000);
		boolean clickable = FilterArrowBtn.isEnabled();
		Assert.assertTrue(clickable);
	}
	public void CheckFilterHeadline() throws InterruptedException {
		String CustID = "10000001";
//		String MobileNO = Common_Utility.MobileNO();
//		String EmailID = Common_Utility.EmailID();
//		String ApplicationNo = Common_Utility.ApplicationNo();

		if (CustID != null) {
			
			SelectSearchType.click();
			SearchTypesList.get(0).click();
			VarifyPlceholder.sendKeys(CustID);
			SearchBTn.click();

		}
//		else if (MobileNO != null) {
//			SelectSearchType.click();
//			Thread.sleep(2000);
//			SearchTypesList.get(1).click();
//			VarifyPlceholder.sendKeys(MobileNO);
//			SearchBTn.click();
//		} else if (EmailID != null) {
//			SelectSearchType.click();
//			SearchTypesList.get(2).click();
//			VarifyPlceholder.sendKeys(EmailID);
//			SearchBTn.click();
//		} else if (ApplicationNo != null) {
//			SelectSearchType.click();
//			SearchTypesList.get(3).click();
//			VarifyPlceholder.sendKeys(ApplicationNo);
//			SearchBTn.click();
//		}
		Thread.sleep(2000);
		String text = FilterHeadline.getText();
		Assert.assertEquals(text, "Filters");
	}
	public void CheckProcessProductTitlesDispalyed() throws InterruptedException{
		String CustID = "10000001";
//		String MobileNO = Common_Utility.MobileNO();
//		String EmailID = Common_Utility.EmailID();
//		String ApplicationNo = Common_Utility.ApplicationNo();

		if (CustID != null) {
			Thread.sleep(2000);
			SelectSearchType.click();
			SearchTypesList.get(0).click();
			VarifyPlceholder.sendKeys(CustID);
			SearchBTn.click();

		} 
//		else if (MobileNO != null) {
//			SelectSearchType.click();
//			Thread.sleep(2000);
//			SearchTypesList.get(1).click();
//			VarifyPlceholder.sendKeys(MobileNO);
//			SearchBTn.click();
//		} else if (EmailID != null) {
//			SelectSearchType.click();
//			SearchTypesList.get(2).click();
//			VarifyPlceholder.sendKeys(EmailID);
//			SearchBTn.click();
//		} else if (ApplicationNo != null) {
//			SelectSearchType.click();
//			SearchTypesList.get(3).click();
//			VarifyPlceholder.sendKeys(ApplicationNo);
//			SearchBTn.click();
//		}
		Thread.sleep(2000);
		String process = ProcessTypeTitle.getText();
		Assert.assertEquals(process, "Process Type:");
		String product1 = ProductTypeTitle.getText();
		Assert.assertEquals(product1, "Product Type:");
	}
	public void CheckClearApplyFilterTabs() throws InterruptedException{
		String CustID ="10000001";
//		String MobileNO = Common_Utility.MobileNO();
//		String EmailID = Common_Utility.EmailID();
//		String ApplicationNo = Common_Utility.ApplicationNo();

		if (CustID != null) {
			SelectSearchType.click();
			SearchTypesList.get(0).click();
			VarifyPlceholder.sendKeys(CustID);
			SearchBTn.click();

		} 
//		else if (MobileNO != null) {
//			SelectSearchType.click();
//			Thread.sleep(2000);
//			SearchTypesList.get(1).click();
//			VarifyPlceholder.sendKeys(MobileNO);
//			SearchBTn.click();
//		} else if (EmailID != null) {
//			SelectSearchType.click();
//			SearchTypesList.get(2).click();
//			VarifyPlceholder.sendKeys(EmailID);
//			SearchBTn.click();
//		} else if (ApplicationNo != null) {
//			SelectSearchType.click();
//			SearchTypesList.get(3).click();
//			VarifyPlceholder.sendKeys(ApplicationNo);
//			SearchBTn.click();
//		}
		Thread.sleep(2000);
		boolean clearfilerdisplay = ClearFilterTab.isEnabled();
		Assert.assertTrue(clearfilerdisplay);
		boolean applyfilerdisply = ApplyFilters.isEnabled();
		Assert.assertTrue(applyfilerdisply);
	}
	public void CheckProcessType() throws InterruptedException{
		String CustID ="10000001";
//		String MobileNO = Common_Utility.MobileNO();
//		String EmailID = Common_Utility.EmailID();
//		String ApplicationNo = Common_Utility.ApplicationNo();

		if (CustID != null) {
			SelectSearchType.click();
			SearchTypesList.get(0).click();
			VarifyPlceholder.sendKeys(CustID);
			SearchBTn.click();

		} 
//		else if (MobileNO != null) {
//			SelectSearchType.click();
//			Thread.sleep(2000);
//			SearchTypesList.get(1).click();
//			VarifyPlceholder.sendKeys(MobileNO);
//			SearchBTn.click();
//		} else if (EmailID != null) {
//			SelectSearchType.click();
//			SearchTypesList.get(2).click();
//			VarifyPlceholder.sendKeys(EmailID);
//			SearchBTn.click();
//		} else if (ApplicationNo != null) {
//			SelectSearchType.click();
//			SearchTypesList.get(3).click();
//			VarifyPlceholder.sendKeys(ApplicationNo);
//			SearchBTn.click();
//		}
		List<String> UIProducts = new ArrayList<String>();

		for (WebElement product : process_type_fields) {
			UIProducts.add(product.getText());

		}
		if (UIProducts != null) {
			System.out.println(UIProducts);

		}

	}
	public void CheckProductType() throws InterruptedException {
		String CustID ="10000001";
//		String MobileNO = Common_Utility.MobileNO();
//		String EmailID = Common_Utility.EmailID();
//		String ApplicationNo = Common_Utility.ApplicationNo();

		if (CustID != null) {
			
			SelectSearchType.click();
			SearchTypesList.get(0).click();
			VarifyPlceholder.sendKeys(CustID);
			SearchBTn.click();

		} 
//		else if (MobileNO != null) {
//			SelectSearchType.click();
//			Thread.sleep(2000);
//			SearchTypesList.get(1).click();
//			VarifyPlceholder.sendKeys(MobileNO);
//			SearchBTn.click();
//		} else if (EmailID != null) {
//			SelectSearchType.click();
//			SearchTypesList.get(2).click();
//			VarifyPlceholder.sendKeys(EmailID);
//			SearchBTn.click();
//		} else if (ApplicationNo != null) {
//			SelectSearchType.click();
//			SearchTypesList.get(3).click();
//			VarifyPlceholder.sendKeys(ApplicationNo);
//			SearchBTn.click();
//		}
		Thread.sleep(2000);
//		ArrayList<String> AllProductFields=new ArrayList<String>();
//		AllProductFields.add("Savings Account");
//		AllProductFields.add("Credit Card Pin");
//		AllProductFields.add("Replacement Card");
//		AllProductFields.add("Credit Card");
//		AllProductFields.add("Debit Card");
//		AllProductFields.add("LOANS");

		List<String> UIProducts = new ArrayList<String>();

		for (WebElement product : Product_Type_fields) {
			UIProducts.add(product.getText());

		}
		if (UIProducts != null) {
			System.out.println(UIProducts);
		} else {
			System.out.println("No productTypes");
		}

	}
	public void CheckFilterScrollbarScrollable() throws InterruptedException{

		Thread.sleep(2000);
		String CustID = "10000001";
//		String MobileNO = Common_Utility.MobileNO();
//		String EmailID = Common_Utility.EmailID();
//		String ApplicationNo = Common_Utility.ApplicationNo();

		if (CustID != null) {
			SelectSearchType.click();
			SearchTypesList.get(0).click();
			VarifyPlceholder.sendKeys(CustID);
			SearchBTn.click();

		}
//		else if (MobileNO != null) {
//			SelectSearchType.click();
//			Thread.sleep(2000);
//			SearchTypesList.get(1).click();
//			VarifyPlceholder.sendKeys(MobileNO);
//			SearchBTn.click();
//		} else if (EmailID != null) {
//			SelectSearchType.click();
//			SearchTypesList.get(2).click();
//			VarifyPlceholder.sendKeys(EmailID);
//			SearchBTn.click();
//		} else if (ApplicationNo != null) {
//			SelectSearchType.click();
//			SearchTypesList.get(3).click();
//			VarifyPlceholder.sendKeys(ApplicationNo);
//			SearchBTn.click();
//}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		long scrollHeight = (long) js.executeScript("return arguments[0].scrollHeight", Scrollbar);
		System.out.println(scrollHeight);
		long clientHeight = (long) js.executeScript("return arguments[0].clientHeight", Scrollbar);
		System.out.println(clientHeight);
		boolean isscroll = scrollHeight > clientHeight;
		if (isscroll == true) {
			System.out.println("scroll bar is scrollable");
			Assert.assertTrue(isscroll);
		} else {
			System.out.println("scroll bar is not scrollable");
		}
	}


//	public void SearchByCustID() throws InterruptedException, Exception {
//
//		String CustID = Common_Utility.CustID();
//		if (CustID != null) {
//			Thread.sleep(2000);
//			SelectSearchType.click();
//			SearchTypesList.get(0).click();
//			VarifyPlceholder.sendKeys(CustID);
//			SearchBTn.click();
//			boolean status = mobilenofielld.isDisplayed();
//			Assert.assertTrue(status);
//		} else {
//			System.out.println("this test case will  execute with  custID ");
//		}
//	}


	
	
	public void getDatePicker() throws Exception {
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
		datePicker.click();
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(datePicker.isDisplayed());
		sa.assertTrue(datePicker.isEnabled());
		sa.assertAll();
	}
	
	
	}





