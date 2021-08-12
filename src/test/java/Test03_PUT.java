import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;


import org.testng.annotations.Test;

import com.github.cliftonlabs.json_simple.JsonObject;

public class Test03_PUT {
	
	@Test
	public void test_01() {
		
		
// used the JsonObject to create body of my Put request

//		JsonObject request = new JsonObject();
//		request.put("id", "5");
//
//		request.put("name", "Lime2 Curd");
//		request.put("available", "159");
//		System.out.println(request);
		
		
		
		// used the Map to create body of my Put request
Map<String, Object> map = new HashMap<String, Object>();
				map.put("id", 5);
				map.put("name", "Lime2 Curd");
				map.put("available", 159);
	
		given()
		.body(map.toString())
		.when()
		.put("https://hometest-qa-develop.platformserviceaccount.com/products/5")
		.then()
		.log().all();
		//.statusCode(200);
		
	}

}
