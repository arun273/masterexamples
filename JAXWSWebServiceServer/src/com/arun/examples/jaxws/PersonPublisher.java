package com.arun.examples.jaxws;

import javax.xml.ws.Endpoint;

public class PersonPublisher {

	public static void main(String[] args) {
		Endpoint ep = Endpoint.create(new PersonServiceImpl());
		ep.publish("http://localhost:9992/personServer");
	}

}
