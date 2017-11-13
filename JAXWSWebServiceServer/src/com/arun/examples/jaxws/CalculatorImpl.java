package com.arun.examples.jaxws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.arun.examples.jaxws.CalculatorI",targetNamespace="com.arun.example.jaxws.soap")
public class CalculatorImpl implements CalculatorI {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

	@Override
	public int multiply(int a, int b) {
		return a * b;
	}

	@Override
	public int divide(int a, int b) {
		return a / b;
	}

}
