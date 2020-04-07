package com.test;



import javax.ws.rs.*;
/**
 * @author Emil
 * Basic REST resource for testing out basic functionalities
 */
@Path("/test")
public class TestResource {
	
	@GET
	@Path("/number_test")
	@Produces("text/plain")
	public String getTestResponse(@QueryParam("number") int number) {
		return "Number test returned: " + number;
	}
	
	@GET
	@Path("/xml_test")
	@Produces("text/xml")
	public Test getTestXML(@DefaultValue("TEST") @QueryParam("name") String name,
							@DefaultValue("1") @QueryParam("number") String number) {
		return new Test(name, Integer.valueOf(number));
	}
	
	
	
	
	
	
}
