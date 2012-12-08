package com.example.ws.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class ExampleApplication extends Application {

	private Set<Object> singleton = new HashSet<Object>();

	public ExampleApplication() {
		//singleton.add(new Person());
	}
	
	@Override
	public Set<Class<?>> getClasses() {
		HashSet<Class<?>> set = new HashSet<Class<?>>();
		return set;
	}
	
	@Override
	public Set<Object> getSingletons() {
		return singleton;
	}
	 
}
