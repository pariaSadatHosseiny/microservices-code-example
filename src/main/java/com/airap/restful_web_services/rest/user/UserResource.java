package com.airap.restful_web_services.rest.user;

import lombok.RequiredArgsConstructor;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserResource {

    private final UserDaoService service;

    @GetMapping(path = "users")
    public List<User> getUsers() {
        return service.findAll();
    }

    /**
     * Using HATEOAS (Hypermedia As The Engine Of Application State)
     * HAL > Json Hypertext Application Language > simple format to hyperlink between resources
     * @return
     */

    @GetMapping(path = "users/{id}")
    public EntityModel<User> getUser(@PathVariable Integer id) {
        User user = service.findOne(id);
        if (user == null) {
            throw new RuntimeException("User with id " + id + " not found");
        }
        WebMvcLinkBuilder linkBuilder = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(UserResource.class).getUsers());
        return EntityModel.of(user).add(linkBuilder.withRel("all-users"));
    }
}
