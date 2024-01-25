package com.capstone.realestate.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.capstone.realestate.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    @Query("{'username': ?0, 'password': ?1}")
    User findUser(String username, String password);
}
