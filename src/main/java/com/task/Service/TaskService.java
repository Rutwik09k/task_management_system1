package com.task.Service;

import java.util.List;

import com.task.Entity.Task;


public interface TaskService {

    List<Task> getAllTasks();

    Task saveTask(Task task);

    Task getTaskById(Long id);

    Task updateTask(Task task);

    void deleteTaskById(Long id);
}