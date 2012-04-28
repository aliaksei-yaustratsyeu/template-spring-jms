package com.stepbysteptopro.template.sender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stepbysteptopro.template.model.LoveLetter;
import com.stepbysteptopro.template.sender.service.LoveLetterSenderService;


public class Sender {
	
	private static Logger logger = LoggerFactory.getLogger(Sender.class);
	
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("sender-context.xml");

		LoveLetterSenderService loveSenderService = (LoveLetterSenderService) context.getBean("loveLetterSenderService");

		LoveLetter letter = new LoveLetter("Hellen", "Aliaksei", "I love you!");
		
		loveSenderService.sendLoveLetter(letter);
		
		logger.info("Love letter has sent.");
	}
}
