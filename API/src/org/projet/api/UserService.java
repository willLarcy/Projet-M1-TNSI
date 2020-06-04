package org.projet.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

@Path("/users")
public class UserService {
	
	@GET
    @Path("/{score}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUser( @PathParam("score") int score ) {
        User user = new User("Stephane", "COCQUEBERT", score);
        return user;
    }
	
	@POST
	@Path("/logging")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response loging(final String params) {
		JSONObject paramsJSON = new JSONObject(params);
		final String email = paramsJSON.getString("email");
		final String password = paramsJSON.getString("password");
		System.out.println("email : " + email + " password : " + password);
		return Response.ok("c'est ok !").build();
	}

}
