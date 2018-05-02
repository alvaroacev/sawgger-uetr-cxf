package io.swagger.api.impl;

import io.swagger.api.*;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * UETR API
 *
 * <p>The purpose of this specification is to provide simple way to generate a UUID
 *
 */
public class DefaultApiServiceImpl implements DefaultApi {
    /**
     * Get a valid UETR
     *
     * Returns a UUID
     *
     */
    public String uetr() {
        // TODO: Implement...
        
        return null;
    }
    
}

