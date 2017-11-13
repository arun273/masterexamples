package com.arun.examples.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(name="personService",targetNamespace="com.arun.example.jaxws.soap")
@SOAPBinding(style = Style.DOCUMENT)
public interface PersonServiceI {
	@WebMethod
	Person getPerson(Integer id) throws TestException;
}
