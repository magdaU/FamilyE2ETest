package com.github.magdau.e2etest;
import static com.jayway.restassured.RestAssured.given;

import org.junit.Test;

public class GoogleAppTest {

    @Test
    public void makeSureThatGoogleIsUp() {
        given().when().get("http://www.google.com").then().statusCode(200);
    }

}
