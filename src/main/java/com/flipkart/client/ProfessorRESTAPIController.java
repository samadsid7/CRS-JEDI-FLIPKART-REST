package com.flipkart.client;


import com.flipkart.bean.Professor;
import com.flipkart.dao.StudentDaoOperation;

import javax.validation.ValidationException;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;


@Path("/professors")
public class ProfessorRESTAPIController {



    @POST
    @Path("/post")
    @Consumes("application/json")
    @Produces(MediaType.APPLICATION_JSON)
    public Response createTrackInJSON(Professor professor) {
        System.out.println("hit post service");

        System.out.println("value of title from UI " + professor.getId());
        System.out.println("value of singer form UI" + professor.getName());


        String result = "Track saved : " + professor;


        return Response.status(201).entity(result).build();


    }
}