package sparsh.api;

import java.security.spec.AlgorithmParameterSpec;
import java.text.ParseException;
import java.util.Base64;
import java.util.Date;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Hex;
import org.json.simple.JSONObject;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.JWEObject;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.crypto.RSAEncrypter;
import com.nimbusds.jose.jwk.RSAKey;

import sparsh.utils.Encryption;
import sparsh.utils.UniqueIdGenration;

public class GetappAuth {
	
	public static final String  requestTime = String.valueOf(new Date().getTime());
	public static final  String key = generateKeyfromRequestTime(requestTime);

	public static String appAuth() {

		String encKeyVal = Encryption.encryptionEncKey();

		String time = encKeyVal.substring(0, 13);

		String key = encKeyVal.substring(13);

		String id = UniqueIdGenration.uniqidGen();

		return "{\r\n" + "    \"appCode\": \"SAKSHAM\",\r\n" + "    \"secreteKey\": \"" + key + "\",\r\n"
				+ "    \"uniqueId\": \"" + id + "\",\r\n" + "    \"requestTime\": \"" + time + "\"\r\n" + "}";
	}
	
	public String jsonData(String unqid) {
//		JSONObject obj=new JSONObject();
//		obj.put("customerId","10000001");
//		obj.put("userCode","10059");
//		obj.put("uniqueId",unqid);	//unq id from app auth
//		obj.put("requestTime",requestTime);
//		obj.put("roleId", "136");
		
		JSONObject emp=new JSONObject();
		emp.put("empId","10059");
		emp.put("empName","ABC");
		emp.put("empRole","123");
		emp.put("empRoleName","Clerk");
		JSONObject obj=new JSONObject();
		obj.put("searchParam","10000001");
		obj.put("searchType","custid");
		obj.put("userCode","10059");	
		obj.put("uniqueId",unqid);
		obj.put("requestTime", requestTime);
		obj.put("roleId","136");
		obj.put("countryCode","012");
		obj.put("source","SAKSHAM");	
		obj.put("target","SPARSH");
		obj.put("employeeDetail",emp);
		
		String json = obj.toString();
		String encKey = getEncodedSecretKey(json, key.substring(0, 32), key.substring(0, 16));
		return encKey;//enc data

		}
	
	public static  String generateKeyfromRequestTime(String requestTime) {
		StringBuffer str = new StringBuffer();
		str.append(requestTime);
		str.append(requestTime);
		str.append(requestTime);
		return str.toString();
		
	}
	
	private static String getEncodedSecretKey(String data, String key1, String key2) {
		String encodedSecretKey = encryptAESKey(data, key1, key2);
		return encodedSecretKey;
		}
	
	public static String encryptAESKey(String data, String keyOne, String keyTwo) { 	
		try {  			String key1 = Hex.encodeHexString(keyOne.getBytes()); 		
		String key2 = Hex.encodeHexString(keyTwo.getBytes());  	
		byte[] key3 = Hex.decodeHex(key1.toCharArray()); 		
		byte[] key4 = Hex.decodeHex(key2.toCharArray());  			
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding"); 			
		SecretKeySpec skeySpec = new SecretKeySpec(key3, "AES");  			
		AlgorithmParameterSpec parmspecfic = new IvParameterSpec(key4); 			
		cipher.init(Cipher.ENCRYPT_MODE, skeySpec, parmspecfic); 			
		byte[] encrypted = cipher.doFinal(data.getBytes());  			
		return new String((Base64.getEncoder().encodeToString(encrypted))); 		
		} catch (Exception e) { 		
			e.printStackTrace(); 	
			} 	
		return null; 	
		}
	
	public static String encryptAesGenerateKey(String key, String publicKey) {// public key from appauth
		RSAKey parsedKey = parseJWK(publicKey);
		try {
			RSAEncrypter encrypter;
			encrypter = new RSAEncrypter(parsedKey);
			JWEObject jwe = new JWEObject(new JWEHeader(JWEAlgorithm.RSA_OAEP_256, EncryptionMethod.A256GCM),
					new Payload(key));
			try {
				jwe.encrypt(encrypter);
			} catch (JOSEException e) {
				e.printStackTrace();

			}

			String jweString = jwe.serialize();
			// System.out.println("jweString :" + jweString);//auth key

			return jweString.toString();
		}

		catch (JOSEException e1) {
			e1.printStackTrace();
		}
		return null;

	}
	
	private static RSAKey parseJWK(String publicKey)  {
		RSAKey parsedKey;
		try {
	 parsedKey = RSAKey.parse(publicKey);
		 } catch (ParseException e) {
		 throw new IllegalArgumentException(e);
		}
		// System.out.println("parsedKey :" + parsedKey);
		 return parsedKey;
	}

}
