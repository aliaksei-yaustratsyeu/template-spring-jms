package com.stepbysteptopro.template.receiver.service;

import org.springframework.stereotype.Service;

import com.stepbysteptopro.template.model.LoveLetter;

@Service("loveLetterReceiverService")
public class LoveLetterReceiverServiceImpl {
	
	public void receiveLoveLetter(LoveLetter letter) {
		
		System.out.println("======= Love letter ===========");
		System.out.println("From: " + letter.getFrom());
		System.out.println("To: " + letter.getTo());
		System.out.println("Message: " + letter.getMessage());
		
	}
	
}
