package com.tin_project.controller;

import com.tin_project.entity.History;
import com.tin_project.entity.User;
import com.tin_project.models.AuthenticationRequest;
import com.tin_project.models.AuthenticationResponse;
import com.tin_project.repository.UserRepository;
import com.tin_project.services.MyUserDetailsService;
import com.tin_project.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class TestController {


  @Autowired
  UserRepository repository;

  @Autowired
  private AuthenticationManager authenticationManager;

  @Autowired
  private JwtUtil jwtTokenUtil;

  @Autowired
  private MyUserDetailsService userDetailsService;

  @GetMapping("/testNumbers")
  public List<Integer> testInts() {
    return new ArrayList<>(Arrays.asList(1, 17, 1, 66, 12,4));
  }

  @GetMapping("/testHistory")
  public List<History> testHistory() {
    return new ArrayList<>(Arrays.asList(
            new History("Bitcoin",20000,"2022.01.01"),
            new History("Bitcoin",30000,"2022.01.02"),
            new History("Bitcoin",15000,"2022.01.03"),
            new History("Bitcoin",18000,"2022.01.04"),
            new History("Bitcoin",21000,"2022.01.05"),
            new History("Bitcoin",50000,"2022.01.06"),
            new History("Bitcoin",11000,"2022.01.07"),
            new History("Bitcoin",70000,"2022.01.08"),
            new History("Bitcoin",10000,"2022.01.09")
            ));
  }

  @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
  public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {

    try {
      authenticationManager.authenticate(
              new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
      );
    }
    catch (BadCredentialsException e) {
      throw new Exception("Incorrect username or password", e);
    }


    final UserDetails userDetails = userDetailsService
            .loadUserByUsername(authenticationRequest.getUsername());

    final String jwt = jwtTokenUtil.generateToken(userDetails);

    return ResponseEntity.ok(new AuthenticationResponse(jwt));
  }

  @PostMapping("/register")
  public User register(@RequestBody User user){

    repository.save(user);

    return  user;
  }
}
