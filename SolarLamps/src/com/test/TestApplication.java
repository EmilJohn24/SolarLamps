package com.test;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class TestApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(AddressBook.class);
		classes.add(TestResource.class);
		classes.add(TestSubresource.class);
		return classes;
	}

}
