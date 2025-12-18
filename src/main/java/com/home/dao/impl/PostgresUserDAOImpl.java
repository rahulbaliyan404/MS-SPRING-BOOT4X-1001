package com.home.dao.impl;

import com.home.dao.PostgresUserDAO;
import com.home.entity.PostgresUserEntity;
import com.home.repo.PostgresUserRepository;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class PostgresUserDAOImpl implements PostgresUserDAO {

    private final PostgresUserRepository userRepository;

    public PostgresUserDAOImpl(PostgresUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @CachePut(value = "users", key = "#result.id")
    @Override
    public PostgresUserEntity saveUser(PostgresUserEntity postgresUserEntity) {
        Optional.ofNullable(postgresUserEntity)
                .orElseThrow(() -> new IllegalArgumentException("User entity cannot be null"));

        return userRepository.save(postgresUserEntity);
    }

    @Cacheable(value = "users", key = "#id")
    public PostgresUserEntity getUser(Long id) {

        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
//https://github.com/SaiUpadhyayula/spring-boot-redis-cache/blob/main/src/main/java/com/techie/springbootrediscache/service/ProductService.java
