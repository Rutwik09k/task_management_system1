package com.task.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.Entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}