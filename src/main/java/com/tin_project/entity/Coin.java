package com.tin_project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Coin implements Comparable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private String symbol;
  private double price;
  private String date;
  private String currency;

  public Coin(){

  }

  public Coin(String name, String symbol, double price, String currency) {
    this.name = name;
    this.symbol = symbol;
    this.price = price;
    this.currency = currency;
    this.setDate();
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

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public String getDate() {
    return date;
  }

  public void setDate() {
    String pattern = "yyyy.MM.dd";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    this.date = simpleDateFormat.format(new Date());
  }

  public double getPrice() {
    return BigDecimal.valueOf(price)
            .setScale(5, RoundingMode.HALF_UP)
            .doubleValue();
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  @Override
  public int compareTo(Object o) {
    String s = (String) o;
    return this.name.compareTo(s);
  }
}
