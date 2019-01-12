package com.adobe.commercesaas.commercesaas.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="Sample model for the documentation")
public class Something {

    @ApiModelProperty(value = "the message to say")
    private String message;

    public Something() {}

    public Something(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
