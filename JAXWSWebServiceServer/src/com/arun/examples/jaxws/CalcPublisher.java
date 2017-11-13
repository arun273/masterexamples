package com.arun.examples.jaxws;

import javax.xml.ws.Endpoint;

public class CalcPublisher {

	public static void main(String[] args) {
		Endpoint ep = Endpoint.create(new CalculatorImpl());
		ep.publish("http://localhost:9993/calcServer");
	}

}
