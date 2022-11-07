package Authentication;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class BasicAuth {

	@Test
	public void basicAuth()
	{
		baseURI="https://api.github.com";
		given().auth().basic("Chinu9040", "Chinu@9040")
		.when().get("/login")
		.then().log().all();
	}
}
