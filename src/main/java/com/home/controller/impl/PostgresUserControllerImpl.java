package com.home.controller.impl;

import com.home.controller.PostgresUserController;
import com.home.dto.PostgresUserDTO;
import com.home.logic.PostgresUserLogic;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RequestMapping(value = "/postgres_users")
@RestController
public class PostgresUserControllerImpl implements PostgresUserController {

    private final PostgresUserLogic postgresUserLogic;

    public PostgresUserControllerImpl(PostgresUserLogic postgresUserLogic)
    {
        this.postgresUserLogic = postgresUserLogic;
    }

    @PostMapping("/save")
    @Override
    public ResponseEntity<PostgresUserDTO> saveUser (@RequestBody PostgresUserDTO postgresUserDTO) {

        PostgresUserDTO saved = postgresUserLogic.saveUser(postgresUserDTO);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(saved.getId())
                .toUri();
        return ResponseEntity.created(location).body(saved);
    }

    @GetMapping("/{id}")
    public PostgresUserDTO get(Long id) {
        return postgresUserLogic.getUser(id);
    }
}
