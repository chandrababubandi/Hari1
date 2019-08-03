package com.sc.SpringbootWebProj.listner;

import javax.jms.Message;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class SearchMessageListner {

	@JmsListener(destination = "in.search")
	@SendTo("out.search")
	
	public String receiveSearchMessage(Message jsonmesage) {
		System.out.println("received emssage s "+jsonmesage);
		
		return "sucessfully received";
	}
}
