package com.vadranam.selenium.restassured_tutorial02;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class ApiTest {
	
	@Test
	
	public void validateData() {
		
		RestAssured.baseURI = "https://reqres.in/";
		
		RequestSpecification request = RestAssured.given();	
		Response response = request.get("/api/unknown");	
		ResponseBody body = response.getBody();
		
		Users usersResponse = (Users) body.as(Users.class);
		
		Assert.assertEquals(usersResponse.getPage(), "1");
		Assert.assertEquals(usersResponse.getTotal(), "12");
		Assert.assertEquals(usersResponse.getPer_page(), "3");
		Assert.assertEquals(usersResponse.getTotal_pages(), "4");
		Assert.assertEquals(usersResponse.getData().length, 3);
		Assert.assertEquals(usersResponse.getData()[0].getId(), "1");
		Assert.assertEquals(usersResponse.getData()[0].getName(), "cerulean");
		Assert.assertEquals(usersResponse.getData()[0].getPantone_value(), "15-4020");
		Assert.assertEquals(usersResponse.getData()[0].getYear(), "2000");
		Assert.assertEquals(usersResponse.getData()[0].getColor(), "#98B2D1");
	}

}
