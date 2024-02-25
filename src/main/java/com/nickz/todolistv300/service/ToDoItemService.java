package com.nickz.todolistv300.service;

import com.nickz.todolistv300.entity.ToDoItem;
import com.nickz.todolistv300.repository.ToDoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
public class ToDoItemService {

    @Autowired
    private ToDoItemRepository toDoItemRepository;

    public Iterable<ToDoItem> getAll(){
        return toDoItemRepository.findAll();
    }

    public Optional<ToDoItem> getById(Long id){
        return toDoItemRepository.findById(id);
    }

    public ToDoItem save(ToDoItem toDoItem){
        if (toDoItem.getId() == null){
            toDoItem.setCreatedAt(Instant.now());
        }
        toDoItem.setUpdatedAt(Instant.now());
        return toDoItemRepository.save(toDoItem);
    }

    public void delete(ToDoItem toDoItem){
        toDoItemRepository.delete(toDoItem);
    }


}
