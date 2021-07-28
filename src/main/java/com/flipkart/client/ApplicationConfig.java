package com.flipkart.client;

import org.glassfish.jersey.server.ResourceConfig;



public class ApplicationConfig extends ResourceConfig {

    public ApplicationConfig() {
        // All the web servies to be registered Here
//        register(AdminRESTAPIController.class);
//        register(UserRESTAPIController.class);
        register(ProfessorRESTAPIController.class);
//        register(UserRESTAPIController.class);
        register(HelloController.class);

    }

}