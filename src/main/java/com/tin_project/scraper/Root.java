package com.tin_project.scraper;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;


public class Root {
  public ArrayList<Data> data;

  public Root() {
  }

  public Root(ArrayList<Data> data) {

    this.data = data;
  }
}


