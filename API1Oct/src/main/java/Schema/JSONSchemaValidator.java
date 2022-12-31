package Schema;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

public class JSONSchemaValidator {

	 
	 @Test
	public void JSONSchemaValidator() {
		 
		 baseURI="https://reqres.in/api";
		 
		given()
		.get("/users?page=2")
		.then()
		.assertThat()
		.body(matchesJsonSchemaInClasspath("schema.json"));
		//.statusCode(200)
		//.body("data.id", hasItems([8,8,9,9]));
		
		
		
		 
		
	}
}
