package com.shixzh.webservice.service;

@javax.jws.WebService
public class WebServiceImpl implements WebService {

	@Override
	public String sayHello(String name) {
		System.out.println("sayHello run success!");
		String result = name + ", Hello!";
		return result;
	}
}
