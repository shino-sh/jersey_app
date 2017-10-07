package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.glassfish.jersey.server.mvc.Viewable;

@Path("hello")
public class MyResource {

    @GET
    public Viewable helloWorld() {
        return new Viewable("/hello_mvc");
    }

//    @Produces(MediaType.TEXT_PLAIN)
//    public String getIt() {
//        return "Got it!";
//    }

}