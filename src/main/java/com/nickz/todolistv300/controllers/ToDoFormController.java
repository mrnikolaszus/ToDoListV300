package com.nickz.todolistv300.controllers;

import com.nickz.todolistv300.entity.ToDoItem;
import com.nickz.todolistv300.service.ToDoItemService;
import jakarta.validation.Valid;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class ToDoFormController {

    @Autowired
    private ToDoItemService toDoItemService;

    @GetMapping("/create-todo")
    public String showCreateFrom(ToDoItem toDoItem) {
        return "new-todo-item";
    }

    @PostMapping("/todo")
    public String createToDoItem(@Valid ToDoItem toDoItem, BindingResult result) {
        toDoItemService.save(toDoItem);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteToDoItem(@PathVariable("id") Long id, Model model){
        var item = toDoItemService.getById(id)
                .orElseThrow(() -> new IllegalArgumentException("ToDoItem " + id + "not found"));

        toDoItemService.delete(item);

        return "redirect:/";

    }

    @GetMapping("/edit/{id}")
    public String showUpdateFrom(@PathVariable("id") Long id, Model model){
        var item = toDoItemService.getById(id)
                .orElseThrow(() -> new IllegalArgumentException("ToDoItem " + id + "not found"));

        model.addAttribute("todo", item);
        return "edit-todo-item";

    }


    @PostMapping("/todo/{id}")
    public String updateToDoItem(@PathVariable("id") Long id, @Valid ToDoItem toDoItem, BindingResult bindingResult, Model model){
        var item = toDoItemService.getById(id)
                .orElseThrow(() -> new IllegalArgumentException("ToDoItem " + id + "not found"));

        item.setIsComplete(toDoItem.getIsComplete());
        item.setDescription(toDoItem.getDescription());

        toDoItemService.save(item);

        return "redirect:/";
    }
}
