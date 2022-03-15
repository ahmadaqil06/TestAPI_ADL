package com.adltestapi;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Post {

	@Test
	public void test01_post() {
		
		JSONObject request = new JSONObject();
		
		request.put("id", "3");
		request.put("name", "aqilaja");
		request.put("email", "aqilajadeh@gmail.com");
		request.put("gender", "male");
		request.put("status", "inactive");
		
//		System.out.println(request);
		System.out.println(request.toJSONString());
//		https://gorest.co.in/public/v1/users
		given()
		.auth().oauth2("864ba7fd66f0e86658fee3c51809f945696f9d20f07482e6f69a7f4dd4614c26")
		.header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.post("https://gorest.co.in/public/v1/users") //POST
		.then()
		.statusCode(201)
		.log().all();
		
		
//		assertEquals(given().auth().oauth2("864ba7fd66f0e86658fee3c51809f945696f9d20f07482e6f69a7f4dd4614c26").sta, 200);
	}
}

