package com.arun.examples.jaxws.client;

import soap.jaxws.example.arun.com.PersonService;
import soap.jaxws.example.arun.com.PersonServiceImplService;

public class PersonServiceClient {

	public static void main(String[] args) {
		PersonServiceImplService service = new PersonServiceImplService();
		PersonService pService = service.getPersonServiceImplPort();
		
		System.out.println(pService.getPerson(1).getName());
		System.out.println(pService.getPerson(2).getName());
		System.out.println(pService.getPerson(3).getName());
		System.out.println(pService.getPerson(4).getName());
		System.out.println(pService.getPerson(5).getName());
	}

}
