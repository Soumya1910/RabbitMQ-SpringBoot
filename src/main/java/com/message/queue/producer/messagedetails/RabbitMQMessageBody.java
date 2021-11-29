package com.message.queue.producer.messagedetails;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RabbitMQMessageBody {

	private int messageId;
	private String message;
	private Date messageDate;
}
