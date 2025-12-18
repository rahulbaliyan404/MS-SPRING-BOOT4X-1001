package com.home.dao;

import com.home.dto.PostgresUserDTO;
import com.home.entity.PostgresUserEntity;

public interface PostgresUserDAO {
    PostgresUserEntity saveUser(PostgresUserEntity postgresUserEntity);

    PostgresUserEntity getUser(Long id);
}
