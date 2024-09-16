package ru.kvshe.homework.services;

import org.springframework.stereotype.Service;
import ru.kvshe.homework.domain.User;

@Service
public class NotificationService {
    public void userNotification(User user) {
        System.out.println("A new user has been created: " + user.getName());
    }
}
