package net.prodigylabs.restAssuredTest;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import static io.restassured.RestAssured.*;

import java.util.HashMap;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

//Update/modify single record using PUT rest api

public class Demo3_PUT_Request {

    public static HashMap  map = new HashMap();
    String empName= RestUtils.empName();
    String empSal = RestUtils.empSal();
    String empAge = RestUtils.empAge();
    int emp_id=11254;

    @BeforeClass
    public void putdata()
    {
        map.put("name", empName);
        map.put("salary", empSal);
        map.put("age", empAge);

        RestAssured.baseURI ="http://dummy.restapiexample.com/api/v1";
        RestAssured.basePath="/update/"+emp_id;
    }

    @Test
    public void testPUT()
    {
        given()
                .contentType("application/json")
                .body(map)

        .when()
                .put()

        .then()
                .statusCode(200)
                .log().all();

    }

}
