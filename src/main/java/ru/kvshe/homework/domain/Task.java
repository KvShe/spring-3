package ru.kvshe.homework.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Task {
    private int id;
    private String name;
    private String description;
    private LocalDateTime createdAt;

    @Override
    public String toString() {
        return id + " " + name + " " + description + " " + createdAt;
    }
}
