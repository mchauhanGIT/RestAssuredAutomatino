package net.prodigylabs.restAssuredTest;

/*
1. Test Status Code
2. Log Response
3. Verifying Single Content in response body
4. Verifying Multiple contents in response body
5. Setting parameters & header

 */

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Demo5_BasicValidations_JSON {

    @Test(priority = 1)
    public void testStatusCode()
    {
        given()

       .when()
                .get("http://jsonplaceholder.typicode.com/posts/5")

       .then()
                .statusCode(200);
              //  .log().all();
    }

    @Test(priority = 2)
    public void testLogging()
    {
        given()

       .when()
                .get("http://services.groupkt.com/country/get/iso2code/IN")

       .then()
                .statusCode(200)
                .log().all();
    }


    @Test(priority = 3)
    public void testSingleContent()
    {
        given()

                .when()
                .get("http://services.groupkt.com/country/get/iso2code/IN")

                .then()
                .statusCode(200)
                //JSON Path finder
                .body("RestResponse.result.name", equalTo("India"));
    }

    @Test(priority = 4)
    public void testMultipleContent()
    {
        given()

                .when()
                .get("http://services.groupkt.com/country/get/all")

                .then()
                .statusCode(200)
                //JSON Path finder
                .body("RestResponse.result.name", hasItems("India","Australia"));
    }


    @Test(priority = 5)
    public void testParamsAndHeaders()
    {
        given()
            .param("MyName", "Manoj")
            .header("MyHeader", "Indian")

        .when()
                .get("http://services.groupkt.com/country/get/iso2code/IN")

        .then()
                .statusCode(200)
                //JSON Path finder
                .log().all();
    }




}
