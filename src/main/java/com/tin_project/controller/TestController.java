package com.tin_project.controller;

import com.tin_project.model.History;
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
            new History("Bitcoin",22731,"2022.01.09"),
            new History("Bitcoin",17738,"2022.01.10"),
            new History("Bitcoin",19999,"2022.01.11"),
            new History("Bitcoin",11992,"2022.01.12"),
            new History("Bitcoin",17657,"2022.01.13"),
            new History("Bitcoin",33987,"2022.01.14"),
            new History("Bitcoin",12983,"2022.01.15"),
            new History("Bitcoin",57328,"2022.01.16"),
            new History("Bitcoin",12398,"2022.01.17"),
            new History("Bitcoin",73664,"2022.01.18"),
            new History("Bitcoin",12398,"2022.01.19"),
            new History("Bitcoin",52398,"2022.01.20"),
            new History("Bitcoin",12398,"2022.01.21"),
            new History("Bitcoin",22398,"2022.01.22"),
            new History("Bitcoin",32398,"2022.01.23"),
            new History("Bitcoin",82398,"2022.01.24"),
            new History("Bitcoin",42398,"2022.01.25"),
            new History("Bitcoin",22398,"2022.01.26"),
            new History("Bitcoin",92398,"2022.01.27"),
            new History("Bitcoin",22398,"2022.01.28"),
            new History("Bitcoin",52398,"2022.01.29"),
            new History("Bitcoin",62398,"2022.01.30")

            ));
  }

}
