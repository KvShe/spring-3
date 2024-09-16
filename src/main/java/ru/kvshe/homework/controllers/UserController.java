package ru.kvshe.homework.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.kvshe.homework.domain.User;
import ru.kvshe.homework.services.RegistrationService;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {
    private final RegistrationService registrationService;

    @GetMapping
    public List<User> userList() {
        return registrationService
                .getDataProcessingService()
                .getUserRepository()
                .getUsers();
    }

    @PostMapping("/body")
    public String userAddFromBody(@RequestBody User user) {
        registrationService
                .getDataProcessingService()
                .getUserRepository()
                .getUsers()
                .add(user);

        return "User added from body";
    }
}
