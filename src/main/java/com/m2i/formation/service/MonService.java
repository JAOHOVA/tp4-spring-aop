package com.m2i.formation.service;

import org.apache.log4j.Logger;

public class MonService {
	
	private static final Logger l = Logger.getLogger(MonService.class);

	public void hello(String msg) {

		String s = "Hello Formatic " + msg;
		l.info(s);
	}
}
