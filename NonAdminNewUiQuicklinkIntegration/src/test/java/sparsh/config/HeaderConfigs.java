package sparsh.config;

import java.util.HashMap;
import java.util.Map;

public class HeaderConfigs {
	public static Map<String, String> defaultHeaders(){
		Map<String, String> defaultHeaders = new HashMap<String, String>();
		defaultHeaders.put("Content-Type","application/json");
		return defaultHeaders;
	}
	
	public static Map<String, String> HeadersWithToken(){
		String token = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiYWRtaW4iOnRydWUsImlhdCI6MTUxNjIzOTAyMiwiZ3JvdXBzIjpbImdyb3VwMSIsImdyb3VwMiJdLCJzY29wZSI6WyJzY29wZTEiLCJzY29wZTIiXX0.qmP7hlJ7ID5OV5FGBK_veptfHtV6nO3HmUh5sWFOV_lyRKv2CTSXG3PcKKuR2vNFfM1crgIDW65P6sSL2muoYkBKokqWheIXmCWtWH4FDIPPWpTAbP8By1lqEdt77ePdWK_1fCPXuJzlIgi1G7WbL-xvhvW4xMM0_Z82MzTBVNJoyNgRCK_a30N9tKSpb3Krl0ivtGC28dmxNj-AF1gSZxqwqkXxWzNHdJ16jjRXw4V1s-224Ty3RmaCsdrRpCg075x6IXvhhIVAvaYhXRvFgeVRt32kcGhtojLwFMw9WmzG9Mawvmj35FY_n7GbcVGASCCuZCGIMaZ9Io3BUIluxw";
		Map<String, String> defaultHeaders = new HashMap<String, String>();
		defaultHeaders.put("Content-Type","application/json");
		defaultHeaders.put("access_token",token);	
		return defaultHeaders;
	}
	
	
//	public Map<String, String> headersWithToken(){
//		Map<String, String> defaultHeaders = new HashMap<String, String>();
//		defaultHeaders.put("Content-Type","application/json");
//		defaultHeaders.put("Access_Token","xdghjhkhbuvcdrtbguffghg");
//		defaultHeaders.put("jwt_Token","dchjgfdcgfghjghj");
//		defaultHeaders.put("Tenet_user","test");	
//		return defaultHeaders;
//	}
	
//	public Map<String, String> headersWithToken(){
//		Map<String, String> defaultHeaders = new HashMap<String, String>();
//		defaultHeaders.put("Content-Type","application/json");
//		defaultHeaders.put("Access_Token","xdghjhkhbuvcdrtbguffghg");
//		defaultHeaders.put("jwt_Token","dchjgfdcgfghjghj");
//		defaultHeaders.put("Tenet_user","test");	
//		return defaultHeaders;
//	}
	
//	public static void main(String[] args) {
//		HeaderConfigs header = new HeaderConfigs();
//		System.out.println(header.defaultHeaders());
//	}
}