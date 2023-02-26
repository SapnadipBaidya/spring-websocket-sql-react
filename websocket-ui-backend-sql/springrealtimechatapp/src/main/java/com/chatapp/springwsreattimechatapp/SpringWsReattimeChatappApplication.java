package com.chatapp.springwsreattimechatapp;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWsReattimeChatappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWsReattimeChatappApplication.class, args);
		System.out.println("project Started");
		
//		Configuration cfg= new Configuration();
//		cfg.configure("hibernate.cfg.xml");
//		SessionFactory factory = cfg.buildSessionFactory();
//		System.out.println(factory);
//		System.out.println("hoa");
		
	}

}
