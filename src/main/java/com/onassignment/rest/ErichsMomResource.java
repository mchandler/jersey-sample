package com.onassignment.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/erichsmom")
public class ErichsMomResource {
	
	@GET 
	@Produces("text/html")
	public String getClichedMessage() {
		return "<h1>...is Hot!</h1>";
	}
}
