package com.automaat.repositories;

import com.automaat.model.SimpleResource;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SimpleResourceRepository extends MongoRepository<SimpleResource, String> {

    List<SimpleResource> findByName(String name);
}
