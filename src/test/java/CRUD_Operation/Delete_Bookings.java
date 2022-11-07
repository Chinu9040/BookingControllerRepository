package CRUD_Operation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import com.crm.generic_utility.BaseClass;

public class Delete_Bookings extends BaseClass {

	@Test
	public void Get_Booking_Details()
	{
		 baseURI = "http://localhost:8080";	
		 when()
		 .delete("/booking?bookingid=SATYA_BOOKING_00064")
		 .then()
		 .assertThat()
		 .statusCode(200)
		 .log().all();
		
	}
}
