package com.euroforma.backend.controller;

import com.euroforma.backend.model.TodoItem;
import com.euroforma.backend.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
@CrossOrigin(origins = "http://localhost:8080")
public class TodoController {
    private final TodoService todoService;
    public TodoController(TodoService service) {
        this.todoService = service;
    }

    @GetMapping
    public List<TodoItem> getTodos() {
        return todoService.findAll();
    }
    @PostMapping
    public TodoItem addTodo(@RequestBody TodoItem item) {
        return todoService.save(item);
    }
    @PutMapping("/{id}")
    public TodoItem updateTodo(@PathVariable Long id, @RequestBody TodoItem item) {
        item.setId(id);
        return todoService.update(item);

    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id) {
        todoService.deleteById(id);
    }

}
