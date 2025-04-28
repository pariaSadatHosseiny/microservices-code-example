package com.airap.restful_web_services.rest.versioning;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class VersioningPersonController {

    /**
     *
     * Api versioning - URI Versioning
     */
    @GetMapping("/v1/person")
    public PersonV1 getPersonFirstVersion() {
        return new PersonV1("Paria Hosseiny");
    }

    @GetMapping("/v2/person")
    public PersonV2 getPersonSecondVersion() {
        return new PersonV2("Paria","Hosseiny");
    }


    /**
     *
     * Api versioning - Request Param Versioning
     */
    @GetMapping(value = "/person", params = "version=1")
    public PersonV1 getPersonWithParamFirstVersion() {
        return new PersonV1("Paria Hosseiny");
    }

    @GetMapping(value = "/person",params = "version=2")
    public PersonV2 getPersonWithParamSecondVersion() {
        return new PersonV2("Paria","Hosseiny");
    }

    /**
     *
     * Api versioning - Custom Header Versioning
     */
    @GetMapping(value = "/person", headers = "X-API-VERSION=1")
    public PersonV1 getPersonWithHeaderFirstVersion() {
        return new PersonV1("Paria Hosseiny");
    }

    @GetMapping(value = "/person",headers = "X-API-VERSION=2")
    public PersonV2 getPersonWithHeaderSecondVersion() {
        return new PersonV2("Paria","Hosseiny");
    }

    /**
     *
     * Api versioning - Content negotiation or Accept header Versioning
     */
    @GetMapping(value = "/person", produces = "application/vnd.company.app-v1+json")
    public PersonV1 getPersonWithAcceptFirstVersion() {
        return new PersonV1("Paria Hosseiny");
    }

    @GetMapping(value = "/person",produces = "application/vnd.company.app-v2+json")
    public PersonV2 getPersonWithAcceptSecondVersion() {
        return new PersonV2("Paria","Hosseiny");
    }
}
