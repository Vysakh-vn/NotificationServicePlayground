package com.vn.designpattern.service;

public class EmailNotificationService implements NotificationService {
	
	public void send(String message) {
		System.out.println("Sending email notification : " + message);
	}

}
