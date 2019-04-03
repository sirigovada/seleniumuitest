package com.RESTAPITest.Tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.RESTAPITest.Utility.JSONRequests;

import io.restassured.response.Response;



public class TestClass {



	@Test
	public void testMethod1() throws FileNotFoundException, IOException {
	
		JSONRequests req= new JSONRequests();
		System.out.println("Debug point");
		Response res=req.getJSONRequest("posts", "4");
		System.out.println(res.getBody().asString());
		int resCode=res.getStatusCode();
		Assert.assertEquals(resCode, 200);
		
		System.out.println("**********  PUT Method ***********");
		String putBody="{\r\n" + 
				"  \"userId\": 9,\r\n" + 
				"  \"id\": 4,\r\n" + 
				"  \"title\": \"eum et est occaecati\",\r\n" + 
				"  \"body\": \"ullam et saepe reiciendis voluptatem adipisci\\nsit amet autem assumenda provident rerum culpa\\nquis hic commodi nesciunt rem tenetur doloremque ipsam iure\\nquis sunt voluptatem rerum illo velit\"\r\n" + 
				"}";
		Response putResponse=req.putJSONRequest("posts", "4", putBody);
		int putResCode=putResponse.getStatusCode();
		Assert.assertEquals(putResCode, 200);
		System.out.println("PUT Resposne code: "+putResCode);
		
		
		System.out.println("******** DELETE Method **********");
		req.deleteJSONRequest("posts", "7890");
		Response afterDeltRes=req.getJSONRequest("posts", "7890");
		System.out.println(afterDeltRes.getBody().asString());
		
		
	}
}
