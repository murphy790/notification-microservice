package com.example.notificationmicroservice.service;

import com.example.notificationmicroservice.entities.NotificationDetail;

public interface NotificationService {
    public void sendNotification(NotificationDetail notificationDetail);
}
