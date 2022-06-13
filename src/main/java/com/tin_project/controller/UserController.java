package com.tin_project.controller;

import com.tin_project.model.User;
import com.tin_project.repository.UserRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
public class UserController {

  @Autowired
  private UserRepositoryInterface repository;

  @GetMapping("users")
  public List<User> getUsers() {
    return this.repository.findAll();
  }

  @PostMapping("users")

  public void saveUser(@RequestBody User newUser){
    repository.save(newUser);

  }

  @GetMapping("/users/{id}")
  ResponseEntity<User> getOneUser(@PathVariable Long id) {
    User user = repository.findById(id).orElse(null);
    if (user instanceof User) return ResponseEntity.status(HttpStatus.OK).body(user);
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
  }

  @DeleteMapping("/users/{id}")
  ResponseEntity deleteOneUser(@PathVariable Long id) {
    User user = repository.findById(id).orElse(null);
    repository.delete(user);
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(null);
  }

  @PutMapping("/users/{id}")
  ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable long id) {
    User found = repository.findById(id).orElse(null);
    if(found == null) return ResponseEntity.notFound().build();
    user.setId(found.getId());
    return ResponseEntity.ok().body(repository.save(user));
  }

}
