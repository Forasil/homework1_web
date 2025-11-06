package ru.iagodka15.model;

import java.time.LocalDateTime;
import jakarta.validation.constraints.*;

public class User {
    private int id;

    @Email(message = "Некорректный email")
    @NotBlank(message = "Email не должен быть пустым")
    private String email;

    @NotBlank(message = "Логин не должен быть пустым")
    private String login;

    @NotBlank(message = "Пароль не должен быть пустым")
    private String password;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public User() {}

    public User(int id, String email, String login, String password,
                LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.email = email;
        this.login = login;
        this.password = password;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
