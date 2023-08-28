package com.app.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.example.demo.model.Child;

public interface Childrep extends JpaRepository<Child, Integer>{

}