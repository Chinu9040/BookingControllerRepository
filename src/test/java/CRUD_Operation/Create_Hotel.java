package CRUD_Operation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.crm.generic_utility.BaseClass;

import io.restassured.http.ContentType;


public class Create_Hotel extends BaseClass{
	@Test
	public void post_CreateHotel()
	{
		JSONObject o=new JSONObject();
		
		baseURI="http://localhost:8080";
		
		o.put("hotelid", "Hotel003");
		o.put("address", "Bhubaneswar");
		o.put("area", "Pahala");
		o.put("contact", "9861505050");
		o.put("hotelname", "heights");
		o.put("payment", "4000");
		o.put("website", "Heights.com");
		
		given()
		.contentType(ContentType.JSON)
		.body(o)
		.when()
		.post("/hotel")
		.then()
		.assertThat()
		.statusCode(200)
		.log().all();
		
		
		
		
	}

}
