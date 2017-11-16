package com.arun.cxf.springboot.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.cxf.services.helloworld.HelloWorldPortType;
import com.springboot.cxf.types.helloworld.Greeting;
import com.springboot.cxf.types.helloworld.ObjectFactory;
import com.springboot.cxf.types.helloworld.Person;


//http://localhost:7777/codenotfound/ws/helloworld?wsdl

@Component
public class HelloWorldClient {

  @Autowired
  private HelloWorldPortType helloWorldProxy;

  public String sayHello(String firstName, String lastName) {

    ObjectFactory factory = new ObjectFactory();
    Person person = factory.createPerson();
    person.setFirstName(firstName);
    person.setLastName(lastName);

    Greeting response = helloWorldProxy.sayHello(person);

    return response.getGreeting();
  }
}
