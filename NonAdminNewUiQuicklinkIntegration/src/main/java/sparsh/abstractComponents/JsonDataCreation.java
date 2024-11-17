package sparsh.abstractComponents;

import java.io.FileWriter;
import java.io.IOException;

//import org.json.JSONObject;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.amazonaws.encryptionsdk.AwsCrypto;
import com.amazonaws.encryptionsdk.CommitmentPolicy;
import com.amazonaws.encryptionsdk.kms.KmsMasterKeyProvider;


public class JsonDataCreation {
	

	final static String keyArn = "arn:aws:kms:ap-south-1:792227409305:key/2c606643-65d7-498a-b21b-28447b255cfc";
//	final static String keyArn = keyArn;
	final static AwsCrypto crypto = AwsCrypto.builder().withCommitmentPolicy(CommitmentPolicy.RequireEncryptRequireDecrypt)
            .build();

 

    public static KmsMasterKeyProvider keyProvider = KmsMasterKeyProvider.builder().buildStrict(keyArn);
 
	
	@Test
    public void json()   {
    	 KmsTest kt = new KmsTest();
    	 JSONObject jsonObject = new JSONObject();
         //Inserting key-value pairs into the json object
         jsonObject.put("ID", kt.encrypt(keyProvider, crypto, "10059"));
         jsonObject.put("Password", kt.encrypt(keyProvider, crypto, "NQ123"));
         jsonObject.put("Name", kt.encrypt(keyProvider, crypto, "Sparsh Omni"));
         jsonObject.put("Email", kt.encrypt(keyProvider, crypto, "sparsh.omni@gmail.com"));
         jsonObject.put("MobNo", kt.encrypt(keyProvider, crypto, "918140670100"));

         
         try {
//            FileWriter file = new FileWriter("C://Users//NQE00505//Sparsh-NewUI-BDD//NonAdmin//src//main//testData//customerDetails.json");
//             FileWriter file = new FileWriter("C:\\Users\\NQE00505\\Sparsh-NewUI-BDD\\NonAdmin\\src\\main\\java\\cust.json");
             FileWriter file = new FileWriter(".//SparshTestData//customerDetails.json");

        	 file.write(jsonObject.toJSONString());
//            file.write("1234");
            file.close();
         } catch (IOException e) { // TODO Auto-generated catch block
             e.printStackTrace();
          }
         System.out.println("JSON file created: "+jsonObject);
         
    	
    }
}
