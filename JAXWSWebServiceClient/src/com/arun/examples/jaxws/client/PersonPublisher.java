package com.arun.examples.jaxws.client;

import javax.xml.ws.Endpoint;

public class PersonPublisher {

	public static void main(String[] args) {
		Endpoint ep = Endpoint.create(new PersonServiceDelegateImpl());
		ep.publish("http://localhost:9995/personServer");
	}

}
