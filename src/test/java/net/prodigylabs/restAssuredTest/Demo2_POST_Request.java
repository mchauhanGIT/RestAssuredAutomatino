package net.prodigylabs.restAssuredTest;

import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.HashMap;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

// SENDING POST REQUEST (Sample Customer API)


public class Demo2_POST_Request {

    public static HashMap map = new HashMap();

    @BeforeClass
    public void postdata()
    {
        map.put("FirstName",RestUtils.getFirstName());
        map.put("LastName",RestUtils.getLastName());
        map.put("UserName", RestUtils.getUserName());
        map.put("Password", RestUtils.getPassword());
        map.put("Email", RestUtils.getEmail());

        RestAssured.baseURI ="http://restapi.demoqa.com/customer";
        RestAssured.basePath ="/register";              // Query Parameter

    }

    @Test
    public void testpost()
    {
        given()
                .contentType("application/json")
                .body(map)

        .when()
                .post()

        .then()
                .statusCode(201)
                .body("SuccessCode", equalTo("OPERATION_SUCCESS"))
                .and()
                .body("Message", equalTo("Operation completed successfully"));
    }
}
