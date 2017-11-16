package com.jaxws.series.bottom.up.approach.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService(name="BookService")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public interface IBookService {


	@WebMethod(operationName="getBookNameBasedOnISBN")
	@WebResult(name="matchedString")
	public String getBookNameBasedOnISBN(@WebParam(name="isbnNumber") String isbnNumber);
}