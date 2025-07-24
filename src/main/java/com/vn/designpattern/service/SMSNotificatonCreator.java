package com.vn.designpattern.service;

import com.vn.designpattern.factorymethod.NotificationCreator;

public class SMSNotificatonCreator implements NotificationCreator {

	@Override
	public NotificationService createNotification() {
		return new SMSNotificationService();
	}
	
	

}
