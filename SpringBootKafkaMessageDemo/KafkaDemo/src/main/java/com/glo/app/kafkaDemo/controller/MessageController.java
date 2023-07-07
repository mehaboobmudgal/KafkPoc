package com.glo.app.kafkaDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.glo.app.kafkaDemo.model.Message;
import com.glo.app.kafkaDemo.service.MessageProducerService;

@RestController
public class MessageController {
	
	@Autowired
	private  MessageProducerService producerService = null;
	

	@Autowired
	public MessageController(MessageProducerService producerService) {
		super();
		this.producerService = producerService;
	}
	  @PostMapping("/publish")
	    public String publishMessage(@RequestBody Message message) {
	        producerService.sendMessage(message);
	        return "message sent";
	    }
	public MessageController() {
		super();
		// TODO Auto-generated constructor stub
	}


}
