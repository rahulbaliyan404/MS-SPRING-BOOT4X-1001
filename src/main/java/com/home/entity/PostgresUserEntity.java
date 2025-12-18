package com.home.entity;

import com.home.dto.PostgresUserDTO;
import jakarta.persistence.*;

@Entity
@Table(name = "postgres_users_1001", schema = "public")
public class PostgresUserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private double salary;

    // Constructors
    public PostgresUserEntity() {}

    public PostgresUserEntity(String name, String email, String password, double salary) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static PostgresUserEntity mapToEntity(PostgresUserDTO dto) {
        PostgresUserEntity entity = new PostgresUserEntity();
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
        entity.setPassword(dto.getPassword());
        entity.setSalary(dto.getSalary());
        return entity;
    }
}