package com.tin_project.scraper;

import com.fasterxml.jackson.annotation.JsonProperty;

class Quote {
  @JsonProperty("NOK")
  public NOK nOK;

  public Quote() {

  }

  public Quote(NOK nOK) {
    this.nOK = nOK;
  }

  @Override
  public String toString() {
    return "Quote{" +
            "nOK=" + nOK +
            '}';
  }
}
