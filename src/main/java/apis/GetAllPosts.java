package apis;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
public class GetAllPosts {
	
	private static Response res;
	private static RequestSpecification httpRequest;
	
	//public static JsonPath getAllPostsResponse()
	{
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
	/*	httpRequest = (Response) given().header("Cookie" , "__cfduid=d5ee5a188277682da64139615b2a58d191619814374")
				.header("Cache-Control", "no-cache")
				.header("Host" , " ").when()
				.get("/posts").then().log().all().contentType(ContentType.JSON).extract().response();
		
		String res2 = res.asString();

		 JsonPath jp = new JsonPath(res2);
		
		 return jp;*/
	}
	
	/*public static void main(String [] args)
	{
		System.out.println(getAllPostsResponse());
	}*/

}
