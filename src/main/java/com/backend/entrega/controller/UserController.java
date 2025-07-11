package com.backend.entrega.controller;

import com.backend.entrega.model.User;
import com.backend.entrega.repository.UserRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Operation(summary = "Get all users")
    @GetMapping
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Operation(summary = "Create a user")
    @PostMapping
    public User create(@RequestBody User user) {
        return userRepository.save(user);
    }

    @Operation(summary = "Delete a user by ID")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userRepository.deleteById(id);
    }
}
