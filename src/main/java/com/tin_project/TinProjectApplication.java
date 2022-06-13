package com.tin_project;

import com.tin_project.model.User;
import com.tin_project.repository.UserRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@CrossOrigin(origins = "http://localhost:3000/")
@SpringBootApplication
public class TinProjectApplication implements CommandLineRunner {


//  @Bean
//  public WebMvcConfigurer corsConfigurer() {
//    return new WebMvcConfigurer() {
//      @Override
//      public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/users").allowedOrigins("http://localhost:3000");
//      }
//    };
//  }
  @Autowired
  private UserRepositoryInterface userRepositoryInterface;

  public static void main(String[] args) {
    SpringApplication.run(TinProjectApplication.class, args);
  }


  //TODO populate the DB with all necessary entities for the project
  @Override
  public void run(String... args){

//    this.userRepositoryInterface.save(new User("Chris@wp.pl", "password1"));
//    this.userRepositoryInterface.save(new User("Natalia@wp.pl", "password2"));
//    this.userRepositoryInterface.save(new User("Tadeusz@wp.pl", "password3"));


  }
}
