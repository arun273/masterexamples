package com.arun.examples.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(targetNamespace="com.arun.example.jaxws.soap")
@SOAPBinding(style = Style.RPC)
public interface CalculatorI {
	@WebMethod
	int add(int a, int b);

	@WebMethod
	int subtract(int a, int b);

	@WebMethod
	int multiply(int a, int b);

	@WebMethod
	int divide(int a, int b);
}
