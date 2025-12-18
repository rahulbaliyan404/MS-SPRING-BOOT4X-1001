package com.home.logic;

import com.home.dto.PostgresUserDTO;

public interface PostgresUserLogic {
    PostgresUserDTO saveUser(PostgresUserDTO postgresUserDTO);

    PostgresUserDTO getUser(Long id);
}
