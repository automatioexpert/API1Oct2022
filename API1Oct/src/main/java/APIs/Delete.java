package APIs;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class Delete {
	
	@Test
	public void testDelete() {
		
		baseURI="https://reqres.in/";
		
		given()
		.contentType(ContentType.JSON)
		.when()
		.delete("api/users/2")
		.then()
		.statusCode(204)
		.log()
		.all();
		
	}

}
