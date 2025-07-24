package com.vn.designpattern.factory;

import com.vn.designpattern.service.EmailNotificationService;
import com.vn.designpattern.service.NotificationService;
import com.vn.designpattern.service.SMSNotificationService;

public class NotificationFactory {
	
	public static NotificationService createNoficationService(String type) {
		if("SMS".equalsIgnoreCase(type)) return new SMSNotificationService();
		else if ("Email".equalsIgnoreCase(type)) return new EmailNotificationService();
		else throw new IllegalArgumentException();
	}

}
