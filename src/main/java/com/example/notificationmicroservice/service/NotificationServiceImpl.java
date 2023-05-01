package com.example.notificationmicroservice.service;

import com.example.notificationmicroservice.entities.NotificationDetail;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {
    @Override
    public void sendNotification(NotificationDetail notificationDetail) {
        System.out.println("Welcome,you have have a created a new profile");

    }
}
