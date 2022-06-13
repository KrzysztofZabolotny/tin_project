package com.tin_project.model;

public class History {
  private String coinName;
  private double coinPrice;
  private String priceDate;


  public History() {
  }

  public History(String coinName, double coinPrice, String priceDate) {
    this.coinName = coinName;
    this.coinPrice = coinPrice;
    this.priceDate = priceDate;
  }

  public String getCoinName() {
    return coinName;
  }

  public void setCoinName(String coinName) {
    this.coinName = coinName;
  }

  public double getCoinPrice() {
    return coinPrice;
  }

  public void setCoinPrice(double coinPrice) {
    this.coinPrice = coinPrice;
  }

  public String getPriceDate() {
    return priceDate;
  }

  public void setPriceDate(String priceDate) {
    this.priceDate = priceDate;
  }
}
