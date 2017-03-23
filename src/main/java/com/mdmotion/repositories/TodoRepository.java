package com.mdmotion.repositories;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.mdmotion.models.Todo;

public interface TodoRepository extends MongoRepository<Todo, String> {
    public List<Todo> findAll();
    public Todo findOne(String id);
    public Todo save(Todo todo);
    public Todo update(Todo todo);
    public void delete(Todo todo);
}