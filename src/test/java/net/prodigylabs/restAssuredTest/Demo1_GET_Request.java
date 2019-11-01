package net.prodigylabs.restAssuredTest;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

/*

 given()
 		set cookies, add auth, add param, set headers info etc....

 when()
 		get, post, put, delete...

 then()
 		validate status code, extract response, extract headers cookies and response body...
 */

public class Demo1_GET_Request {

    @Test()
    public void getWeatherDetails()
    {
        given()
                .when()
                //URL of the API (Request)
                .get("http://restapi.demoqa.com/utilities/weather/city/hyderabad")
                .then()
                //Validations
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .assertThat().body("City", equalTo("Hyderabad"))
                .header("Content-Type", "application/json");

    }
}
