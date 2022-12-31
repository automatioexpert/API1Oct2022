package APIs;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutPatch2 {

	@Test

	public void patchTest() {
		
		baseURI="https://reqres.in/";
		
		JSONObject json= new JSONObject();
		json.put("name", "dinga");
		json.put("job", "hhskask");
		System.out.println(json.toJSONString());
		
		given()
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
	.body(json.toJSONString())
	.when()
	.patch("api/users/2")
	.then()
	.statusCode(200)
	.log()
	.all();
		
		
	}
}
