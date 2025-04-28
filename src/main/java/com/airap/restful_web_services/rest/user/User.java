package com.airap.restful_web_services.rest.user;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class User {
    public User(int id, String name, Date birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    private Integer id;
    private String name;
    private Date birthday;
}
