package com.vn.designpattern.service;

public class SMSNotificationService implements NotificationService {
	
	public void send(String message) {
		System.out.println("Sending SMS notification : " + message);
	}

}
