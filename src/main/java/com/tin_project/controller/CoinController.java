package com.tin_project.controller;

import com.tin_project.model.Coin;
import com.tin_project.repository.CoinRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
public class CoinController {

  @Autowired
  private CoinRepositoryInterface coinRepositoryInterface;

  @GetMapping("/coins")
  public List<Coin> scrapedCoins() {
    return this.coinRepositoryInterface.findAll();
  }

  @GetMapping("/coins/{date}")
  public List<Coin> scrapedCoinsByDate(@PathVariable String date) {

    List<Coin> coins = this.coinRepositoryInterface.findAll();

    List<Coin> coinsWithCorrectDate = new ArrayList<>();

    for (Coin coin : coins) {
      if (coin.getDate().equals(date)) coinsWithCorrectDate.add(coin);
    }
    return coinsWithCorrectDate;
  }

  @GetMapping("/coins/available-coins")
  public List<CoinName> getAvailableCoins() {

    return coinRepositoryInterface.findAll()
            .stream()
            .filter(c -> c.getId() != 0)
            .map(c -> new CoinName(c.getId(), c.getName()))
            .collect(Collectors.toList());

  }


}

class CoinName {
  long id;
  String name;

  public CoinName() {
  }

  public CoinName(long id, String name) {
    this.id = id;
    this.name = name;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
