package com.vn.designpattern.factorymethod;

import com.vn.designpattern.service.NotificationService;
import com.vn.designpattern.service.SMSNotificationService;

public class SMSNotificatonCreator implements NotificationCreator {

	@Override
	public NotificationService createNotification() {
		return new SMSNotificationService();
	}
	
	

}
