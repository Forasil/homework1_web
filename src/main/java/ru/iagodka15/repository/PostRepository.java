package ru.iagodka15.repository;

import org.springframework.stereotype.Repository;
import ru.iagodka15.model.Post;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class PostRepository {
    private final Map<Integer, Post> posts = new ConcurrentHashMap<>();
    private final AtomicInteger nextId = new AtomicInteger(1);

    public Post save(Post post) {
        if (post.getId() == 0) {
            post.setId(nextId.getAndIncrement());
        }
        posts.put(post.getId(), post);
        return post;
    }

    public Post findById(int id) {
        return posts.get(id);
    }

    public List<Post> findAll() {
        return new ArrayList<>(posts.values());
    }

    public Post update(Post post) {
        posts.put(post.getId(), post);
        return post;
    }

    public void deleteById(int id) {
        posts.remove(id);
    }
}
