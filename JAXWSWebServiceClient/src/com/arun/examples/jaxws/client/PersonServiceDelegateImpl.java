package com.arun.examples.jaxws.client;

import javax.jws.WebService;

import soap.jaxws.example.arun.com.Person;
import soap.jaxws.example.arun.com.PersonService;

@WebService(endpointInterface = "soap.jaxws.example.arun.com.PersonService", targetNamespace = "com.arun.example.jaxws.soap")
public class PersonServiceDelegateImpl implements PersonService {

	@Override
	public Person getPerson(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
