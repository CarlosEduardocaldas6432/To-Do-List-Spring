package com.mataporco.to_do_list.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mataporco.to_do_list.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

    
} 
