package com.arun.examples.jaxws.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import soap.jaxws.example.arun.com.PersonService;

public class PersonServiceClientDirect {

	public static void main(String[] args) throws Exception {

		URL url = new URL("http://localhost:9992/personServer?wsdl");

		// 1st argument service URI, refer to wsdl document above
		// 2nd argument is service name, refer to wsdl document above
		QName qname = new QName("com.arun.example.jaxws.soap", "PersonServiceImplService");

		Service service = Service.create(url, qname);

		PersonService personServiceI  = service.getPort(PersonService.class);

		System.out.println(personServiceI.getPerson(1).getName());

	}
}
