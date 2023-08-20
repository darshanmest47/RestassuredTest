package com.utils;
import Utils.Uri;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class Apiutils {

private Apiutils(){}

    public static RequestSpecification apiUtils(){
        return given().baseUri(Uri.URI.getValue())
                .log().all();
    }
}
