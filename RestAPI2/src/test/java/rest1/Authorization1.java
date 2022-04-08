package rest1;

import org.apache.commons.codec.binary.Base64;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Authorization1 {
	
	
	
	
	@Test
	public void auth() {
		String cred="postman:password";
		byte[]  encode_cred=Base64.encodeBase64(cred.getBytes());
		String encodestring=new String(encode_cred);
		
		given().
		header("Authorization","Basic " + encodestring ).
		get("https://postman-echo.com/basic-auth").
		then().
		statusCode(200);
		
	}

}
