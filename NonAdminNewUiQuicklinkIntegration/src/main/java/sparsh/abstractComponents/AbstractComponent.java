package sparsh.abstractComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.LinkedList;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazonaws.encryptionsdk.AwsCrypto;
import com.amazonaws.encryptionsdk.CommitmentPolicy;
import com.amazonaws.encryptionsdk.kms.KmsMasterKeyProvider;

public class AbstractComponent {
	WebDriver driver;
	
//	web elements
	@FindBy(xpath = "//*[text()=\" QuickLink \"]")
	WebElement quicklink;
	
	@FindBy(xpath="//input[@id='search-input']")
	WebElement SearchTxtBox;
	
	@FindBy(xpath="//button[@class='search_btn']")
	WebElement SearchBtn;
	
	 	
	
	public void SearchwithCustDetails() throws InterruptedException{
		  SearchTxtBox.sendKeys("10000002");
		  SearchBtn.click();
	}

	
	public static  FileInputStream readProperty() throws Exception {
		Properties prop=new Properties();
		//FileInputStream fis=new FileInputStream("C://Users//NQE00371//eclipse-workspace//SeleniumFrameworkDesign//src//main//java//rahulshettyacademy//resources//GlobalData.properties");
		//System.out.println(System.getProperty("user.dir"));
		
		FileInputStream fisqa = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//sparsh//resources//application.properties");
		prop.load(fisqa);
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//sparsh//resources//"+prop.get("spring.profiles.active")+".properties");
//		prop.load(fisqa1);
		return fis;
	}
	/*
	public   getCrypto() {
		  AwsCrypto crypto = 
				AwsCrypto.builder().withCommitmentPolicy(CommitmentPolicy.RequireEncryptRequireDecrypt).build();

	}
	
 
public getKmsMasterKey() {
    return KmsMasterKeyProvider keyProvider = KmsMasterKeyProvider.builder().buildStrict(keyArn);
}
	
	*/
	//initialization method
	public AbstractComponent(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
