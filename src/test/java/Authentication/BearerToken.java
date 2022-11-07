package Authentication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
 

public class BearerToken {
	@Test
	public void bearerToken()
	{
		baseURI="https://api.github.com";

		JSONObject o1=new JSONObject();
		o1.put("name", "newRepo_project");
		
		given().auth().oauth2("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")
		.body(o1).contentType(ContentType.JSON)
		.when().post("/user/repos")
		.then().log().all();
	}

}
