package com.vn.designpattern.factorymethod;

import com.vn.designpattern.service.NotificationService;

public interface NotificationCreator {
	
	NotificationService createNotification();

}
