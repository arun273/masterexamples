package com.arun.examples.jaxws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.arun.examples.jaxws.PersonServiceI",targetNamespace="com.arun.example.jaxws.soap")
public class PersonServiceImpl implements PersonServiceI {

	@Override
	public Person getPerson(Integer id) throws TestException {
		return PersonUtil.getPerson(id);
	}

}
