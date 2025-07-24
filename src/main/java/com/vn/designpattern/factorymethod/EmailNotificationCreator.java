package com.vn.designpattern.factorymethod;

import com.vn.designpattern.service.EmailNotificationService;
import com.vn.designpattern.service.NotificationService;

public class EmailNotificationCreator implements NotificationCreator {
	
	public NotificationService createNotification() {
		return new EmailNotificationService();
	}

}
