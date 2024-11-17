package sparsh.pageObjects;

public class HomePage2 {
	
//	WebDriver driver;
////	public Properties prop;
//	public static Properties prop = new Properties();
////	public Properties prop=new Properties();
//    AbstractComponent abc = new AbstractComponent(driver);
////    prop.load(abc.readProperty());
//    /*
//    prop.load(abc.readProperty());
//    
//	String keyArn= prop.getProperty("kmsKeyVal");
//
//	final AwsCrypto crypto = AwsCrypto.builder().withCommitmentPolicy(CommitmentPolicy.RequireEncryptRequireDecrypt)
//			.build();
//
//
//
//	KmsMasterKeyProvider keyProvider = KmsMasterKeyProvider.builder().buildStrict(keyArn);
//*/
//    
//	
//	@FindBy(xpath = "//*[@id=\"search-input\"]")
//	WebElement searchTextBox;
//	
//	@FindBy(xpath = "//*[text()=\"Interactions\"]")
//	WebElement intercationText;
//	
//	@FindBy(xpath = "//*[text()=\"Search\"]")
//	WebElement searchButton;
//	
//	@FindBy(xpath = "//*[@class=\"fas userIcon fa-user-alt icon-color\"]")
//	WebElement profileIcon;
//	
//	@FindBy(xpath = "//img[@alt='profile_Icon']")
//	WebElement profile;
//	
//	@FindBy(xpath = "//*[text()=\"Not An Axis Bank Customer\"]")
//	WebElement notanAxisbankCustomer;
//	
//	@FindBy(xpath = "//span[@class='d-flex']")
//	List<WebElement> profileDetails;
//	
//	@FindBy(xpath = "//span[contains(text(),'Sparsh Omni')]")
//	WebElement custName;
//	
//	@FindBy(xpath = "//span[contains(text(),'********0100')]")
//	WebElement custMobNo;
//	
//	@FindBy(xpath = "//span[contains(text(),'spa************il.com')]")
//	WebElement custEmail;
//	
//	@FindBy(linkText = "Reset All")
//	private WebElement ResetAll;
//	
//	@FindBy(xpath = "(//input[@name='product'])[1]")
//	public WebElement products;
//	
//	@FindBy(xpath = "(//div[contains(text(),'Savings Account')])[1]")
//	private WebElement SavingsAccount;
//	
//	@FindBy(xpath = "(//div[contains(text(),'Replacement Card')])[1]")
//	private WebElement ReplacementCard;
//	
//	@FindBy(id = "apply")
//	private WebElement ApplyFilterBtn;
//	
//	@FindBy(xpath = "(//input[@name='product'])[1]")
//	private WebElement productsplaceholder;
//
//	@FindBy(xpath = "//*[text()=\"No Products Found\"]")
//	private WebElement NoProductsFound;
//	
//	@FindBy(xpath = "(//a[contains(text(),'Reset')])[3]")
//	private WebElement ProductReset;
//	
//	@FindBy(xpath = "(//div[contains(text(),'Product')])[1]")
//	private WebElement ProductDropdownOpened;
//	
//	@FindBy(xpath = "(//div[contains(text(),' Interaction Channel')])[1]")
//	private WebElement Channels;
//	
//	@FindBy(xpath = "(//div[@class='filter_list2'])[1]//li")
//	private WebElement ChannelList;
//	
//	@FindBy(xpath = "(//input[@placeholder='Search Channels'])[1]")
//	private WebElement ChannelsSearchTextBox;
//	
//	@FindBy(xpath = "(//div[contains(text(),'DLMS')])[1]")
//	private WebElement DLMS;
//	
//	@FindBy(xpath = "(//div[contains(text(),'Branch')])[1]")
//	private WebElement Branch;
//	
//	@FindBy(xpath = "(//div[contains(text(),'Digital - VCIP')])[1]")
//	private WebElement DigitalVCIP;
//	
//	@FindBy(xpath = "//*[text()=\"No Channels Found\"]")
//	private WebElement NoChannelsFound;
//	
//	@FindBy(xpath = "(//a[contains(text(),'Reset')])[4]")
//	private WebElement ChannelReset;
//	
//	@FindBy(xpath = "(//div[contains(text(),' Interaction Type')])[1]")
//	private WebElement InteractionType;
//	
//	@FindBy(xpath = "(//input[@placeholder='Search Interaction Type'])[1]")
//	private WebElement InteractionTypeSearchTextBox;
//	
//	@FindBy(xpath = "(//div[contains(text(),'Deliverables Tracking')])[1]")
//	private WebElement DeliverablesTracking;
//	
//	@FindBy(xpath = "(//div[contains(text(),'Savings Account Application Status')])[1]")
//	private WebElement SAAS;
//	
//	@FindBy(xpath = "//*[text()='No Interaction Type Found']")
//	private WebElement NoInteractionTypeFound;
//	
//	@FindBy(xpath = "(//a[contains(text(),'Reset')])[5]")
//	private WebElement InteractionTypeReset;
//	
//	@FindBy(xpath = "//*[contains(text(),'more_vert')]")
//	private WebElement PaginationThreeDots;
//	
//	@FindBy(xpath = "//label[contains(text(),'25 items')]")
//	private WebElement Pagination25Items;
//	
//	@FindBy(css = ".fa-check")
//	private WebElement ByDefault25ItemsChecked;
//	
//	@FindBy(xpath = "//label[contains(text(),'50 items')]")
//	private WebElement Pagination50Items;
//	
//	@FindBy(xpath = "//label[contains(text(),'75 items')]")
//	private WebElement Pagination75Items;
//	
//	@FindBy(xpath = "//label[contains(text(),'100 items')]")
//	private WebElement Pagination100Items;
//	
//	@FindBy(css = ".fa-angle-right")
//	private List<WebElement> arrowBtn;
//	
//	@FindBy(xpath = "//button[starts-with(text(),'View more')]")
//	private List<WebElement> ViewMore;
//	
//	@FindBy(css = ".page-item")
//	private List<WebElement> getPageNumbers;
//	
//	@FindBy(xpath = "//div[@class='card-header pr-0 py-0']")
//	private List<WebElement> titleTile;
//	
//	@FindBy(xpath = "(//div[@class='card-header pr-0 py-0']//div[@class='row mx-0 no-gutters']//div[@class='col py-2'])")
//	private List<WebElement> titleTileList;
//	
//	@FindBy(xpath = "(//div[@class='card-header pr-0 py-0'])[1]//div[@class='mb-2 col-lg-4']")
//	private List<WebElement> titleTileFields;
//	
//	@FindBy(xpath = "//div[@class='card-body details-card']")
//	private List<WebElement> detailedTile;
//	
//	@FindBy(xpath = "//div[@class='w-100']")
//	private WebElement Field;
//	
//	@FindBy(xpath = "//div[@class='w-100']/following::span")
//	private WebElement FieldValue;
//	
//	@FindBy(xpath = "//div[@class='ver1']")
//	private WebElement ApplicationVersion;
//	
//	
//	@FindBy(xpath = "//*[text()=\"There are no events found for this customer for last 90 days.\"]")
//	private WebElement invlidsearchMsg;
//	
//	public void goTo(String authkey, String data, String session) throws Exception {
//		//		driver.get("https://192.168.1.211/sakshamform/saksham-login");
//
//		FileInputStream fisqa = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\sparsh\\resources\\application.properties");
//		prop.load(fisqa);
//		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\sparsh\\resources\\"+prop.get("spring.profiles.active")+".properties");
//		prop.load(fis);
//		//		driver.manage().window().maximize();
//		String url = prop.getProperty("ServerUrl")+(session+authkey+data);
//		System.out.println("final url :"+url);
//		driver.get(url);
//
//	}
//	
//	
//	public void getSearch() throws Exception {
//		prop=new Properties();
//		FileInputStream fisqa = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\sparsh\\resources\\application.properties");
//		prop.load(fisqa);
//		
//		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\sparsh\\resources\\"+prop.get("spring.profiles.active")+".properties");
////		prop.load(fisqa1);
//
//		prop.load(fis);	
//		String custID = prop.getProperty("custID");
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		ExcelReader excel = new ExcelReader();
//		searchTextBox.sendKeys(custID);
//		searchButton.click();
////		profileIcon.click();		
//	}
//
//	public void getProfileClick() throws Exception {
//		LinkedList<String> totalwindows = new LinkedList<String>(driver.getWindowHandles());
//		LinkedList<String> tabs = new LinkedList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1));
//		Thread.sleep(2000);
////		JavascriptExecutor js = (JavascriptExecutor)driver;
////		js.executeScript("arguments[0].scrollIntoView();", products);
////		Thread.sleep(5000);
//		profile.click();		
//	}
//	
//	public void getProfileDetails() throws Exception {
////		get profile details from excelsheet
//		ExcelReader excel = new ExcelReader();
//		List<String> excelProfileDetails=excel.setExcelFile(System.getProperty("user.dir")+"\\src\\test\\java\\sparsh\\data\\CustomerDetails.xlsx", "CustomerDetails");
//		System.out.println("Profile Details from Excel are "+excelProfileDetails);
//		
////		compare both profile details
//		for(int i = 0; i< profileDetails.size(); i++)
//		{
//			for(int j = 0 ; j< excelProfileDetails.size(); j++)
//			{
//				assertTrue(profileDetails.contains(excelProfileDetails.get(j)), "Profile details Mismatched");
//			}
//		}		
//	}	
//	
//	
//	public void getProfileDetailsUsingJson() throws Exception {
////		/*
////		AbstractComponent abc = new AbstractComponent(driver);
//		
//		 prop=new Properties();
//		prop.load(abc.readProperty());
//		String keyArn= prop.getProperty("kmsKeyVal");
//
//		final AwsCrypto crypto = AwsCrypto.builder().withCommitmentPolicy(CommitmentPolicy.RequireEncryptRequireDecrypt)
//				.build();
//
//
//
//		KmsMasterKeyProvider keyProvider = KmsMasterKeyProvider.builder().buildStrict(keyArn);
//
////*/
//		prop.load(abc.readProperty());
//		JSONParser jsonParser = new JSONParser();
//		JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader(".//SparshTestData//customerDetails.json"));
////		String user =  jsonObject.get("ID").toString();
//		System.out.println("Enc Email -> "+jsonObject.get("Email").toString());
//		String decEmail= KmsTest.decrypt1(keyProvider, crypto, jsonObject.get("Email").toString());
//		System.out.println("Dec Email -> "+decEmail);
//		
//		System.out.println("Enc Name -> "+jsonObject.get("Name").toString());
//		String decName= KmsTest.decrypt1(keyProvider, crypto, jsonObject.get("Name").toString());
//		System.out.println("Dec Name -> "+decName);
//		
//		System.out.println("Enc MobNo -> "+jsonObject.get("MobNo").toString());
//		String decMobNo= KmsTest.decrypt1(keyProvider, crypto, jsonObject.get("MobNo").toString());
//		System.out.println("Dec MobNo -> "+decMobNo);
//		
//		
//		
//	}	
//	
//	public void getProductWaterMark() throws Exception {
//		products.click(); 
//		String placeholder = products.getAttribute("placeholder");
//		Assert.assertEquals(placeholder, "Search Products");
//	}	
//
//	public void getProductClick() throws Exception {
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,450)");
//		products.click(); 
//		System.out.println("User has clicked in Products Search textbox");
//	}
//	
//	public void getProducts() throws Exception {
//		LinkedList<String> totalwindows = new LinkedList<String>(driver.getWindowHandles());
//		LinkedList<String> tabs = new LinkedList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1));
//		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();", products);
//		Thread.sleep(5000);
//
//		List<WebElement> products = driver.findElements(By.xpath("(//div[@class='filter_list1'])[1]//li"));
//		List<String> uiProducts = new ArrayList<String>();
//		
////		get products from ui
//		for(WebElement product: products)
//		{
////			System.out.println(product.getText());
//			uiProducts.add(product.getText());
//		}
//		
//		System.out.println("Products from UI are "+ uiProducts);
//		
////		print ui products
////		for(int i = 0; i<uiProducts.size(); i++)
////		{
////		System.out.println(uiProducts.get(i));
////		}
//		
////		get products from excelsheet
//		ExcelReader excel = new ExcelReader();
//		List<String> excelProduct=excel.setExcelFile(System.getProperty("user.dir")+"\\src\\test\\java\\sparsh\\data\\Products.xlsx", "Products");
//		System.out.println("Products from Excel are "+excelProduct);
//		
////		compare both products
//		for(int i = 0; i< uiProducts.size(); i++)
//		{
//			for(int j = 0 ; j< excelProduct.size(); j++)
//			{
//				assertTrue(uiProducts.contains(excelProduct.get(j)), "Products Mismatched");
//			}
//		}
//	}
//
//	public void getSingleProductClick() throws Exception {
////		LinkedList<String> totalwindows = new LinkedList<String>(driver.getWindowHandles());
////		LinkedList<String> tabs = new LinkedList<String>(driver.getWindowHandles());
////		driver.switchTo().window(tabs.get(1));
////		Thread.sleep(2000);
////		getSearch();
////		Thread.sleep(5000);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();", products);
//		Thread.sleep(5000);
//
//		List<WebElement> products = driver.findElements(By.xpath("(//div[@class='filter_list1'])[1]//li"));
//		List<WebElement> uiProducts = new ArrayList<WebElement>();
//		
////		get products from ui
//		for(WebElement product: products)
//		{
////			System.out.println(product.getText());
////			uiProducts.add(product.getText());
//			uiProducts.add(product);
//		}
//		
////		System.out.println("Products from UI are "+ uiProducts);
//		uiProducts.get(0).click();
//		ApplyFilterBtn.sendKeys(Keys.ENTER);
//	}
//	
//	public void getMultiProductClick() throws Exception {
////		LinkedList<String> totalwindows = new LinkedList<String>(driver.getWindowHandles());
////		LinkedList<String> tabs = new LinkedList<String>(driver.getWindowHandles());
////		driver.switchTo().window(tabs.get(1));
////		Thread.sleep(2000);
////		getSearch();
////		Thread.sleep(5000);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();", products);
//		Thread.sleep(5000);
//
//		List<WebElement> products = driver.findElements(By.xpath("(//div[@class='filter_list1'])[1]//li"));
//		List<WebElement> uiProducts = new ArrayList<WebElement>();
//		
////		get products from ui
//		for(WebElement product: products)
//		{
////			System.out.println(product.getText());
////			uiProducts.add(product.getText());
//			uiProducts.add(product);
//		}
//		
//		System.out.println("Products from UI are "+ uiProducts);
//		for(int i = 0; i<uiProducts.size(); i++)
//		{
////		System.out.println(uiProducts.get(i));
//			uiProducts.get(i).click();
//		}
//		ApplyFilterBtn.sendKeys(Keys.ENTER);
//	}
//
//	public void getInvalidProductSearch(String invalidprod) throws Exception {
//		products.sendKeys(invalidprod);
//		String result = NoProductsFound.getText(); 
//		Assert.assertEquals(result, "No Products Found");		
//	}
//	
//	public void getProductsResetBtn() throws Exception {
//		ProductReset.click();
//		System.out.println("User clicked on Products reset button");
//	}
//	
//	public void getProductsClearedOut() {
//		ApplyFilterBtn.click();
//		System.out.println("product reset successful");
//	}
//	
//	public void getProductsDropdownOpened() throws Exception {
//		LinkedList<String> totalwindows = new LinkedList<String>(driver.getWindowHandles());
//		LinkedList<String> tabs = new LinkedList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1));
//		String isProductDropdownOpened = ProductDropdownOpened.getAttribute("aria-expanded");
//		Assert.assertTrue(true, isProductDropdownOpened);
//	}
//	
////	Interaction Channel
//	public void getInteractionChannelWaterMark() throws Exception {
//		LinkedList<String> totalwindows = new LinkedList<String>(driver.getWindowHandles());
//		LinkedList<String> tabs = new LinkedList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1));		
//		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();", Channels);
//		Channels.click(); 
//		System.out.println("User opened Interaction Channel dropdown");
//		String placeholder = ChannelsSearchTextBox.getAttribute("placeholder");
//		System.out.println("placeholder="+placeholder);
//		Assert.assertEquals(placeholder, "Search Channels");		
//	}	
//
//	public void getChannelClick() throws Exception {
//		LinkedList<String> totalwindows = new LinkedList<String>(driver.getWindowHandles());
//		LinkedList<String> tabs = new LinkedList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1));		
//		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		Thread.sleep(1000);
//		Channels.click(); 
//		Thread.sleep(2000);
//		System.out.println("User clicked on channels dropdown");		
//	}
//		
//	public void getChannelSerachTextBoxClick() throws Exception {
////		LinkedList<String> totalwindows = new LinkedList<String>(driver.getWindowHandles());
////		LinkedList<String> tabs = new LinkedList<String>(driver.getWindowHandles());
////		driver.switchTo().window(tabs.get(1));		
////		Thread.sleep(2000);
////		JavascriptExecutor js = (JavascriptExecutor)driver;
////		js.executeScript("arguments[0].scrollIntoView();", Channels);
//		Thread.sleep(1000);
//		ChannelsSearchTextBox.click();
//		System.out.println("User clicked in channels Search Textbox");		
//	}
//	
//	public void getChannels() throws Exception {
//		LinkedList<String> totalwindows = new LinkedList<String>(driver.getWindowHandles());
//		LinkedList<String> tabs = new LinkedList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1));
//		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();", Channels);
//		Thread.sleep(5000);
//		Channels.click();
//		ChannelsSearchTextBox.click();
//		Thread.sleep(5000);
//		
//		List<WebElement> channels = driver.findElements(By.xpath("(//div[@class='filter_list2'])[1]//li"));
//		List<String> uiChannels = new ArrayList<String>();
//		
////		get channels from ui
//		for(WebElement channel: channels)
//		{
////			System.out.println(channel.getText());
//			uiChannels.add(channel.getText());
//		}
//		
//		System.out.println("Channels from UI are "+ uiChannels);
//		
////		print ui channels
////		for(int i = 0; i<uiChannels.size(); i++)
////		{
////		System.out.println(uiChannels.get(i));
////		}
//		
////		get channels from excelsheet
//		ExcelReader excel = new ExcelReader();
//		List<String> excelChannels=excel.setExcelFile(System.getProperty("user.dir")+"\\src\\test\\java\\sparsh\\data\\interactionChannel.xlsx", "interactionChannel");
//		System.out.println("Channels from Excel are "+excelChannels);
//		
////		compare both channels
//		for(int i = 0; i< uiChannels.size(); i++)
//		{
//			for(int j = 0 ; j< excelChannels.size(); j++)
//			{
//				assertTrue(uiChannels.contains(excelChannels.get(j)), "Channels Mismatched");
//			}
//		}
//		
////		boolean boolval = excelChannels.equals(uiChannels);
////		System.out.println(boolval);
//	}
//
//	public void getSingleChannelClick() throws Exception {
////		LinkedList<String> totalwindows = new LinkedList<String>(driver.getWindowHandles());
////		LinkedList<String> tabs = new LinkedList<String>(driver.getWindowHandles());
////		driver.switchTo().window(tabs.get(1));
////		Thread.sleep(2000);
////		JavascriptExecutor js = (JavascriptExecutor)driver;
////		js.executeScript("arguments[0].scrollIntoView();", Channels);
////		Thread.sleep(5000);
////		Channels.click();
//		List<WebElement> channels = driver.findElements(By.xpath("(//div[@class='filter_list2'])[1]//li"));
//		List<WebElement> uiChannels = new ArrayList<WebElement>();
//		
////		get channels from ui
//		for(WebElement channel: channels)
//		{
////			System.out.println(channel.getText());
////			uiChannels.add(channel.getText());
//			uiChannels.add(channel);
//		}
//		
//		System.out.println("Channels from UI are "+ uiChannels);
//		uiChannels.get(0).click();
//		ApplyFilterBtn.sendKeys(Keys.ENTER);
//	}
//	
//	public void getMultiChannelClick() throws Exception {
//		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
////		js.executeScript("arguments[0].scrollIntoView();", Channels);
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
////		Thread.sleep(2000);	
////		Channels.click();
//		Thread.sleep(5000);	
//		
//		List<WebElement> channels = driver.findElements(By.xpath("(//div[@class='filter_list2'])[1]//li"));
//		List<WebElement> uiChannels = new ArrayList<WebElement>();
//		
////		get channels from ui
//		for(WebElement channel: channels)
//		{
////			System.out.println(channel.getText());
////			uiChannels.add(channel.getText());
//			uiChannels.add(channel);
//		}
//		System.out.println("Channels from UI are "+ uiChannels);
//		for(int i = 0; i<uiChannels.size(); i++)
//		{
////		System.out.println(uiProducts.get(i));
//			uiChannels.get(i).click();
//		}		
//		ApplyFilterBtn.sendKeys(Keys.ENTER);
//	}
//	
//	public void getInvalidChannelSearch(String invalidChannel) throws Exception {
//		ChannelsSearchTextBox.sendKeys(invalidChannel);
//		String result = NoChannelsFound.getText(); 
//		Assert.assertEquals(result, "No Channels Found");
//	}
//	
//	public void getChannelsResetBtn() throws Exception {
//		LinkedList<String> totalwindows = new LinkedList<String>(driver.getWindowHandles());
//		LinkedList<String> tabs = new LinkedList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1));
//		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();", Channels);
//		Thread.sleep(2000);
//		DLMS.click();
//		ChannelReset.click();	
//	}
//	
//	public void getChannelsClearedOut() throws Exception {
//		ApplyFilterBtn.sendKeys(Keys.ENTER);
//		System.out.println("channel reset");	
//	}	
//
//	public void getInteractionTypeWaterMark() throws Exception {
//		LinkedList<String> totalwindows = new LinkedList<String>(driver.getWindowHandles());
//		LinkedList<String> tabs = new LinkedList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1));		
//		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();", InteractionType);
//		InteractionType.click(); 
//		System.out.println("User opened Interaction Type dropdown");
//		String placeholder = InteractionTypeSearchTextBox.getAttribute("placeholder");
//		System.out.println("placeholder="+placeholder);
//		Assert.assertEquals(placeholder, "Search Interaction Type");		
//	}	
//	
//	public void getInteractionTypeClick() throws Exception {
////		LinkedList<String> totalwindows = new LinkedList<String>(driver.getWindowHandles());
////		LinkedList<String> tabs = new LinkedList<String>(driver.getWindowHandles());
////		driver.switchTo().window(tabs.get(1));		
////		Thread.sleep(5000);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		Thread.sleep(1000);
//		InteractionType.click();
//		Thread.sleep(2000);
//	}
//
//	
//	public void getInteractionTypeSearchTextBoxClickable() throws Exception {
//		LinkedList<String> totalwindows = new LinkedList<String>(driver.getWindowHandles());
//		LinkedList<String> tabs = new LinkedList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1));		
//		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		Thread.sleep(1000);
//		InteractionType.click();
//		InteractionTypeSearchTextBox.click();
//		System.out.println("User clicked on Interaction Type dropdown");		
//	}
//		
//	public void getInteractionTypes() throws Exception {
////		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
////		customer.click();
////		Thread.sleep(2000);
//
//		LinkedList<String> totalwindows = new LinkedList<String>(driver.getWindowHandles());
////		System.out.println(totalwindows);
////		System.out.println("Current Window=" +driver.getWindowHandle());
//		LinkedList<String> tabs = new LinkedList<String>(driver.getWindowHandles());
////		System.out.println(tabs);
//		driver.switchTo().window(tabs.get(1));
//		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
////		js.executeScript("window.scrollBy(0,800)");
//		js.executeScript("arguments[0].scrollIntoView();", InteractionType);
//		Thread.sleep(5000);
//		InteractionType.click();
//		InteractionTypeSearchTextBox.click();
//		Thread.sleep(5000);
//
//		List<WebElement> interactiontypes = driver.findElements(By.xpath("(//div[@class='filter_list3'])[1]//li"));
//		List<String> uiInteractiontypes = new ArrayList<String>();
//		
////		get interactiontypes from ui
//		for(WebElement interactionType: interactiontypes)
//		{
////			System.out.println(interactionType.getText());
//			uiInteractiontypes.add(interactionType.getText());
//		}
//		
//		System.out.println("Interaction Types from UI are "+ uiInteractiontypes);
//		
////		print ui interactiontypes
////		for(int i = 0; i<uiInteractiontypes.size(); i++)
////		{
////		System.out.println(uiInteractiontypes.get(i));
////		}
//		
////		get interactiontypes from excelsheet
//		ExcelReader excel = new ExcelReader();
//		List<String> excelInteractionType=excel.setExcelFile(System.getProperty("user.dir")+"\\src\\test\\java\\sparsh\\data\\interactionType.xlsx", "interactionType");
//		System.out.println("Interaction types from Excel are "+excelInteractionType);
//		
////		compare both interactiontypes
//		for(int i = 0; i< uiInteractiontypes.size(); i++)
//		{
//			for(int j = 0 ; j< excelInteractionType.size(); j++)
//			{
//				assertTrue(uiInteractiontypes.contains(excelInteractionType.get(j)), "Interaction Types Mismatched");
//			}
//		}
//		
////		boolean boolval = excelChannels.equals(uiChannels);
////		System.out.println(boolval);
//}
//
//	public void getInteractionTypes2() throws Exception {
////		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
////		customer.click();
////		Thread.sleep(2000);
//
////		QuickLink ql = new QuickLink(driver);
////		ql.getQuickLinkCustID();
//		
//		LinkedList<String> totalwindows = new LinkedList<String>(driver.getWindowHandles());
////		System.out.println(totalwindows);
////		System.out.println("Current Window=" +driver.getWindowHandle());
//		LinkedList<String> tabs = new LinkedList<String>(driver.getWindowHandles());
////		System.out.println(tabs);
//		driver.switchTo().window(tabs.get(1));
//		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();", InteractionType);
//		Thread.sleep(5000);
//		InteractionType.click();
//		InteractionTypeSearchTextBox.click();
//		Thread.sleep(5000);
//
//		List<WebElement> interactiontypes = driver.findElements(By.xpath("(//div[@class='filter_list3'])[1]//li"));
//		List<String> uiInteractiontypes = new ArrayList<String>();
//		
////		get interactiontypes from ui
//		for(WebElement interactionType: interactiontypes)
//		{
////			System.out.println(interactionType.getText());
//			uiInteractiontypes.add(interactionType.getText());
//		}
//		
//		System.out.println("Interaction Types from UI are "+ uiInteractiontypes);
//		
////		print ui interactiontypes
////		for(int i = 0; i<uiInteractiontypes.size(); i++)
////		{
////		System.out.println(uiInteractiontypes.get(i));
////		}
//		
////		get interactiontypes from excelsheet
//		ExcelReader excel = new ExcelReader();
//		List<String> excelInteractionType=excel.setExcelFile(System.getProperty("user.dir")+"\\src\\test\\java\\sparsh\\data\\interactionType.xlsx", "interactionType");
//		System.out.println("Interaction types from Excel are "+excelInteractionType);
//		
////		compare both interactiontypes
//		for(int i = 0; i< uiInteractiontypes.size(); i++)
//		{
//			for(int j = 0 ; j< excelInteractionType.size(); j++)
//			{
//				assertTrue(uiInteractiontypes.contains(excelInteractionType.get(j)), "Interaction Types Mismatched");
//			}
//		}
//		
////		boolean boolval = excelChannels.equals(uiChannels);
////		System.out.println(boolval);
//}
//	
//	public void getSingleInteractionTypeClick() throws Exception {
//		LinkedList<String> totalwindows = new LinkedList<String>(driver.getWindowHandles());
////		System.out.println(totalwindows);
////		System.out.println("Current Window=" +driver.getWindowHandle());
////		LinkedList<String> tabs = new LinkedList<String>(driver.getWindowHandles());
////		System.out.println(tabs);
////		driver.switchTo().window(tabs.get(1));
////		Thread.sleep(2000);
////		JavascriptExecutor js = (JavascriptExecutor)driver;
////		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
////		Thread.sleep(5000);
////		InteractionType.click();
//		InteractionTypeSearchTextBox.click();
//		Thread.sleep(5000);
//
//		List<WebElement> interactiontypes = driver.findElements(By.xpath("(//div[@class='filter_list3'])[1]//li"));
//		List<WebElement> uiInteractiontypes = new ArrayList<WebElement>();
//		
////		get interactiontypes from ui
//		for(WebElement interactionType: interactiontypes)
//		{
////			System.out.println(interactionType.getText());
////			uiInteractiontypes.add(interactionType.getText());
//			uiInteractiontypes.add(interactionType);
//		}
//		
//		System.out.println("Interaction Types from UI are "+ uiInteractiontypes);
//		
//		uiInteractiontypes.get(0).click();
//		ApplyFilterBtn.sendKeys(Keys.ENTER);
//	}
//	
//	public void getDeliverablesTracking() throws Exception {
//		LinkedList<String> totalwindows = new LinkedList<String>(driver.getWindowHandles());
//		LinkedList<String> tabs = new LinkedList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1));
//		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		Thread.sleep(5000);		
//	
//		String InteractionType = DeliverablesTracking.getText();
//		DeliverablesTracking.click();
//		ApplyFilterBtn.sendKeys(Keys.ENTER);
//		System.out.println("User has selected "+ InteractionType);
//	}	
//	
//	public void getMultiInteractionTypeClick() throws Exception {
//		LinkedList<String> totalwindows = new LinkedList<String>(driver.getWindowHandles());
////		System.out.println(totalwindows);
////		System.out.println("Current Window=" +driver.getWindowHandle());
//		LinkedList<String> tabs = new LinkedList<String>(driver.getWindowHandles());
////		System.out.println(tabs);
//		driver.switchTo().window(tabs.get(1));
//		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
////		js.executeScript("window.scrollBy(0,800)");
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		Thread.sleep(5000);
////		InteractionType.click();
//		InteractionTypeSearchTextBox.click();
//		Thread.sleep(5000);
//
//		List<WebElement> interactiontypes = driver.findElements(By.xpath("(//div[@class='filter_list3'])[1]//li"));
//		List<WebElement> uiInteractiontypes = new ArrayList<WebElement>();
//		
////		get interactiontypes from ui
//		for(WebElement interactionType: interactiontypes)
//		{
////			System.out.println(interactionType.getText());
////			uiInteractiontypes.add(interactionType.getText());
//			uiInteractiontypes.add(interactionType);
//		}
//		
//		System.out.println("Interaction Types from UI are "+ uiInteractiontypes);
//
//		for(int i = 0; i<uiInteractiontypes.size(); i++)
//		{
////		System.out.println(uiProducts.get(i));
//			uiInteractiontypes.get(i).click();
//		}
//		ApplyFilterBtn.sendKeys(Keys.ENTER);
//	}
//	
//	public void getInvalidInteractionTypeSearch(String invalidInteractionType) throws Exception {
//		LinkedList<String> totalwindows = new LinkedList<String>(driver.getWindowHandles());
//		LinkedList<String> tabs = new LinkedList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1));		
//		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();", InteractionType);
//		Thread.sleep(2000);
//		InteractionTypeSearchTextBox.sendKeys(invalidInteractionType);
//		String result = NoInteractionTypeFound.getText(); 
//		Assert.assertEquals(result, "No Interaction Type Found");		
//	}
//	
//	public void getInteractionTypeResetBtn() throws Exception {
//		InteractionTypeReset.click();
//	}
//	
//	public void getInteractionTypeClearedOut() throws Exception {
//		ApplyFilterBtn.sendKeys(Keys.ENTER);
//	}
//	
//	public void getresetAll(){
//		ResetAll.click();
//	}
//	
//	public void getIndividualFiltersWorking() throws Exception {
//		LinkedList<String> totalwindows = new LinkedList<String>(driver.getWindowHandles());
//		LinkedList<String> tabs = new LinkedList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1));
//		products.click();
//		Thread.sleep(5000);
//		SavingsAccount.click();
//		String product1 = SavingsAccount.getText();
//		ReplacementCard.click();
//		String product2 = ReplacementCard.getText();
//		ApplyFilterBtn.sendKeys(Keys.ENTER);
//		ResetAll.click();
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();", Channels);
//		Thread.sleep(5000);		
//		Channels.click();
//		ChannelsSearchTextBox.click();
//		Thread.sleep(5000);
//		
//		String channel1 = DLMS.getText();
//		DLMS.click();
//		Branch.click();
//		DigitalVCIP.click();
//		ApplyFilterBtn.sendKeys(Keys.ENTER);
//		ResetAll.click();
//
//		js.executeScript("arguments[0].scrollIntoView();", InteractionType);
//		Thread.sleep(5000);		
//		InteractionType.click();
//		InteractionTypeSearchTextBox.click();
//		Thread.sleep(5000);
//		
//		String InteractionType = SAAS.getText();
//		SAAS.click();
//		ApplyFilterBtn.sendKeys(Keys.ENTER);
//		ResetAll.click();
//	}
//
//	public void getApplyFilterClick() throws Exception {
//		ApplyFilterBtn.click();
//	}
//
//	public void getPaginationOptions() throws Exception {
//		LinkedList<String> totalwindows = new LinkedList<String>(driver.getWindowHandles());
//		LinkedList<String> tabs = new LinkedList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1));
//		Thread.sleep(2000);
//		PaginationThreeDots.click();
//	}
//	
//	public void getPagination50SelectedOptions() throws Exception {
//		Pagination50Items.click();
//		System.out.println("User has selected 50 Items per Page to be dispalyed");
//	}
//
//	public void getPagination75SelectedOptions() throws Exception {
//		Pagination75Items.click();
//		System.out.println("User has selected 75 Items per Page to be dispalyed");
//	}
//	
//	public void getPagination100SelectedOptions() throws Exception {
//		Pagination100Items.click();
//		System.out.println("User has selected 100 Items per Page to be dispalyed");
//	}
//
//	
//	public void getPagination25SelectedOptions() throws Exception {
//		Pagination50Items.click();
//		System.out.println("User has selected 50 Items per Page to be dispalyed");
//		PaginationThreeDots.click();
//		Pagination25Items.click();
//		System.out.println("User has selected 25 Items per Page to be dispalyed");
//	}
//
//	public void get25PaginationOptions() throws Exception {
//		String Pagination25items = ByDefault25ItemsChecked.getAttribute("aria-hidden");
//		Assert.assertTrue(true, Pagination25items);
//	}
//	
//	public void getdetailedTile() throws Exception {
//		LinkedList<String> totalwindows = new LinkedList<String>(driver.getWindowHandles());
//		LinkedList<String> tabs = new LinkedList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1));
//		Thread.sleep(2000);
//		PaginationThreeDots.click();
//		String Pagination25items = ByDefault25ItemsChecked.getAttribute("aria-hidden");
//		Assert.assertTrue(true, Pagination25items);
//	}
//	
//
//	public void getApplyFilterOnEnterBtn() throws Exception {
//		LinkedList<String> totalwindows = new LinkedList<String>(driver.getWindowHandles());
//		LinkedList<String> tabs = new LinkedList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1));
//		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();", InteractionType);
//		Thread.sleep(5000);		
//		InteractionType.click();
//		InteractionTypeSearchTextBox.click();
//		Thread.sleep(5000);
//		
//		String InteractionType = SAAS.getText();
//		DeliverablesTracking.click();
//		ApplyFilterBtn.sendKeys(Keys.ENTER);
//		System.out.println("User has selected "+ InteractionType);
//	}
//
//	
//	public HomePage2(WebDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(driver, this);		
//	}
//
//	public void getArrowBtn() throws InterruptedException {
////		LinkedList<String> totalwindows = new LinkedList<String>(driver.getWindowHandles());
//		LinkedList<String> tabs = new LinkedList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1));
//		Thread.sleep(2000);
//		
//		int pagenumbers = getPageNumbers.size();
//		for(WebElement e1: getPageNumbers)
//		{
//			e1.click();
//			int viewmoreSize = ViewMore.size();
////			System.out.println("View more options available on a page = " + viewmoreSize);
//			for(WebElement e2: ViewMore)
//			{
//				JavascriptExecutor js = (JavascriptExecutor)driver;
//				js.executeScript("arguments[0].scrollIntoView();",e2);
//				e2.click();
//			}
//			int size = arrowBtn.size();
////			System.out.println(size);				
//			for(WebElement e3: arrowBtn)
//			{
//				e3.click();
//				Thread.sleep(2000);
//
//				Map<String, String> TitleTile = new HashMap<String, String>();
//				int TotalTitleTileFields = titleTileList.size();
//				
////				System.out.println(TotalTitleTileFields);
//				
////				for(int i=1; i<=TotalTitleTileFields;i++)
//					for(int i=1; i<=2;i++)
//				{
//					System.out.println("Title Tile");
//					WebElement TitleTileFieldsAndValues = driver.findElement(By.xpath("(//div[@class='row mx-0 dta w-100 border_mobile'])['"+i+"']"));
////					System.out.println(TitleTileFieldsAndValues.getText());
//					
//					List<String> TitleTileArray = new ArrayList<>();
//					TitleTileArray.add(TitleTileFieldsAndValues.getText());
////					System.out.println(TitleTileArray);
//
//					System.out.println("Detailed Tile");
//					WebElement DetailedTileFieldsAndValues = driver.findElement(By.xpath("(//div[@class='header-div headerCard'])['"+i+"']"));
////					System.out.println(DetailedTileFieldsAndValues.getText());
//					
//					List<String> DetailedTileArray = new ArrayList<>();
//					DetailedTileArray.add(DetailedTileFieldsAndValues.getText());
////					System.out.println(DetailedTileArray);
//					
//					List<String> TitleAndDetailedTileArray = new ArrayList<>();
//					TitleAndDetailedTileArray.add(TitleTileFieldsAndValues.getText());
//					TitleAndDetailedTileArray.add(DetailedTileFieldsAndValues.getText());
//					System.out.println(TitleAndDetailedTileArray);
//				}
//				}
//	}
//}		
//		public void getApplicationVersion() throws Exception {
//			String appVer = ApplicationVersion.getText();
//			Assert.assertEquals(appVer, "Ver:3.0.0");
//		}
//
//		public void getSearchTextBoxClick() throws Exception {
//			searchTextBox.click();
//		}
//		
//		public void getSearchBtnClick() throws Exception {
//			searchButton.click();
//		}
//		
//		public void getCustID(String custID) throws Exception {
//			searchTextBox.click();
//			searchTextBox.sendKeys(custID);
//		}
//		
//		public void getCustMob(String custMob) throws Exception {
//			Thread.sleep(5000);
//			searchTextBox.click();
//			Thread.sleep(2000);
////			searchTextBox.sendKeys(custMob);
//			searchTextBox.sendKeys("7509652602");
//			Thread.sleep(5000);
//			searchButton.click();
////			Thread.sleep(10000);
////			searchTextBox.sendKeys("8299719907");
////			Thread.sleep(5000);
////			searchButton.click();
//		}
//		
//		public void getCustEmail(String custEmail) throws Exception {
//			searchTextBox.click();
//			searchTextBox.sendKeys(custEmail);
//		}
//		
//		public void getCustPAN(String custPAN) throws Exception {
//			searchTextBox.click();
//			searchTextBox.sendKeys(custPAN);
//		}
//		public void getDummyCustId(String DummyCustID) throws Exception {
//			searchTextBox.click();
////			searchTextBox.sendKeys(DummyCustID);
//			searchTextBox.sendKeys("N031330674");
//			Thread.sleep(2000);
//		}
//		public void getApplicationNo(String custApplicationNo) throws Exception {
//			searchTextBox.click();
////			searchTextBox.sendKeys(custApplicationNo);
//			Thread.sleep(2000);
//			searchTextBox.sendKeys("C1-00000031330674-C1");
//			Thread.sleep(2000);
//		}
//		public void getInvalidApplicationNo(String custApplicationNo) throws Exception {
//			searchTextBox.click();
////			searchTextBox.sendKeys(custApplicationNo);
//			Thread.sleep(2000);
//			searchTextBox.sendKeys("C1-31330674-C1");
//			Thread.sleep(2000);
//			searchButton.click();
//			
//		}
//		public void getTestData(String custApplicationNo) throws Exception {
//			searchTextBox.click();
////			searchTextBox.sendKeys(custApplicationNo);
//			Thread.sleep(2000);
//			searchTextBox.sendKeys("C1-00000031296007-C1");
//			searchButton.click();
//			Thread.sleep(2000);
//			profile.click();
//			 String name = notanAxisbankCustomer.getText();
//			System.out.println(name);
//		}
//		
//		public void getSearchWithInvalidEmail(String custApplicationNo) throws Exception {
//			searchTextBox.click();
////			searchTextBox.sendKeys(custApplicationNo);
//			Thread.sleep(2000);
//			searchTextBox.sendKeys("ssss@gmail.com");
//			Thread.sleep(2000);
//			searchButton.click();
//			
//			Assert.assertEquals(invlidsearchMsg.isDisplayed(), true);
//			
//		}
//		public void getSearchWithInvalidMobileNo(String custApplicationNo) throws Exception {
//			searchTextBox.click();
////			searchTextBox.sendKeys(custApplicationNo);
//			Thread.sleep(2000);
//			searchTextBox.sendKeys("888888888");
//			Thread.sleep(2000);
//			searchButton.click();
//			
//			Assert.assertEquals(invlidsearchMsg.isDisplayed(), true);
//			
//		}
////	public void getFieldsAndValues() throws InterruptedException {
////		Map<String, String> TitleTile = new HashMap<String, String>();
////		int TotalTitleTileFields = titleTileList.size();
////		for(int i=0; i<TotalTitleTileFields;i++)
////		{
////			TitleTile.put(Field.getText(), FieldValue.getText());
////			System.out.println(TitleTile);
////		}		
////		}
//		
//		public void validateApplicationVersion() throws Exception {		
////			LinkedList<String> totalwindows = new LinkedList<String>(driver.getWindowHandles());
////			LinkedList<String> tabs = new LinkedList<String>(driver.getWindowHandles());
////			driver.switchTo().window(tabs.get(1));		
////			Thread.sleep(2000);
//			HomePage2 hp=new HomePage2(driver);
////			hp.getSearchTextBoxClick();
//			String titleOfPage = driver.getTitle();
//			System.out.println("titleOfPage"+titleOfPage);
//			Thread.sleep(2000);
//			searchTextBox.sendKeys("100000");	
//		}
//		
		
}