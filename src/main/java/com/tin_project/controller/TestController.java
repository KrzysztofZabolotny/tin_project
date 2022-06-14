package com.tin_project.controller;

import com.tin_project.entity.History;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
public class TestController {

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

}
