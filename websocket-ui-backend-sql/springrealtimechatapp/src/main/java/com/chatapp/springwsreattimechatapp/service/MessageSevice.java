package com.chatapp.springwsreattimechatapp.service;

import java.io.IOException;
import java.net.URI;
import java.security.Principal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.management.Query;


import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

import com.chatapp.springwsreattimechatapp.model.MessasgeDTO;
import com.mysql.cj.protocol.Resultset;
import com.zaxxer.hikari.util.ClockSource.Factory;

@Service
public class MessageSevice {
	public MessasgeDTO updateMessage(String from ,MessasgeDTO message) {
		MessasgeDTO messageResult = new MessasgeDTO();
		System.out.println("indao "+ message.getMessage());
		
		String sql = "update chat_private_users as cpu  set  cpu.meassage = \""+message.getMessage() +"\" where cpu.user_name = "+ "\"" +(String)from +"\"";
		String sqlSelect = "select cpu.meassage , cpu.user_name from chat_private_users as cpu   where cpu.user_name = "+ "\"" +(String)from +"\"";
		try {
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/chat_app_db?user=root&password=@nush0na");
			PreparedStatement ps = conn.prepareStatement(sql);
	        ps.executeUpdate();
			PreparedStatement ps1 = conn.prepareStatement(sqlSelect);
			ResultSet data =  ps1.executeQuery();
			String messagesql = null;
			String username = null;
		while(data.next()) {
		 messagesql = data.getString(1);
		 username = data.getString(2);
		}
		messageResult.setMessage(messagesql+" parsed");
		messageResult.setUserName(username);
			return messageResult;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
				
	}
}
