package com.stepbysteptopro.template.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Receiver {
	
	private static Logger logger = LoggerFactory.getLogger(Receiver.class);
	
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("receiver-context.xml");
		
		logger.info("Receiver is running...");
	}
}
