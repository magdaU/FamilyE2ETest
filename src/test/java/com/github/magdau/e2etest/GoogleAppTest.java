package com.github.magdau.e2etest;


import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GoogleAppTest {

    @Test
    public void makeSureThatGoogleIsUp() {
        given().when().get("http://www.google.com").then().statusCode(200);
    }

}
