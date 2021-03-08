package com.thangs.mentiResultsTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;


public class driverInit {


    static WebDriver driver;
    static String mentiSessionId = "/48d75c359ce4";
    static createJSON createJSON;

    @BeforeClass
    public void testSetup() throws Exception {
        testQuestionApi();
        testResultApi();
        System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

    }

    @BeforeMethod
    public void openBrowser() {
        //driver.get("http://localhost:backendport/"+mentiSessionId);
        System.out.println("Before Method actions" );
    }


    @Test(description = "This method sends Api Requests")
    public static void testApi() throws Exception {

        int i ;
        // add continuous api request
        for (i=0;i<10;i++) {
            testQuestionApi();
            testResultApi();
        }
    }

    public static void  testQuestionApi() throws Exception {
        RestAssured.baseURI = "https://api.mentimeter.com/questions";
        RequestSpecification request = RestAssured.given();
        Response response = request.get(mentiSessionId);
        System.out.println(response.getBody().asString());
        int statusCode = response.getStatusCode();
        System.out.println(statusCode);
        System.out.println("Tested");
    }


    public static void testResultApi() throws Exception {
        RestAssured.baseURI = "https://api.mentimeter.com/questions" + mentiSessionId;
        RequestSpecification request = RestAssured.given();
        Response response = request.get("/result");
        System.out.println(response.getBody().asString());
        int statusCode = response.getStatusCode();
        System.out.println(statusCode);
        System.out.println("Tested");
        createJSON.createNewJson();
    }


    @AfterMethod
    public void postSignUp() {
        System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://localhost:8080"+mentiSessionId);
        System.out.println("We are currently on the following URL" + driver.getCurrentUrl());
        //driver.findElement(By.id("user_full_name")).sendKeys("thangavel");
        System.out.println(driver.getCurrentUrl());
        driver.quit();

    }

    @AfterClass
    public void afterClass() {
        System.out.println("Completed");
    }

}
