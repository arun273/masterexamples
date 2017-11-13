package com.arun.cxf.demo;

import javax.jws.WebService;

//http://localhost:9992/CXFExampleService/personService?wsdl

@WebService(endpointInterface = "com.arun.cxf.demo.PersonService")
public class PersonServiceImpl implements PersonService {

    public String greetPerson(String name) {
        Person person = new Person(name);

        return "Hello " + person.getName() + "!";
    }

}
