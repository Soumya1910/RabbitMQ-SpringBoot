package com.message.queue.producer.controller;

import java.util.Date;
import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.message.queue.producer.config.MQConfig;
import com.message.queue.producer.messagedetails.RabbitMQMessageBody;

@RestController
@RequestMapping("")
public class MessagePublisher {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;

	@PostMapping("/publish")
	public String publishMessage(@RequestBody RabbitMQMessageBody customMessage) {
		customMessage.setMessageId(UUID.randomUUID().variant());
		customMessage.setMessageDate(new Date());
		rabbitTemplate.convertAndSend(MQConfig.QUEUE_NAME, MQConfig.ROUTING_KEY, customMessage);
		return "Message is published successfully!!!!";
		
	}
}
