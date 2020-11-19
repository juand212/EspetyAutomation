package com.espety.api;

import com.espety.models.UserModel;
import io.restassured.http.ContentType;

import java.util.List;

import static io.restassured.RestAssured.given;

public class UserRequest {

    UserModel userModel = new UserModel();

    public void create(List<String> data) {
        userModel.setData(data);
        String request = given().contentType(ContentType.JSON)
//                .body("{\n" +
//                        "    \"userType\": 1,\n" +
//                        "    \"name\": \"pepito\",\n" +
//                        "    \"name\": \" "+ pepito",\n" +
//                        "    \"lastName\": \"perez\",\n" +
//                        "    \"email\": \"pepito98@perez.com\",\n" +
//                        "    \"password\": \"12345\",\n" +
//                        "    \"profile\": true\n" +
//                        "}")
                .body(userModel)
                .post("https://back.espety.com/academy/user/create-user").then().extract().asString();

        System.out.println(request);

    }
}
