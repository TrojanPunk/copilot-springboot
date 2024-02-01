package com.capstone.realestate.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capstone.realestate.models.PropertyDetails;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepository extends MongoRepository<PropertyDetails, String> {

    @Query("{ 'category' : ?0, 'area' : { $lte: ?1 }, 'price' : { $gte: ?2, $lte: ?3 } }")
    List<PropertyDetails> findFilteredData(String category, int maxArea, int minPrice, int maxPrice);
    
}