package com.airap.restful_web_services.rest.versioning;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonV2 {
    public PersonV2(String firstName, String familyName) {
        this.firstName = firstName;
        this.familyName = familyName;
    }

    private String firstName;
    private String familyName;

}
