package sparsh.config;

import java.util.Date;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import sparsh.api.Base;
import sparsh.api.GetappAuth;

public class APIPath extends Base{

	String session ;
	String authKey ;
	String data;

	public static class apiPath{

//		static AuthKeyValueGeneration akg = new AuthKeyValueGeneration();
//		AESUtility obj = new AESUtility();
		static GetappAuth gci = new GetappAuth();
//		public static final String  requestTime = String.valueOf(new Date().getTime());
//		public static final  String key = akg.generateKeyfromRequestTime(requestTime);
			
		public static void getAppAuth() throws Exception {
			String val1 = gci.appAuth();
		//	System.out.println("value"+val1);
			String response = RestAssured.given().when().headers(HeaderConfigs.defaultHeaders()).body(val1).when()
					.post(APIPath.apiPath.appAuth).asString();
			// System.out.println("*****"+response);
			
			JsonPath js = new JsonPath(response);
			String key = js.getString("key");
			
			String uniqueId = js.getString("uniqueId");
			
			// System.out.println(key);
			// System.out.println(uniqueId);
			
//			String values = getAppAuth();
//			System.out.println(values);
//			String uniqID = response.substring(0,32);
//			System.out.println("uniqID**="+uniqID);
//			String publicKey = response.substring(32);
//			System.out.println("key******="+publicKey);
//						
//			JsonPath js = new JsonPath(response);
//			String key = js.getString("key");
//			
//			String session = uniqID+requestTime;
//			 session = "session="+uniqID+requestTime;
//			System.out.println("session******"+session);
			
//			 data = akg.jsonData();
//			System.out.println("Data*****"+data);
//			
//			 authKey = akg.encryptAesGenerateKey(key,publicKey);
//			
//			System.out.println("authKey******"+authKey);
//
//			
//			String uniqueId = js.getString("uniqueId");
//			System.out.println("uniqueId+key---->"+uniqueId+key);
//			return uniqueId+key;
		}		
	
//		EndPoints ------------>
			//GET
//			static String session1 = "session="+session;
//			static String authKey1 = "&authKey="+authKey;
//			static String data1 = "&data="+data;
			
//			access token of quick link 
			static String access_token = "access_token=";
			public static final String Cust_Info = "/custinfo?access_token=";
			public static final String GetIntractionbyproductandChannel = "/getIntractionDataNew/?"+access_token;
			public static final String GetIntractionDataNew = "/getIntractionDataNew?access_token=";
			public static final String Search = "/search?access_token=";
			public static final  String appAuth ="/appauth";
			public static final  String validateSession = "/validate/session?";
			public static final  String logout="/logout";
		}
	
	public static void main(String[] args) throws Exception {
		APIPath.apiPath.getAppAuth();
	}	
}
