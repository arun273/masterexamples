package com.arun.examples.jaxws.client;

import java.util.HashMap;
import java.util.Map;

import soap.jaxws.example.arun.com.Person;

public class PersonUtil {
	private static Map<Integer, Person> map;

	static {
		map = new HashMap<>();

		Person person = new Person();
		person.setId(1);
		person.setName("Arun");
		
		map.put(1, person);
	/*	map.put(2, new Person(2, "B"));
		map.put(3, new Person(3, "C"));
		map.put(4, new Person(4, "D"));
		map.put(5, new Person(5, "E"));*/

	}

	private PersonUtil() {
	}

	public static Person getPerson(Integer id) {
		return map.get(id);
	}
}
