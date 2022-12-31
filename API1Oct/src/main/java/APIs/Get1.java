package APIs;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;


public class Get1 {

	@Test
	public static void t1() {
		
		baseURI="https://api.publicapis.org";
		
		given()
		
		.when()
		.get("/entries")
	.then()
	.log()
	.all()
	.assertThat()
	.statusCode(200);
		
		
	}
}
