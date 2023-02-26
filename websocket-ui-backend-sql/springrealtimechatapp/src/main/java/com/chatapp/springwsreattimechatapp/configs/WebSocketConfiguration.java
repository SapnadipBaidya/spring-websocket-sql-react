package com.chatapp.springwsreattimechatapp.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration  
@EnableWebSocketMessageBroker //This Annotation Allow us to enable websocket in our project.
public class WebSocketConfiguration implements WebSocketMessageBrokerConfigurer{

	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		//This method we will use for setting websocket endpoint connection into WebSocket
		registry.addEndpoint("/ws").setAllowedOriginPatterns("*").withSockJS();
		System.out.println("jofjoadsf");
	}
	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry) {
		//This Method we will use for setting application destination prexies websocket and enable simple broker for topic to subscribe in our project websocket
		 // Set prefix for the endpoint that the client listens for our messages from
        registry.enableSimpleBroker("/topic");
        
        // Set prefix for endpoints the client will send messages to
        registry.setApplicationDestinationPrefixes("/app");
    
	}
}
