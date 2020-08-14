package com.example.course.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.course.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
