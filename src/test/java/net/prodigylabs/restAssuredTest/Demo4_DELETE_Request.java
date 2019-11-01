package net.prodigylabs.restAssuredTest;

import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.*;

public class Demo4_DELETE_Request {

    @Test
    public void deleteEmployeeRecord() {
        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
        RestAssured.basePath = "/delete/11500";

       //Storing the complete response
        Response response =

        given()

         .when()
                .delete()

         .then()
               .statusCode(200)
               .statusLine("HTTP/1.1 200 OK")
                .log().all()
                .extract().response();          //store the response in a variable

       String jsonAsString = response.asString();
        Assert.assertEquals(jsonAsString.contains("successfully! deleted Records"), true);
    }

}
