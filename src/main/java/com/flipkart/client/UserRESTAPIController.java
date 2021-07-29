package com.flipkart.client;

import com.flipkart.bean.User;
import com.flipkart.exceptions.AuthException;
import com.flipkart.exceptions.InvalidCredentialsException;
import com.flipkart.exceptions.UserNotFoundException;
import com.flipkart.validator.Authentication;

import javax.validation.ValidationException;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.xml.ws.Response;


@Path("/user")

public class UserRESTAPIController {
    @GET
    @Path("/usersAll")
    @Consumes("application/json")
    @Produces(MediaType.APPLICATION_JSON)
    public User viewAllUsers() {
        User user=new User();
        user.setId("12");
        user.setName("qota");
        return user;
    }

    @POST
    @Path("/addNewUser")

    @Consumes("application/json")
    @Produces(MediaType.APPLICATION_JSON)
    public String createProductInJSON(@QueryParam("userId") String userId) {
       //  User user=new User();
       //  user.setId(userId);
        String result = "Product created : " + userId;
        return result;



    }




}
