package com.jaxws.series.bottom.up.approach.service;

import javax.jws.WebService;

@WebService(serviceName="BookService", endpointInterface="com.jaxws.series.bottom.up.approach.service.IBookService")
public class BookServiceImpl implements IBookService {

	// http://localhost:9992/ApacheCXF-JAX-WS-Bottom-Up/services/book/BookService?wsdl

	public String getBookNameBasedOnISBN(String isbnNumber) {

		if(isbnNumber.equalsIgnoreCase("ISBN-9992")){
			return "Microbiology";
		}
		return "Invalid_ISBN_Number";
	}
}