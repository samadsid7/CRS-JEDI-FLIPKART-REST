package com.flipkart.client;


import com.flipkart.bean.Professor;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/professors")
public class ProfessorRESTAPIController {

    @GET
    @Path("/professorDetails")
    @Produces(MediaType.APPLICATION_JSON)
    public Professor getProfessorDetails() {

        //  client --- service ---- dao ----> SQL

        Professor professor=new Professor();
        professor.setId("101");
        professor.setName("Amit");

        return professor;
    }

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