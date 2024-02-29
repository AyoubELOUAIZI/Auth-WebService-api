package estm.dsic.jee.controllers;

import estm.dsic.jee.models.User;
import estm.dsic.jee.services.UserService;
import estm.dsic.jee.util.ResponseMessages;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/users")
public class UserController {

    @Inject
    UserService userService;

    @POST
    @Path("/signup")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON) // Specify JSON as the response type
    public Response signUpUser(User user) {
        System.out.println("\n\n\nthe function signUpUser is called in the controller..");
        boolean userSignedUp = userService.registerUser(user);
        if (userSignedUp) {
            // Return a successful response with JSON
            return Response.ok(ResponseMessages.SIGN_UP_SUCCESS).build();
        } else {
            // Return an error response with JSON
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity(ResponseMessages.SIGN_UP_FAILED)
                    .build();
        }
    }

    
    @POST
    @Path("/signin")
    @Consumes(MediaType.APPLICATION_JSON)
    public void signInUser(User user) {
        // Implementation for user sign-in
    }

    @POST
    @Path("/logout")
    @Consumes(MediaType.APPLICATION_JSON)
    public void logoutUser(User user) {
        // Implementation for user logout
    }
}
