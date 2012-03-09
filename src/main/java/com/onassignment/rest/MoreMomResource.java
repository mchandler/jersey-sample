package com.onassignment.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/erichs/mom")
public class MoreMomResource {
	
	@GET
	@Produces("text/html")
	public String getMessage() {
		return "<h2>... is still Hot!</h2>";
	}
	
}
