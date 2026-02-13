package com.primetrade.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.primetrade.project.entity.Task;
import com.primetrade.project.entity.User;


@Repository
public interface TaskRepository extends JpaRepository<Task, Long>
{
    List<Task> findByUser(User user);
}

