package com.home.controller;

import com.home.dto.PostgresUserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/api")
public interface PostgresUserController {

    ResponseEntity<PostgresUserDTO> saveUser(PostgresUserDTO postgresUserDTO);

    public PostgresUserDTO get(@PathVariable Long id);

}
