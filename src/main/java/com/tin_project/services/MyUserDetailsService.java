package com.tin_project.services;

import com.tin_project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyUserDetailsService implements UserDetailsService {

  @Autowired
  UserRepository userRepository;

  @Override
  public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

   List<com.tin_project.entity.User> allUsers = userRepository.findAll();

    com.tin_project.entity.User user = new com.tin_project.entity.User();
   for (com.tin_project.entity.User u: allUsers){
     System.out.println(u.getUsername() + " " + u.getPassword());
     if (u.getUsername().equals(userName)) user = u;
   }
    System.out.println("Username " + userName);
    System.out.println("Found user" + user.getUsername() + " " + user.getPassword());
    return new User(user.getUsername(),user.getPassword(),new ArrayList<>());//TODO change to my user




  }
}
