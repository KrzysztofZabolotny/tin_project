package com.tin_project.scraper;

import java.util.Date;

class NOK {
  public double price;
  public double volume_24h;
  public double volume_change_24h;
  public double percent_change_1h;
  public double percent_change_24h;
  public double percent_change_7d;
  public double percent_change_30d;
  public double percent_change_60d;
  public double percent_change_90d;
  public double market_cap;
  public double market_cap_dominance;
  public double fully_diluted_market_cap;
  public Date last_updated;

  public NOK() {
  }

  public NOK(double price, double volume_24h, double volume_change_24h, double percent_change_1h, double percent_change_24h, double percent_change_7d, double percent_change_30d, double percent_change_60d, double percent_change_90d, double market_cap, double market_cap_dominance, double fully_diluted_market_cap, Date last_updated) {
    this.price = price;
    this.volume_24h = volume_24h;
    this.volume_change_24h = volume_change_24h;
    this.percent_change_1h = percent_change_1h;
    this.percent_change_24h = percent_change_24h;
    this.percent_change_7d = percent_change_7d;
    this.percent_change_30d = percent_change_30d;
    this.percent_change_60d = percent_change_60d;
    this.percent_change_90d = percent_change_90d;
    this.market_cap = market_cap;
    this.market_cap_dominance = market_cap_dominance;
    this.fully_diluted_market_cap = fully_diluted_market_cap;
    this.last_updated = last_updated;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public double getVolume_24h() {
    return volume_24h;
  }

  public void setVolume_24h(double volume_24h) {
    this.volume_24h = volume_24h;
  }

  public double getVolume_change_24h() {
    return volume_change_24h;
  }

  public void setVolume_change_24h(double volume_change_24h) {
    this.volume_change_24h = volume_change_24h;
  }

  public double getPercent_change_1h() {
    return percent_change_1h;
  }

  public void setPercent_change_1h(double percent_change_1h) {
    this.percent_change_1h = percent_change_1h;
  }

  public double getPercent_change_24h() {
    return percent_change_24h;
  }

  public void setPercent_change_24h(double percent_change_24h) {
    this.percent_change_24h = percent_change_24h;
  }

  public double getPercent_change_7d() {
    return percent_change_7d;
  }

  public void setPercent_change_7d(double percent_change_7d) {
    this.percent_change_7d = percent_change_7d;
  }

  public double getPercent_change_30d() {
    return percent_change_30d;
  }

  public void setPercent_change_30d(double percent_change_30d) {
    this.percent_change_30d = percent_change_30d;
  }

  public double getPercent_change_60d() {
    return percent_change_60d;
  }

  public void setPercent_change_60d(double percent_change_60d) {
    this.percent_change_60d = percent_change_60d;
  }

  public double getPercent_change_90d() {
    return percent_change_90d;
  }

  public void setPercent_change_90d(double percent_change_90d) {
    this.percent_change_90d = percent_change_90d;
  }

  public double getMarket_cap() {
    return market_cap;
  }

  public void setMarket_cap(double market_cap) {
    this.market_cap = market_cap;
  }

  public double getMarket_cap_dominance() {
    return market_cap_dominance;
  }

  public void setMarket_cap_dominance(double market_cap_dominance) {
    this.market_cap_dominance = market_cap_dominance;
  }

  public double getFully_diluted_market_cap() {
    return fully_diluted_market_cap;
  }

  public void setFully_diluted_market_cap(double fully_diluted_market_cap) {
    this.fully_diluted_market_cap = fully_diluted_market_cap;
  }

  public Date getLast_updated() {
    return last_updated;
  }

  public void setLast_updated(Date last_updated) {
    this.last_updated = last_updated;
  }

  @Override
  public String toString() {
    return "NOK{" +
            "price=" + price +
            ", volume_24h=" + volume_24h +
            ", volume_change_24h=" + volume_change_24h +
            ", percent_change_1h=" + percent_change_1h +
            ", percent_change_24h=" + percent_change_24h +
            ", percent_change_7d=" + percent_change_7d +
            ", percent_change_30d=" + percent_change_30d +
            ", percent_change_60d=" + percent_change_60d +
            ", percent_change_90d=" + percent_change_90d +
            ", market_cap=" + market_cap +
            ", market_cap_dominance=" + market_cap_dominance +
            ", fully_diluted_market_cap=" + fully_diluted_market_cap +
            ", last_updated=" + last_updated +
            '}';
  }


}
