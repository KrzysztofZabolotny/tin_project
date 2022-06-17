package com.tin_project.controller;

import com.tin_project.entity.User;
import com.tin_project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
public class UserController {

  @Autowired
  private UserRepository repository;

  @GetMapping("users")
  public List<User> getUsers() {

    return this.repository.findAll();

  }

  @GetMapping("populateUsers/{number}")
  public String populateUsers(@PathVariable int number) {

    for (int i = 0; i < number; i++) {
      int name = (int) (Math.random() * number);
      this.repository.save(new User("Name" + name, "Surname" + name));
    }
    return "saved";
  }

  @PostMapping("/register")
  public User register(@RequestBody User user) {

    repository.save(user);

    return user;
  }
}
