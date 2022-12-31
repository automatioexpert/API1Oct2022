package APIs;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;


public class Get2 {

	@Test
	public static void t1() {
		
		baseURI="https://api.publicapis.org";
		
		given()
		.when()
		.get("/entries")
	.then()
	//.body("entries.API",("AdoptAPet"))
	.log()
	.all()
	.assertThat()
	.statusCode(200);
		
		
	}
}
