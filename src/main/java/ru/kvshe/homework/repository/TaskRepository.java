package ru.kvshe.homework.repository;

import lombok.Getter;
import org.springframework.stereotype.Repository;
import ru.kvshe.homework.domain.Task;

import java.util.ArrayList;
import java.util.List;

@Repository
@Getter
public class TaskRepository {
    private final List<Task> tasks = new ArrayList<>();
}
