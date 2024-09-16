package ru.kvshe.homework.repository;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;
import ru.kvshe.homework.domain.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Repository
@Getter
@Setter
public class UserRepository {
    private List<User> users = new ArrayList<>();

    public List<User> sortByAge() {
        users.sort(Comparator.comparingInt(User::getAge));

        return users;
    }
}
