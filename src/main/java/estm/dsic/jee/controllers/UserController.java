package estm.dsic.jee.controllers;


import estm.dsic.jee.models.User;
import estm.dsic.jee.services.UserService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @POST
    @Path("/signup")
    @Consumes(MediaType.APPLICATION_JSON)
    public void signUpUser(User user) {
        userService.registerUser(user);
        // Optionally return some response indicating success
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

