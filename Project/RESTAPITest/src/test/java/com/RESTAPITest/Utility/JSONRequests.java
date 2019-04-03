package com.RESTAPITest.Utility;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class JSONRequests {
	
	String propertyURL = "./src/test/java/resources/URIProperties.properties";
	

	public Response getJSONRequest(String resourceName, String idNumber) throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyURL));
		System.out.println("Debug point3");
		RestAssured.baseURI = prop.getProperty("baseURI");
		System.out.println("Debug point2");
		Response res = given().contentType(ContentType.JSON).when().get("/" + resourceName + "/" + idNumber);
		return res;
	}

	public Response postJSONRequest(String resourceName, String body) throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyURL));
		RestAssured.baseURI = prop.getProperty("baseURI");

		Response res = given().contentType(ContentType.JSON).body(body).when()
				.post("/" + resourceName + "/");
		return res;
	}

	public Response putJSONRequest(String resourceName, String id, String body)
			throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyURL));
		RestAssured.baseURI = prop.getProperty("baseURI");

		Response res = given().contentType(ContentType.JSON).body(body).when()
				.put("/" + resourceName + "/" + id);

		return res;

	}

	public Response deleteJSONRequest(String resourceName, String id) throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyURL));
		RestAssured.baseURI = prop.getProperty("baseURI");

		Response res = given().contentType(ContentType.JSON).when().delete("/" + resourceName + "/" + id);

		return res;
	}

}
