package ru.iagodka15.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.iagodka15.model.Post;
import ru.iagodka15.repository.PostRepository;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    public Post getPostById(int id) {
        return postRepository.findById(id);
    }

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Post updatePost(Post post) {
        return postRepository.update(post);
    }

    public void deletePostById(int id) {
        postRepository.deleteById(id);
    }
}
