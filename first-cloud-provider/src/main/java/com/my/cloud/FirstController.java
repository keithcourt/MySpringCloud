package com.my.cloud;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: liuxw
 * @Description:
 * @Date: Created in 15:45 2018/4/27
 * @Modified By:
 */

@RestController
public class FirstController {

    @RequestMapping(value = "/person/{personId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findPerson(@PathVariable("personId") Integer personId, HttpServletRequest request){
        Person p = new Person(personId, "PersonName" + personId, 30);
        p.setMessage(request.getRequestURL().toString() );
        return p;
    }
}
