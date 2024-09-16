package ru.kvshe.homework.services;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kvshe.homework.domain.User;
import ru.kvshe.homework.repository.UserRepository;

import java.util.Comparator;
import java.util.List;

/**
 * Служба обработки данных
 */
@Service
@Getter
public class DataProcessingService {
    @Autowired
    private UserRepository userRepository;

    public List<User> sortUsersByAge(List<User> users) {
        return users.stream()
                .sorted(Comparator.comparing(User::getAge))
                .toList();
    }

    public List<User> filterUserByAge(List<User> users, int age) {
        return users.stream()
                .filter(user -> user.getAge() > age)
                .toList();
    }

    public double calculateAverageAge(List<User> users) {
        return users.stream()
                .mapToInt(User::getAge)
                .average()
                .orElse(0);
    }

    public void addUserToList(User user) {
        userRepository.getUsers().add(user);
    }
}
