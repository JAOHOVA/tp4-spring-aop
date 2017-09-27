package com.m2i.formation.service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.m2i.formation.service.MonService;

public class MonServiceTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testHello() {
		ApplicationContext context = (ApplicationContext) new ClassPathXmlApplicationContext(new String[] {"springContext.xml"});
		MonService monService = (MonService) context.getBean("monService");
		monService.hello("with AOP");
	}

}
