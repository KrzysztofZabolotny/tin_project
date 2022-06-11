package com.tin_project.scraper;

import java.util.ArrayList;
import java.util.Date;

class Data {
  public long id;
  public String name;
  public String symbol;
  public String slug;
  public long num_market_pairs;
  public Date date_added;
  public ArrayList<String> tags;
  public long max_supply;
  public long circulating_supply;
  public long total_supply;
  public Object platform;
  public long cmc_rank;
  public Object self_reported_circulating_supply;
  public Object self_reported_market_cap;
  public Date last_updated;
  public Quote quote;

  public Data() {
  }

  public Data(long id, String name, String symbol, String slug, long num_market_pairs, Date date_added, ArrayList<String> tags, long max_supply, long circulating_supply, long total_supply, Object platform, long cmc_rank, Object self_reported_circulating_supply, Object self_reported_market_cap, Date last_updated, Quote quote) {
    this.id = id;
    this.name = name;
    this.symbol = symbol;
    this.slug = slug;
    this.num_market_pairs = num_market_pairs;
    this.date_added = date_added;
    this.tags = tags;
    this.max_supply = max_supply;
    this.circulating_supply = circulating_supply;
    this.total_supply = total_supply;
    this.platform = platform;
    this.cmc_rank = cmc_rank;
    this.self_reported_circulating_supply = self_reported_circulating_supply;
    this.self_reported_market_cap = self_reported_market_cap;
    this.last_updated = last_updated;
    this.quote = quote;
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

  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public long getNum_market_pairs() {
    return num_market_pairs;
  }

  public void setNum_market_pairs(long num_market_pairs) {
    this.num_market_pairs = num_market_pairs;
  }

  public Date getDate_added() {
    return date_added;
  }

  public void setDate_added(Date date_added) {
    this.date_added = date_added;
  }

  public ArrayList<String> getTags() {
    return tags;
  }

  public void setTags(ArrayList<String> tags) {
    this.tags = tags;
  }

  public long getMax_supply() {
    return max_supply;
  }

  public void setMax_supply(long max_supply) {
    this.max_supply = max_supply;
  }

  public long getCirculating_supply() {
    return circulating_supply;
  }

  public void setCirculating_supply(long circulating_supply) {
    this.circulating_supply = circulating_supply;
  }

  public long getTotal_supply() {
    return total_supply;
  }

  public void setTotal_supply(long total_supply) {
    this.total_supply = total_supply;
  }

  public Object getPlatform() {
    return platform;
  }

  public void setPlatform(Object platform) {
    this.platform = platform;
  }

  public long getCmc_rank() {
    return cmc_rank;
  }

  public void setCmc_rank(long cmc_rank) {
    this.cmc_rank = cmc_rank;
  }

  public Object getSelf_reported_circulating_supply() {
    return self_reported_circulating_supply;
  }

  public void setSelf_reported_circulating_supply(Object self_reported_circulating_supply) {
    this.self_reported_circulating_supply = self_reported_circulating_supply;
  }

  public Object getSelf_reported_market_cap() {
    return self_reported_market_cap;
  }

  public void setSelf_reported_market_cap(Object self_reported_market_cap) {
    this.self_reported_market_cap = self_reported_market_cap;
  }

  public Date getLast_updated() {
    return last_updated;
  }

  public void setLast_updated(Date last_updated) {
    this.last_updated = last_updated;
  }

  public Quote getQuote() {
    return quote;
  }

  public void setQuote(Quote quote) {
    this.quote = quote;
  }

  @Override
  public String toString() {
    return "Data{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", symbol='" + symbol + '\'' +
            ", slug='" + slug + '\'' +
            ", num_market_pairs=" + num_market_pairs +
            ", date_added=" + date_added +
            ", tags=" + tags +
            ", max_supply=" + max_supply +
            ", circulating_supply=" + circulating_supply +
            ", total_supply=" + total_supply +
            ", platform=" + platform +
            ", cmc_rank=" + cmc_rank +
            ", self_reported_circulating_supply=" + self_reported_circulating_supply +
            ", self_reported_market_cap=" + self_reported_market_cap +
            ", last_updated=" + last_updated +
            ", quote=" + quote +
            '}';
  }
}
