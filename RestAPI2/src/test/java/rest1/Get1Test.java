package rest1;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;


public class Get1Test {
	
	

 @Test
  public void add1() {
	 
	 
	  
	 
	  given().
	  get("https://reqres.in/api/users?page=2").
	  then().
	  body("data.id[0]",equalTo(7)).
	  header("Content-Type","application/json; charset=utf-8" ).
	  statusCode(200);
	  
	  Response r1=RestAssured.get("https://reqres.in/api/users?page=2");
	  System.out.println(r1.header("Content-Type"));
	  
  }
}
