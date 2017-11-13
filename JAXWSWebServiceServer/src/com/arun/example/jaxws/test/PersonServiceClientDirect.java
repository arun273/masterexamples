package com.arun.example.jaxws.test;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.arun.examples.jaxws.PersonServiceI;

public class PersonServiceClientDirect {

	public static void main(String[] args) throws Exception {

		URL url = new URL("http://localhost:9992/personServer?wsdl");

		// 1st argument service URI, refer to wsdl document above
		// 2nd argument is service name, refer to wsdl document above
		QName qname = new QName("com.arun.example.jaxws.soap", "PersonServiceImplService");

		Service service = Service.create(url, qname);

		PersonServiceI personServiceI  = service.getPort(PersonServiceI.class);

		System.out.println(personServiceI.getPerson(1).getId());
		System.out.println(personServiceI.getPerson(1).getName());

	}
}
