package com.tin_project;

import com.tin_project.entity.User;
import com.tin_project.repository.CoinRepository;
import com.tin_project.repository.UserRepository;
import com.tin_project.scraper.CoinScraper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:3000/")
@SpringBootApplication
public class TinProjectApplication implements CommandLineRunner {

  @Autowired
  private UserRepository userRepository;

  public static void main(String[] args) {
    SpringApplication.run(TinProjectApplication.class, args);
  }


  //TODO populate the DB with all necessary entities
  @Override
  public void run(String... args) throws Exception {

    this.userRepository.save(new User("Chris", "Zabolotny"));
    this.userRepository.save(new User("Natalia", "Zabolotna"));
    this.userRepository.save(new User("Tadeusz", "Zabolotny"));


  }
}
