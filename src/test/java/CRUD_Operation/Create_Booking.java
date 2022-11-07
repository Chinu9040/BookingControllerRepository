package CRUD_Operation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.crm.generic_utility.BaseClass;

import io.restassured.http.ContentType;

public class Create_Booking extends BaseClass {
	@Test
	public void Create_a_Booking()
	{
		JSONObject js=new JSONObject();
		JSONObject js2=new JSONObject();
		
		baseURI="http://localhost:8080";
		String basePATH="/SATYA_HOTEL_00008/booking";

		js.put("bookdsc", "Room Booking N0 6");
		js.put("booktype", "online");
		js.put("cost", 300);
		js.put("bookid", "Room404");
		

		js2.put("description", "triple_room");
		js2.put("name", "Chinu");
		js2.put("no_of_person", 3);
		js2.put("rent", 2500);
		js2.put("type", "triple_Bed");
		js2.put("id", "room_001");
		
		js.put("room", js2);
		 System.out.println(js.toString());
		
		given()
		.contentType(ContentType.JSON)
		.body(js)
		.when()
		.post(basePATH)
		.then()
		.assertThat()
		.statusCode(200)
		.log().all();
					
		
	}
}
