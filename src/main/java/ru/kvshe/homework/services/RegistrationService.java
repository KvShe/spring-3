package ru.kvshe.homework.services;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;
import ru.kvshe.homework.domain.User;

@Service
@AllArgsConstructor
@Getter
public class RegistrationService {
    private final UserService userService;
    private final DataProcessingService dataProcessingService;
    private final NotificationService notificationService;

    public void processRegistration(User user) {
        userService.createUser(user.getName(), user.getAge(), user.getEmail());
    }
}
