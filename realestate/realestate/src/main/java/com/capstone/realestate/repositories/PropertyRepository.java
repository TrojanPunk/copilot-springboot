package com.capstone.realestate.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capstone.realestate.models.PropertyDetails;

public interface PropertyRepository extends MongoRepository<PropertyDetails, String> {
    
}