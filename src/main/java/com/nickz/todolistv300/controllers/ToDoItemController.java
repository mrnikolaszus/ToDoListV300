package com.nickz.todolistv300.controllers;

import com.nickz.todolistv300.service.ToDoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ToDoItemController {

    @Autowired
    private ToDoItemService toDoItemService;

    @GetMapping("/")
    public ModelAndView index(){
        var modelAndView = new ModelAndView("index");
        modelAndView.addObject("toDoItems", toDoItemService.getAll());
        return modelAndView;
    }


}
