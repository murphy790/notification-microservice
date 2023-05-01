package com.example.notificationmicroservice.controller;

import com.example.notificationmicroservice.entities.NotificationDetail;
import com.example.notificationmicroservice.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/notification")
public class NotificationController {

    //@Autowired
   // private NotificationService notificationService;
    @GetMapping("/send-notification")
    public ResponseEntity<String> sendNotification() {
       // notificationService.sendNotification(notification);
        System.out.println("WELCOME");
        return ResponseEntity.ok("Success");
    }

//    @PostMapping("/send-notification")
//    public ResponseEntity<String> sendNotification() {
//        System.out.println("WELCOME");
//        notificationService.sendNotification(notification);
//        return ResponseEntity.ok("Success");
//    }
}
