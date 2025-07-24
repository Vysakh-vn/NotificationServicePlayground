package com.vn.designpattern.client;

import com.vn.designpattern.factory.NotificationFactory;
import com.vn.designpattern.service.NotificationService;

public class FactoryPatternClient {
	
	public static void main(String[] args) {
		
		String type = "SMS";
		NotificationService notificationService = NotificationFactory.createNoficationService(type);
		
		String message = "Hello";
		notificationService.send(message);
	}

}
