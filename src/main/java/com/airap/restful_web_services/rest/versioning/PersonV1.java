package com.airap.restful_web_services.rest.versioning;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonV1 {
    public PersonV1(String name) {
        this.name = name;
    }

    private String name;
}
