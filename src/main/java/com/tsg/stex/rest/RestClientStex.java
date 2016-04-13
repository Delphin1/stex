package com.tsg.stex.rest;

import com.tsg.stex.model.Message;
import org.glassfish.jersey.message.GZipEncoder;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by tsg on 11.04.2016.
 */
public class RestClientStex  {
    public Message req(String q) {
        Client client = ClientBuilder.newClient();
        client.register(GZipEncoder.class);
        WebTarget messageTarget = client.target("http://api.stackexchange.com")
                .path("2.2")
                .path("search")
                .queryParam("order", "desc")
                .queryParam("sort", "activity")
                .queryParam("site", "stackoverflow")
                .queryParam("intitle", q);
        //System.out.println(messageTarget.getUri());
        Invocation.Builder builder = messageTarget.request(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .acceptEncoding("gzip");
        Response response = builder.get(Response.class);

        if ( response.getStatus() != Response.Status.OK.getStatusCode() ) {
            //System.out.println( response.readEntity( String.class ) );
            return null;
        }
        return response.readEntity(Message.class);
    }
}
