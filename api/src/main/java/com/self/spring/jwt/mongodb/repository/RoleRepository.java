package com.self.spring.jwt.mongodb.repository;

import com.self.spring.jwt.mongodb.models.ERole;
import com.self.spring.jwt.mongodb.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
