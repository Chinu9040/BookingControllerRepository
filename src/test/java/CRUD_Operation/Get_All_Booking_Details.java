package CRUD_Operation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import com.crm.generic_utility.BaseClass;

public class Get_All_Booking_Details extends BaseClass {

	@Test
	public void Get_Booking_Details()
	{
		 baseURI = "http://localhost:8080";	
		 when()
		 .get("/bookingall?bookid=SATYA_HOTEL_00002")
		 .then()
		 .assertThat()
		 .statusCode(200)
		 .log().all();
		
	}
}
