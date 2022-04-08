package rest1;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Post1 {
	
	 

	/*@DataProvider(name="dppost")
	 public Object[][] t1(){
		Object[][] getdata1= new Object[][] {
			{"Sri","singer"},
			{"Ram","developer"},
			{"Roja","Teacher"},
			{"Arvind","BA"}
		};
		
		return getdata1;
	}*/
	
	 
	@Test
		
		public void t1() {
		
		given().
		delete("https://reqres.in/api/users/2").
		then().
		statusCode(204);
		
		
		
		
	}

}
