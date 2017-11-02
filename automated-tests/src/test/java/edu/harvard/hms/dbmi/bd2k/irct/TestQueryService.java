
package edu.harvard.hms.dbmi.bd2k.irct;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import edu.harvard.hms.dbmi.bd2k.irct.Utils.RestUtils;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.LogConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.io.InputStreamReader;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.apache.bcel.classfile.Constant;
import org.apache.log4j.Logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
@SuppressWarnings("unused")
/**			

 * NhanesTestqueryService.java class which covers the functionalities - runQuery 
 * @author Atul 
 * @Version 1.0	 */


public class TestQueryService
{
	//RestAssured.registerParser("text/plain", Parser.JSON);
	private static final Logger LOGGER = Logger.getLogger( TestQueryService.class.getName() );
    String APIUrl;
    String accessToken;
    //RestAssured.defaultParser = Parser.JSON;
    
    /**
     * Retrieve the value of endpoint (baseURI) from pom.xml
     */
    
   @BeforeMethod
    public void setup()
    {
	   APIUrl=RestUtils.BaseURIPath()+"/queryService/runQuery/";
	   accessToken=RestUtils.AccessToken();
	   RestUtils.setContentType(ContentType.JSON);
    }
   
  
 public String generateStringFromResource(String path) throws IOException {

	    return new String(Files.readAllBytes(Paths.get(path)));

	}
   
 @Test  
public void runQueryStatusCode() throws IOException{
  
  String root=System.getProperty("user.dir");
  String abspathFile=root+"/src/test/resources/queryService.json";
  String jsonBody = generateStringFromResource(abspathFile);
  //RestAssured.registerParser("text/plain", Parser.TEXT);
			  try{
			  		given()
			  		.contentType("application/json")
			  		.header("Authorization", accessToken)
			  		.body(jsonBody)
			  		.when()
			  		.post(APIUrl)
			  		.then()
			  		.statusCode(200)
			  		.log()
			  		.all();
			  	LOGGER.info("The Status code is verified successfully");
			 	}
			  catch (AssertionError e) 
					{
			 	LOGGER.error("The Status code is not as expected -----Test Failed", e);
					}
			
			 }
 
 @Test  
 public void runQueryResponseCheck() throws IOException{
   
   String root=System.getProperty("user.dir");
   String abspathFile=root+"/src/test/resources/queryService.json";
   String jsonBody = generateStringFromResource(abspathFile);
  				   try{
					   
  					 Response response=	(Response) RestAssured.given()
 					   		.contentType("application/json")
 					   		.header("Authorization", accessToken)
 					   		.body(jsonBody)
 					   		.when()
 					   		.post(APIUrl)
 					   		.then().
 					   		body("resultId",is(notNullValue())).extract().response();
  					   
  					
  					 
					   LOGGER.info("The response of queryService is verified successfully"       +response.asString());
					   		 }
					   
					   catch (AssertionError e) 
			       		{
						   
						   LOGGER.error("The Response is not as expected -----Test Failed", e);
			       		}
   
 		}
 
}





/*
	
		public void httpPost() throws InterruptedException {
			
			//Initializing Rest API's URL
			String APIUrl = baseUri+"queryService/runQuery/";
			System.out.println(APIUrl);
			
			//Initializing payload or API body
			String APIBody = "{API Body}"; 
						
					// Building request using requestSpecBuilder
			RequestSpecBuilder builder = new RequestSpecBuilder();
			
			//Setting API's body
			builder.setBody(APIBody);
				
			//Setting content type as application/json or application/xml
			builder.setContentType("application/json; charset=UTF-8");
				
			RequestSpecification requestSpec = builder.build();

			//Making post request with authentication, leave blank in case there are no credentials- basic("","")
			Response response=given();
					
			Response response = given().authentication().preemptive().basic({username}, {password})
						.spec(requestSpec).when().post(APIUrl);
			JSONObject JSONResponseBody = new JSONObject(response.body().asString());

			//Fetching the desired value of a parameter

//			String result = JSONResponseBody.getString({key});
				
			//Asserting that result 
	Assert.assertEquals(result, "{expectedValue}");

			}

}			

}
}

*/