package sparsh.pageObjects;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sparsh.abstractComponents.AbstractComponent;
import sparsh.abstractComponents.ExcelReader;

public class Ntb {
	WebDriver driver;
	public Properties prop;
//	public Properties prop=new Properties();
    AbstractComponent abc = new AbstractComponent(driver);
    
    @FindBy(xpath = "//*[@id=\"search-input\"]")
	WebElement searchTextBox;
	
    @FindBy(xpath = "//*[text()=\"Search\"]")
	WebElement searchButton;

	public void getSearch() throws Exception {
		prop=new Properties();
		FileInputStream fisqa = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\sparsh\\resources\\application.properties");
		prop.load(fisqa);
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\sparsh\\resources\\"+prop.get("spring.profiles.active")+".properties");
//		prop.load(fisqa1);

		prop.load(fis);	
		String custID = prop.getProperty("custID");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		ExcelReader excel = new ExcelReader();
		searchTextBox.sendKeys(custID);
		searchButton.click();
//		profileIcon.click();		
	}
	
	public void getCustID(String custID) throws Exception {
		searchTextBox.click();
		searchTextBox.sendKeys(custID);
	}
	public Ntb(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
}
