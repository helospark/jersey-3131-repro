package com.example.jerseydemo.exceptionmapper;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.StatusType;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class WebApplicationExceptionMapper implements ExceptionMapper<WebApplicationException> {

    @Override
    public Response toResponse(WebApplicationException e) {
        StatusType statusInfo = e.getResponse().getStatusInfo();

        ErrorResponseJson error = new ErrorResponseJson();
        error.setResult("error");

        return Response
                .status(statusInfo.getStatusCode())
                .entity(error)
                .build();
    }
}
