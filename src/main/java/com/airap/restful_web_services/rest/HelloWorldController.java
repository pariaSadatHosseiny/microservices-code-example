package com.airap.restful_web_services.rest;


import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequiredArgsConstructor
public class HelloWorldController {
    private final MessageSource messageSource;

    @GetMapping(path = "/hello-world-i18n")
    public String helloWorld(Locale locale) {

        //Accept-Language header is used to fill out the locale
        //Can also be retrieved as follows
        // locale = LocaleContextHolder.getLocale();

        return messageSource.getMessage("good.morning.message",null,"default message",locale);
    }
}
