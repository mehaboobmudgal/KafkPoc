package com.glo.app.kafkaDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.glo.app.kafkaDemo.model.Message;

@Service
public class MessageProducerService {
	private static final String TOPIC = "demo_topic";

	@Autowired
    private final KafkaTemplate<String, Object> kafkaTemplate;

	@Autowired
    public MessageProducerService(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(Message message) {
        kafkaTemplate.send(TOPIC, message);
    }

}
