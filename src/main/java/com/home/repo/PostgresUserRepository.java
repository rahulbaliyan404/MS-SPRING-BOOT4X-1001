package com.home.repo;

import com.home.entity.PostgresUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostgresUserRepository extends JpaRepository<PostgresUserEntity, Long> {
    //https://github.com/SaiUpadhyayula/spring-boot-redis-cache/blob/main/src/main/java/com/techie/springbootrediscache/service/ProductService.java
}
