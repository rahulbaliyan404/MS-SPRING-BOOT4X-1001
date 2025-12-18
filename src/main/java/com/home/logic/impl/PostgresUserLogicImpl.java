package com.home.logic.impl;

import com.home.dao.PostgresUserDAO;
import com.home.dto.PostgresUserDTO;
import com.home.entity.PostgresUserEntity;
import com.home.logic.PostgresUserLogic;
import org.springframework.stereotype.Service;

import static com.home.dto.PostgresUserDTO.mapToDTO;
import static com.home.entity.PostgresUserEntity.mapToEntity;

@Service
public class PostgresUserLogicImpl implements PostgresUserLogic {

    private final PostgresUserDAO postgresUserDAO;

    public PostgresUserLogicImpl(PostgresUserDAO postgresUserDAO)
    {
        this.postgresUserDAO = postgresUserDAO;
    }

    @Override
    public PostgresUserDTO saveUser(PostgresUserDTO postgresUserDTO) {

        PostgresUserEntity savedUser = postgresUserDAO.saveUser(mapToEntity(postgresUserDTO));
        return mapToDTO(savedUser);
    }

    @Override
    public PostgresUserDTO getUser(Long id) {
        return mapToDTO(postgresUserDAO.getUser(id));
    }
}
