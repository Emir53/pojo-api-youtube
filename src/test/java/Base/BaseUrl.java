package Base;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

public class BaseUrl {
    protected static RequestSpecification requestSpec;
    @BeforeClass
    public  void createRequestSpecifications(){

        requestSpec=new RequestSpecBuilder()
                .setBaseUri("https://petstore.swagger.io/v2") .addHeader("Content-Type","application/json")
                .build();
    }
}
