/*
 * Copyright 2012-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.adrian;

import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/main")
public class RestResource {
    
    private SampleInjectedService foo;

    //curl --data '{ "id" :10, "date":"2014-12-14" }'  -H "Content-Type: application/json"  http://localhost:10092/main/test3
    //curl.exe, use "{ \"id\" :10, \"date\":\"2014-12-14\" }"
    
    @Autowired
    public RestResource(SampleInjectedService foo) {
        this.foo = foo;
    }
    
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello World";
    }
        
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/test3")
    public Response helloGet() {
        return Response.status(200).entity(someData()).build();
    }

    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/test3")
    public Response helloPost(MyEntity somedata1) {
    	System.out.println(somedata1);
        return Response.status(200).entity(somedata1).build();
    }

    private MyEntity someData() {
        final MyEntity data = new MyEntity();
        data.setId(10);
        data.setDate(new Date());
        return data;
    }



}
