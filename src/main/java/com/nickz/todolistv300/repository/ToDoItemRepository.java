package com.nickz.todolistv300.repository;

import com.nickz.todolistv300.entity.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoItemRepository extends JpaRepository<ToDoItem, Long> {
}
