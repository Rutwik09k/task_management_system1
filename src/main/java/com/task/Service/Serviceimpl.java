package com.task.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.Entity.Task;
import com.task.Repository.TaskRepository;


@Service
public class Serviceimpl implements TaskService {

	
	private final TaskRepository taskRepository;

    @Autowired
    public Serviceimpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
@Override
	 public Task saveTask(Task task) {
	        return taskRepository.save(task);
	    }

	 @Override
	    public Task getTaskById(Long id) {
	        return taskRepository.findById(id).orElse(null);
	    }

	 @Override
	    public Task updateTask(Task task) {
	        return taskRepository.save(task);
	    }
	 @Override
	    public void deleteTaskById(Long id) {
	        taskRepository.deleteById(id);
	    }
	}

