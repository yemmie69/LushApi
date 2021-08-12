import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Test04_Delete {
	
	@Test
	public void test_01() {
		when()
		.delete("https://hometest-qa-develop.platformserviceaccount.com/products/5")
		.then()
		.statusCode(204)
		.log().all();	
		
	}

}
