package com.chatapp.springwsreattimechatapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import com.chatapp.springwsreattimechatapp.model.MessasgeDTO;
import com.chatapp.springwsreattimechatapp.service.MessageSevice;
import com.mysql.cj.protocol.Resultset;



@Controller
public class MessageController {

	
	@Autowired
	MessageSevice messageService;
	
	@MessageMapping("/chat/private/{from}")
	@SendTo("/topic/messages")
	public MessasgeDTO recieveMessage(@DestinationVariable String from,MessasgeDTO message) {
		System.out.println("reached here");
		MessasgeDTO success = messageService.updateMessage(from,message);
		System.out.println("update done "+success);
		return success;
		
	}
	

	
}
