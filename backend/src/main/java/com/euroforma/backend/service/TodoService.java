package com.euroforma.backend.service;

import com.euroforma.backend.model.TodoItem;
import com.euroforma.backend.repository.TodoItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TodoService {
    private final TodoItemRepository repository;

    public TodoService(TodoItemRepository repository) {
        this.repository = repository;
    }
    public List<TodoItem> findAll() {
        return repository.findAll();
    }
    public void deleteById(long id) {
        repository.deleteById(id);
    }
    public TodoItem update(TodoItem todoItem) {
        return repository.save(todoItem);
    }
    public TodoItem save(TodoItem todoItem) {
        return repository.save(todoItem);
    }
}
