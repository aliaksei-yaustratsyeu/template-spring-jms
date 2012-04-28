package com.stepbysteptopro.template.sender.service;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import com.stepbysteptopro.template.model.LoveLetter;

@Service("loveLetterSenderService")
public class LoveLetterSenderServiceImpl implements LoveLetterSenderService {
	@Autowired(required=true)
	JmsTemplate template;
	
	@Autowired(required=true)
	Destination queue;
	
	public void sendLoveLetter(final LoveLetter letter) {
		template.send(queue, new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				
				Message message = session.createObjectMessage(letter);
				return message;
				
			}
		});
	}
}
