package sparsh.utils;

import java.security.spec.AlgorithmParameterSpec;
import java.util.Base64;
import java.util.Date;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Hex;


public class Encryption {
//	private static void encryption() {
//		String data = "SAKSHAM";
//		//String data = "{\"key\": null,\"message\": \"####LINK EXPIRED ######\",\"result\": false,\"uniqueId\": null,\"requestTime\": null,\"kmsResponseDto\": null}";
//		String requestTime = String.valueOf(new Date().getTime());
//		
//		System.out.println("requestTime :"+requestTime);
//		String key = generateKeyfromRequestTime(requestTime);
//		String encKey = getEncodedSecretKey(data, key.substring(0, 32), key.substring(0, 16));
//		System.out.println("encrypt :" + encKey);
//		}
	
	public static String encryptionRequestTime() {
		String data = "SAKSHAM";
		//String data = "{\"key\": null,\"message\": \"####LINK EXPIRED ######\",\"result\": false,\"uniqueId\": null,\"requestTime\": null,\"kmsResponseDto\": null}";
		String requestTime = String.valueOf(new Date().getTime());
		
		// System.out.println("requestTime :"+requestTime);
		String key = generateKeyfromRequestTime(requestTime);
		String encKey = getEncodedSecretKey(data, key.substring(0, 32), key.substring(0, 16));
//		System.out.println("encrypt :" + encKey);
		
		return requestTime;
		}
	public static String encryptionEncKey() {
		String data = "kk7dHFUqUY9vwEV9TieDDg==";
		//String data = "{\"key\": null,\"message\": \"####LINK EXPIRED ######\",\"result\": false,\"uniqueId\": null,\"requestTime\": null,\"kmsResponseDto\": null}";
		String requestTime = String.valueOf(new Date().getTime());
		
		// System.out.println("requestTime :"+requestTime);
		String key = generateKeyfromRequestTime(requestTime);
		String encKey = getEncodedSecretKey(data, key.substring(0, 32), key.substring(0, 16));
		// System.out.println("encrypt :" + encKey);
//		System.out.println(requestTime+" "+encKey);

		return requestTime+encKey;
		}

	private static String generateKeyfromRequestTime(String requestTime) {
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
	
	public static void main(String[] args) {
//		encryption();
		encryptionEncKey();
//		encryptionRequestTime();
	}


}
