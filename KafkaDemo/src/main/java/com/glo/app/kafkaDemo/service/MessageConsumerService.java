package com.glo.app.kafkaDemo.service;

import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.glo.app.kafkaDemo.model.Message;

@Service
public class MessageConsumerService {
	
	private static final org.slf4j.Logger LOGGER=LoggerFactory.getLogger(MessageConsumerService.class);

	@KafkaListener(topics = "demo_topic", groupId = "demo_group")
    public Message consumeMessage(Message message) {
		LOGGER.info(String.format("Message Received -> %s", message.toString()));

        System.out.println("-----Received message:------ " + message);
        // Process the received message as per your requirement
        return message;
 }

}
