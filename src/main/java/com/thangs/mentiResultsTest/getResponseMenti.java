package com.thangs.mentiResultsTest;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.RestAssuredConfig;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static io.restassured.config.EncoderConfig.encoderConfig;


public class getResponseMenti {

    public static void getResponseBody(){

        Response response = given().baseUri("https://xxxxx.ru").log().all().get();        
        System.out.println(response.body().asString());
    }


}
