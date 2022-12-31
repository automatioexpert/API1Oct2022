package MyServer;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;


public class Get {
	
	@Test
	public void getTest() {
		baseURI="http://localhost:3000/posts";
		
		Response response =given()
		.when()
		.get();
	
		response.prettyPrint();
		
		
	}
	

}
