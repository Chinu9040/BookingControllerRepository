package CRUD_Operation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.crm.generic_utility.BaseClass;

import io.restassured.http.ContentType;
public class Update_BookingRecord extends BaseClass {
	@Test
	public void Update_A_Record()
	{
		JSONObject o=new JSONObject();
		
		baseURI="http://localhost:8080";
		
		o.put("bookid", "SATYA_BOOKING_00064");
		o.put("bookdsc", "Room Book 6");
		o.put("booktype", "one");
		o.put("cost", 3200);
		o.put("hotel_hotelid", "SATYA_HOTEL_00001");
		
		given()
		.contentType(ContentType.JSON)
		.body(o)
		.when()
		.put("/booking?id=SATYA_BOOKING_00064")
		.then()
		.assertThat()
		.statusCode(200)
		.log().all();
		
		
	}

}
