package com.example.taskapp.controller;

import com.example.taskapp.model.Task;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {

    private List<Task> tasks = new ArrayList<>();

    @GetMapping("/tasks")
    public List<Task> getTasks() {
        return tasks;
    }

    @PostMapping("/tasks")
    public String addTask(@RequestBody Task task) {
        tasks.add(task);
        return "Task added successfully";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is running";
    }
}
