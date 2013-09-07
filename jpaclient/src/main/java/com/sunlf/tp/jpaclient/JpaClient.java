package com.sunlf.tp.jpaclient;



import com.sunlf.tp.testbirt.db.openjpa.Person;
import com.sunlf.tp.testbirt.db.openjpa.PersonService;

import javax.naming.InitialContext;



public class JpaClient {

	public void init() throws Exception {

		Thread.sleep(15000);
		InitialContext icx = new InitialContext();
        PersonService personService = (PersonService) icx.lookup("osgi:service/"
				+ PersonService.class.getName());

		System.out.println(personService);
        Person person=new Person("tst","hello");
        personService.add(person);


	}
}
