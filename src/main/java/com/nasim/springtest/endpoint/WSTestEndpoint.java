package com.nasim.springtest.endpoint;

import com.nasim.springtest.service.RNGService;
import com.nasim.springtest.service.SimpleService;
import com.nasim.springtest.ws.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * @author Tariq M Nasim
 */
@Endpoint
public class WSTestEndpoint {
    //To calculate random of the input.
    @Autowired
    private RNGService randomService;

    @Autowired
    private SimpleService simpleService;

    //This is like @RequestMapping of Spring MVC
    @PayloadRoot(localPart = "RandomServiceRequest", namespace = "http://nasim.blogspot.com/spring-wstest")
    @ResponsePayload
    public RandomServiceResponse getRandom(@RequestPayload RandomServiceRequest request) {
        RandomServiceResponse response = new ObjectFactory().createRandomServiceResponse();
        response.setOutput(randomService.random(request.getInput()));
        return response;
    }

    @PayloadRoot(localPart = "SimpleServiceRequest", namespace = "http://nasim.blogspot.com/spring-wstest")
    @ResponsePayload
    public SimpleServiceResponse getSimple(@RequestPayload SimpleServiceRequest request) {
        SimpleServiceResponse response = new ObjectFactory().createSimpleServiceResponse();
        response.setOutput(simpleService.getSimple(request.getInput()));
        return response;
    }
}