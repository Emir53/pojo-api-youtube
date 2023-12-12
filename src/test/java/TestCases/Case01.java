package TestCases;

import Base.BaseUrl;
import Model.CreateUserResponse;
import Model.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;

public class Case01 extends BaseUrl {

    @Test()
    public void createUser(){
        User user=new User(12,"emirdeneme12211116","deneme","deneme@mail","123","112345",0);
        Response response=given().spec(requestSpec)
                .body(user).post("/user");
        response.then().statusCode(200);
        CreateUserResponse createUserResponse=response.as(CreateUserResponse.class);
        Assert.assertEquals(200,createUserResponse.getCode());
        Assert.assertEquals("unknown",createUserResponse.getType());


    }

}
