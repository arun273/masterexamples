package com.arun.cxf.demo;

import javax.jws.WebService;

@WebService
public interface PersonService {

    public String greetPerson(String name);

}
