package com.vn.designpattern.proxy;

import com.vn.designpattern.service.NotificationService;

public class NotificationServiceProxy implements NotificationService {
	
	private NotificationService notificationService;
	
	public NotificationServiceProxy(NotificationService notificationService) {
		this.notificationService = notificationService;
	}

	@Override
	public void send(String message) {
		System.out.println("[LOG] About to send notification ...");
		notificationService.send(message);
		System.out.println("[LOG] Notification send ...");
	}
	

}
