package com.nishant.anukram.resource;

import com.codahale.metrics.annotation.Timed;
import com.nishant.anukram.Id;
import com.nishant.anukram.IdResponse;
import com.nishant.anukram.supplier.IdSupplier;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by nishant on 7/25/17.
 */

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class AnukramResource {

    private final IdSupplier idSupplier;
    public AnukramResource(IdSupplier idSupplier) {
        this.idSupplier = idSupplier;
    }

    @GET
    @Timed
    @Path("/getId")
    public IdResponse getPing() {
        return new IdResponse(idSupplier.getNextId().getId());
    }
}
