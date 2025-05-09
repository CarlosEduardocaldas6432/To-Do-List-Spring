package com.mataporco.to_do_list.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mataporco.to_do_list.entity.Todo;
import com.mataporco.to_do_list.repository.TodoRepository;

@Service
public class TodoService { 

    private TodoRepository todoRepository;

    
    
    
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo) {

        todoRepository.save(todo);
        return list();

    }

    public List<Todo> list() {

        Sort sort = Sort.by(Sort.Order.desc("prioridade"))
        .and(Sort.by(Sort.Order.asc("nome")));

       return todoRepository.findAll(sort);
        

    }

    

    public List<Todo> update(Todo todo) {

        todoRepository.save(todo);

        return list();
    }

    

    public List<Todo> delete(Long id) {

        todoRepository.deleteById(id);

        return list();
    }

    





}
