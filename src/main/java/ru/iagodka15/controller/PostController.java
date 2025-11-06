package ru.iagodka15.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import ru.iagodka15.model.Post;
import ru.iagodka15.service.PostService;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping
    public Post createPost(@Valid @RequestBody Post post) {
        return postService.createPost(post);
    }

    @GetMapping
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("/{id}")
    public Post getPostById(@PathVariable int id) {
        return postService.getPostById(id);
    }

    @PutMapping("/{id}")
    public Post updatePost(@PathVariable int id, @Valid @RequestBody Post post) {
        post.setId(id);
        return postService.updatePost(post);
    }

    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable int id) {
        postService.deletePostById(id);
    }
}
