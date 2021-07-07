package com.example.demo.api.controller;

import com.example.demo.api.model.Task;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskController {

    @GetMapping("/task")
    public List<Task> getAllTask() {
        return null;
    }

    @PostMapping("/addTask")
    public void addTask(@RequestBody Task task) {
        System.out.println(task);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable Long id) {
        System.out.println(id);
    }
}
