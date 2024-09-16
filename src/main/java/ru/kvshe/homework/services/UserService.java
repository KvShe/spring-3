package ru.kvshe.homework.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kvshe.homework.domain.User;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    public final NotificationService notificationService;

    public User createUser(String name, int age, String email) {
        User user = new User(name, age, email);
        notificationService.userNotification(user); // отправляем уведомление о создании нового user

        return user;
    }
}
