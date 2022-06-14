package com.tin_project.controller;

import com.tin_project.entity.Coin;
import com.tin_project.repository.CoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
public class CoinController {

  @Autowired
  private CoinRepository coinRepository;

  @GetMapping("/coins")
  public List<Coin> scrapedCoins(){
    return this.coinRepository.findAll();
  }

  @GetMapping("/coins/{date}")
  public List<Coin> scrapedCoins(@PathVariable String date){

    List<Coin> coins = this.coinRepository.findAll();

    List<Coin> coinsWithCorrectDate = new ArrayList<>();

    for (Coin coin: coins){
      if(coin.getDate().equals(date))coinsWithCorrectDate.add(coin);
    }
    return coinsWithCorrectDate;
  }


}
