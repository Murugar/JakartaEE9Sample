package com.iqmsoft.jakartaee9.resources;



import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;


@Path("jakartaee9")
public class JakartaEE9Resource {
   
   @GET
   public String test() {
	   return "test";
   }
}
