package com.example.servingwebcontent.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmailRepository extends CrudRepository<Email, Long> {

    Email findById(long id);
}


