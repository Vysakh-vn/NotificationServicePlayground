package com.vn.designpattern.client;

import com.vn.designpattern.factorymethod.SMSNotificatonCreator;
import com.vn.designpattern.proxy.NotificationServiceProxy;
import com.vn.designpattern.service.NotificationService;

public class ProxyClient {
	
	public static void main(String[] args) {
		NotificationService smsNotficationService = new SMSNotificatonCreator().createNotification();
		NotificationServiceProxy proxy = new NotificationServiceProxy(smsNotficationService);
		proxy.send("Hello");
	}

}
