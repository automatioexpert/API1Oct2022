package APIs;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Get3 {
	
	@Test
	public void t1() {
		
		baseURI="https://api.publicapis.org";
	
	
		Response response=given()
		.get("/entries");
		
		response.prettyPrint();
		
		
		
		
	}

}
