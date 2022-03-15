package com.adltestapi;

import static org.testng.Assert.assertEquals;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get {

	String endpoint = "https://gorest.co.in/public/v1/users/";
	
	@Test
	public void test_01() {
		
		Response response = RestAssured.given().auth().oauth2("864ba7fd66f0e86658fee3c51809f945696f9d20f07482e6f69a7f4dd4614c26").get(endpoint);
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
		
		int statusCode = response.getStatusCode();
		
		assertEquals(statusCode, 200);
	}
	
	@Test
	public void test_02(int iduser) {
		
		given()
		.auth().oauth2("864ba7fd66f0e86658fee3c51809f945696f9d20f07482e6f69a7f4dd4614c26")
		.get(endpoint)
		.then()
		.statusCode(200)
		.body("data.id[0]", equalTo(iduser));
	}
}
