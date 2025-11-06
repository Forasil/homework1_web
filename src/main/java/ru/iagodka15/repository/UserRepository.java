package ru.iagodka15.repository;

import org.springframework.stereotype.Repository;
import ru.iagodka15.model.User;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class UserRepository {
    private final Map<Integer, User> users = new ConcurrentHashMap<>();
    private final AtomicInteger nextId = new AtomicInteger(1);

    public User save(User user) {
        if (user.getId() == 0) {
            user.setId(nextId.getAndIncrement());
        }
        users.put(user.getId(), user);
        return user;
    }

    public User findById(int id) {
        return users.get(id);
    }

    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }

    public User update(User user) {
        users.put(user.getId(), user);
        return user;
    }

    public void deleteById(int id) {
        users.remove(id);
    }
}
