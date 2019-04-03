package com.RESTAPITest.Tests;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class RestTest {

	//@Test(priority=0)
	public void getJSONRequest() {
		RestAssured.baseURI = "http://ec2-54-84-52-184.compute-1.amazonaws.com:3000";

		Response res = given().contentType(ContentType.JSON).when().get("/posts/45");

		assertEquals(200, res.getStatusCode());
		String json = res.asString();
		JsonPath jp = new JsonPath(json);
		assertEquals("5", jp.get("userId").toString());
		assertEquals("45", jp.get("id").toString());

	}

	//@Test(priority=1)
	public void postJSONRequest() {
		RestAssured.baseURI = "http://ec2-54-84-52-184.compute-1.amazonaws.com:3000";

		Response res = given().
				contentType(ContentType.JSON).
				body("{\r\n" + 
						"        \"postId\": 5778,\r\n" + 
						"        \"id\": 891,\r\n" + 
						"        \"name\": \"id labore ex et quam laborum\",\r\n" + 
						"        \"email\": \"emailaddress@gmail.comz\",\r\n" + 
						"        \"body\": \"laudantium enim quasi est quidem magnam voluptate ipsam eos\\ntempora quo necessitatibus\\ndolor quam autem quasi\\nreiciendis et nam sapiente accusantium\"\r\n" + 
						"    }").
				when().post("/posts/");
		
		

		String body = res.getBody().toString();
		System.out.println(body);
		
		String json = res.toString();
		JsonPath jp = new JsonPath(json);
		assertEquals("5778", jp.get("postId").toString());
		assertEquals("891", jp.get("id").toString());
	}
	
	//@Test(priority=2)
	public void putJSONRequest() {
		RestAssured.baseURI = "http://ec2-54-84-52-184.compute-1.amazonaws.com:3000";

		Response res = given().
				contentType(ContentType.JSON).
				body("{\r\n" + 
						"        \"postId\": 5779,\r\n" + 
						"        \"id\": 891,\r\n" + 
						"        \"name\": \"id labore ex et quam laborum\",\r\n" + 
						"        \"email\": \"emailaddress@gmail.comz\",\r\n" + 
						"        \"body\": \"laudantium enim quasi est quidem magnam voluptate ipsam eos\\ntempora quo necessitatibus\\ndolor quam autem quasi\\nreiciendis et nam sapiente accusantium\"\r\n" + 
						"    }").
				when().put("/posts/891");
		
		String body = res.getBody().toString();
		System.out.println(body);
		
		String json = res.asString();
		JsonPath jp = new JsonPath(json);
		assertEquals("5778", jp.get("postId").toString());
		assertEquals("891", jp.get("id").toString());
		
		
	}
	
	
	@Test
	public void deleteJSONRequest() {
		RestAssured.baseURI = "http://ec2-54-84-52-184.compute-1.amazonaws.com:3000";

		Response res = given().
				contentType(ContentType.JSON).
				when().delete("/posts/891");
		
        System.out.println("Debug point1");
		
		String body = res.getBody().toString();
		System.out.println(body);
		int code=res.getStatusCode();
		System.out.println(code);
	}

}
