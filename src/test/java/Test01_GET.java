import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;


public class Test01_GET {

	@Test
	public void test_01() {
		
		
		given()
		.get("https://hometest-qa-develop.platformserviceaccount.com/products").then()
		.statusCode(200)
		//.body("data.products.available[0]", equalTo(1044))
		//.body("data.products.name[0]", equalTo("Strawberry Jam 🍓"))
		.log().all();


	}

}
