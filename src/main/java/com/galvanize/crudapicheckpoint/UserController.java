package com.galvanize.crudapicheckpoint;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
public class UserController {
    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    //Endpoint 1
    @GetMapping("/users")
    public Iterable<User> getAllUsers() {
        return this.repository.findAll();
    }

    //Endpoint 2
    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return this.repository.save(user);
    }

    //Endpoint 3
    @GetMapping("/users/{id}")
    public Optional<User> getOneUser(@PathVariable Long id) {
        return this.repository.findById(id);
    }

    //Endpoint 4
    @PatchMapping("/users/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody Map<String, String> userMap) {
        User updatedUser = this.repository.findById(id).get();

        userMap.forEach((key, value) -> {
            if (key.equals("email")) {
                updatedUser.setEmail(value);
            } else if (key.equals("password")) {
                updatedUser.setPassword(value);
            }
        });
        return this.repository.save(updatedUser);
    }

    //Endpoint 5
    @DeleteMapping("/users/{id}")
    public Map<String, Integer> deleteUser (@PathVariable Long id){
        Map<String, Integer> userMap = new HashMap<>();





        return userMap;
    }


    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> catchNoSuchElementException() {
        return new ResponseEntity<>("does not exist", HttpStatus.NOT_FOUND);
    }

}

