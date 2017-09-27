package com.m2i.formation.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class MonLogger {

	private static final Logger l = Logger.getLogger(MonLogger.class);

	public void logMethodEntry(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().toLongString();
		l.info("In method " + name + " : ");
	}

	public void logMethodExit(JoinPoint joinPoint, Object result) {
		String name = joinPoint.getStaticPart().getSignature().toLongString();
		l.info("Out of " + name + ", result : [" + result + "]");
	}
}
