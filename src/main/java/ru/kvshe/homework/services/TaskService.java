package ru.kvshe.homework.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kvshe.homework.domain.User;
import ru.kvshe.homework.repository.TaskRepository;
import ru.kvshe.homework.repository.UserRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;
    private final UserService userService;
    private final UserRepository userRepository;

    public List<User> sortByAge() {
        return userRepository.sortByAge();
    }
}
