package com.arun.cxf.springboot.endpoint;

import com.springboot.cxf.services.helloworld.HelloWorldPortType;
import com.springboot.cxf.types.helloworld.Greeting;
import com.springboot.cxf.types.helloworld.ObjectFactory;
import com.springboot.cxf.types.helloworld.Person;

public class HelloWorldImpl implements HelloWorldPortType {

  @Override
  public Greeting sayHello(Person request) {
    String greeting = "Hello " + request.getFirstName() + " " + request.getLastName() + "!";

    ObjectFactory factory = new ObjectFactory();
    Greeting response = factory.createGreeting();
    response.setGreeting(greeting);

    return response;
  }
}
