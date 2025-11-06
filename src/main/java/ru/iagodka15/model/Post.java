package ru.iagodka15.model;

import java.time.LocalDateTime;
import jakarta.validation.constraints.*;

public class Post {
    private int id;
    private int authorId;

    @NotBlank(message = "Заголовок не должен быть пустым")
    private String title;

    @NotBlank(message = "Содержимое не должно быть пустым")
    private String content;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Post() {}

    public Post(int id, int authorId, String title, String content,
                LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.authorId = authorId;
        this.title = title;
        this.content = content;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
