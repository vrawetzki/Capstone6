package com.capstone6practice.capstone6practice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone6practice.capstone6practice.variablesnikki.Task;

public interface TaskRepository extends JpaRepository<Task, String> {

	Task getTask(String job);
}
