package com.test;

import javax.ws.rs.*;

@Path("subtest")
public class TestSubresource {
	@GET
	@Produces("text/plain")
	@Path("{id}")
	public String getTestConfirmation(@PathParam("id") String id) {
		return "Sub-testing: " + id;
	}
}
