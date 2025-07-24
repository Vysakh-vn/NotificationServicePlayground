package com.vn.designpattern.client;

import com.vn.designpattern.factorymethod.EmailNotificationCreator;
import com.vn.designpattern.factorymethod.NotificationCreator;
import com.vn.designpattern.factorymethod.SMSNotificatonCreator;

public class FactoryMethodPatternClient {
	
	public static void main(String[] args) {
		NotificationCreator smsNotificationCreator = new SMSNotificatonCreator();
		smsNotificationCreator.createNotification().send("Hello");
		
		NotificationCreator emailNotificationCreator = new EmailNotificationCreator();
		emailNotificationCreator.createNotification().send("Hello");
	}

}
