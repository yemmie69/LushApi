import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;


import org.testng.annotations.Test;

import com.github.cliftonlabs.json_simple.JsonObject;

import io.restassured.http.ContentType;

public class Test02_POST {

	@Test
	public void test_01() {
		
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("name", "Lush Test6");
//		map.put("available", "59");

		// used the JsonObject to create body of my Post

		JsonObject request = new JsonObject();
		request.put("name", "Lush Test6");
		request.put("available", "50");
		System.out.println(request);
		
		given()
		.header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		//.body(request)
		.body(request.toJson())
		.when()
		.post("https://hometest-qa-develop.platformserviceaccount.com/products")
		.then()
		.log().all();
		//.statusCode(201);
		
	}

}
