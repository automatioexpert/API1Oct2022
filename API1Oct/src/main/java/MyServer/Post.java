package MyServer;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Post {

	@Test
	public void postTest() {
		
		baseURI="http://localhost:3000";
		
		String body="{\r\n"
				+ "\"id\": 2,\r\n"
				+ "\"title\": \"Mr VV Vishwakarma\",\r\n"
				+ "\"author\": \"Automation Expert\"\r\n"
				+ "}\r\n"
				+ "]";
		
		Response response=given()
		.contentType(ContentType.JSON)
		.body(body.toString())
		.when()
		.post("/posts");
		
		response.prettyPrint();
		
		System.out.println(response.getStatusCode());
		System.out.println("Post test passed");
		
	}
}
