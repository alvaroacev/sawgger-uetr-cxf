package io.swagger.api;


import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * UETR API
 *
 * <p>The purpose of this specification is to provide simple way to generate a UUID
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface DefaultApi  {

    /**
     * Get a valid UETR
     *
     * Returns a UUID
     *
     */
    @GET
    @Path("/uetr")
    @ApiOperation(value = "Get a valid UETR", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Valid request sent to", response = String.class),
        @ApiResponse(code = 404, message = "URI not found") })
    public String uetr();
}

