package com.archij.jboss61.rest.web;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.archij.jboss61.rest.bean.PersistenceBean;
import com.archij.jboss61.rest.model.Device;

@Stateless
@Path("/RestService")
public class RestPush  {

	@Inject PersistenceBean pb;

    @GET
	@Path("/RegisterDevice")
    public Response registerDevice(@QueryParam("deviceId") String deviceId){
    	Device d = new Device(deviceId);
        pb.addDevice(d);
    	return Response.status(200).entity("Registered "+deviceId).build();
    }

	 @GET
	 @Path("/sayHello")
	  public Response sayHello(){
			  String output = "Hello";
			  return Response.status(200).entity(output).build();
	  }
}
