package com.adobe.commercesaas.commercesaas.resource;

import com.adobe.commercesaas.commercesaas.dto.Something;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saascommerce")
@Api(value="/myfirstapi")
public class MyFirstApiResource {
    private static Logger logger = LoggerFactory.getLogger(MyFirstApiResource.class);

    @RequestMapping(value = "/myfirstapi",method = RequestMethod.GET)
    @ApiOperation(value = "Displays a message", notes = "The message is read from the properties", response = Something.class )
    @ApiResponses(value = { @ApiResponse(code = 500, message = "Something went wrong") })
    public Something saySomething() {
        logger.info("This is a log in saySomething");
        return new Something("At times something is Everything");
    }

}
