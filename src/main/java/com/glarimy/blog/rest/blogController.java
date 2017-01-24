package com.glarimy.blog.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.glarimy.blog.api.Blog;
import com.glarimy.blog.api.BlogException;
import com.glarimy.blog.api.Createlogin;
import com.glarimy.blog.biz.Simpleblog;



@Path("/Blog")
public class blogController {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/Createlogin")
	public Response add(Createlogin logindetails) throws BlogException {
		Blog blog = new Simpleblog();
		String email = blog.Create(logindetails);
		return Response.ok().entity(email + "").build();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/Createlogin/{email}")
	public Response getlogindetails(@PathParam("email") String email) throws BlogException {
		Blog blog = new Simpleblog();
		Createlogin logindetails = blog.getlogindetails(email);
		return Response.ok().entity(logindetails).build();
	}

	
}




