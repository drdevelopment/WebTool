package org.drdevelopment.webtool.rest;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
@Provider
public class RestExceptionHandler implements ExceptionMapper<Exception> {
	private static final Logger LOGGER = LoggerFactory.getLogger(RestExceptionHandler.class);

    @Override
    public Response toResponse(Exception exception) {
    	LOGGER.error(exception.getMessage(), exception);
        return Response.status(Status.BAD_REQUEST).entity(exception.getMessage()).build(); 
    }
}
