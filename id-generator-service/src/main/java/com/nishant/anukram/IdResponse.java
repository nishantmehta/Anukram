package com.nishant.anukram;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by nishant on 7/25/17.
 */
public class IdResponse {

    private String id;
    public IdResponse(String id) {
        this.id = id;
    }

    @JsonProperty
    public String getId() {
        return id;
    }
}
