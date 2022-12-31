package APIs;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Get4 {

	//@Test
	public void testGet() {
		baseURI = "https://api.publicapis.org";

		given()
		.get("/entries")
		.then()
		.statusCode(200)
		.body("entries[0].API", equalTo("AdoptAPet"))
		.body("entries[71].Auth",equalTo("apiKey"));
	
	}
	
	@Test
	public void post() {
		baseURI="https://reqres.in/";
		Map<String,String> map = new HashMap<String,String>();
		map.put("name", "Dinga");
		map.put("job", "hsdsdh");
		
		JSONObject json= new JSONObject(map);
		//json.put("name", "Dinga");
		//json.put("job", "Hsdsd");
		System.out.println(json.toString());
		System.out.println(json.toJSONString());
		
		
		given()
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON)
		.body(json.toJSONString())
		.when()
		.post("api/users")
		.then()
		.statusCode(201)
		.log()
		.all();
		
		
		
		
		
		
		
		
	}

}
