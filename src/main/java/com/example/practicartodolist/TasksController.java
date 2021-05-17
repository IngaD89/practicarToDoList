package com.example.practicartodolist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;


public class TasksController {
    private List<Task> tasks;


    public TasksController() {
        tasks = new ArrayList<>();
    }

    @GetMapping("/tasks")
    public List<Task> allTasks() {
        return tasks;
    }

    @PostMapping("/tasks")
    public RedirectView addNewTask(Task task) {
        tasks.add(task);
        return new RedirectView("/");
    }


}
