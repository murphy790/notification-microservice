package com.example.notificationmicroservice.repository;

import com.example.notificationmicroservice.entities.NotificationDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<NotificationDetail, Long> {
}
