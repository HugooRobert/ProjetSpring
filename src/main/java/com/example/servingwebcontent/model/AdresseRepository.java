package com.example.servingwebcontent.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AdresseRepository extends CrudRepository<Adresse, Long> {
    Adresse findById(long id);
}
