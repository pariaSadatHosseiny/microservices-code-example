package com.airap.restful_web_services.rest.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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

    @JsonProperty(value = "custom-id-name")
    private Integer id;
    private String name;
    private Date birthday;

    /**
     * Static filtering: to ignore serializing a field for all services
     */
    @JsonIgnore
    private String ignorableField;

    /**
     * Dynamic filtering: This method demonstrates dynamic filtering using Jackson's `@JsonFilter`.
     * The only annotation used here is `@JsonFilter("FilterName")`, and the rest of the logic is
     * implemented in the endpoint.
     */

    //Sample code:

    // field1, field2 are exposed using filtering
     /* @GetMapping("/filtering")
      public MappingJacksonValue retrieveSomeBean() {
          SomeBean someBean = new SomeBean("value1", "value2", "value3");

          // Define which fields to include in the response
          SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field2");

          // Apply the filter to the bean
          FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);

          // Map the bean and apply the filter
          MappingJacksonValue mapping = new MappingJacksonValue(someBean);
          mapping.setFilters(filters);

          return mapping;
      }
*/


}
